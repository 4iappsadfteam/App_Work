package fusion.pm.view.backing.Fragment;


import java.util.List;

import com.sun.el.parser.ParseException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.IOException;
import java.io.InputStream;

import java.text.DecimalFormat;

import java.util.ArrayList;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.myfaces.trinidad.model.CollectionModel;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;


import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;


public class ExcelDataUpload {
    public ExcelDataUpload() {
        super();
    }
    
    
//    DecimalFormat df = new DecimalFormat("");
    
    public String readExcelSellSheet(InputStream xlsx, RichTable t1, ViewObject mainCategoryVO) throws IOException,InvalidFormatException,ParseException {
        org.apache.poi.ss.usermodel.Workbook workbook = null;
        List<String> errorRows = new ArrayList<String>();
        String rowNum=null;
        String excelStatus="N";
        int errorCount=0;
        int sheetIndex = 0;  
        if (sheetIndex == 0) {
            CollectionModel cModel = (CollectionModel)t1.getValue();
            JUCtrlHierBinding tableBinding = (JUCtrlHierBinding)cModel.getWrappedData();        
            DCIteratorBinding iter = tableBinding.getDCIteratorBinding();
            try {  
                   workbook = WorkbookFactory.create(xlsx);
                 } catch (Exception e) {
                        System.err.println("Exception in Line Workbook : " + e);
                 }
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(sheetIndex);
            Integer skipRw = 1;
            Integer skipcnt = 1;
            int columnCount = 0;
            Integer totalNumberofRows = 0;
            System.out.println("---Excel Row Count--"+sheet.getPhysicalNumberOfRows());
            //Iterate over excel rows
            for (org.apache.poi.ss.usermodel.Row tempRow : sheet) {
              totalNumberofRows=sheet.getPhysicalNumberOfRows()-1;
                System.err.println("--Total Number of Rows in excel sheet"+totalNumberofRows);
                if (skipcnt == 1) {
                      columnCount = tempRow.getPhysicalNumberOfCells();
                  }
                if (skipcnt > skipRw) { //skip first row and start from 2 row .
                String flag="F";
                //Create new row in table
                    ADFUtils.findOperation("CreateInsert").execute();
                    System.err.println("New Line Row Added");
                    oracle.jbo.Row activityRow =iter.getNavigatableRowIterator().getCurrentRow();            
                
                int Index = 0; //Iterate over row's columns
                for (int column = 0; column < columnCount; column++) {
                Cell MytempCell = tempRow.getCell(column);
                    if (MytempCell != null) {
                            Index = MytempCell.getColumnIndex();
                       } else {
                             //Index++;
                             }
                    try {
                            if(Index==0){
                                if(MytempCell!=null){
                                        switch(MytempCell.getCellType()){
                                            case 1:
                                                mainCategoryVO.setNamedWhereClauseParam("BV_SUB_CATEGORY", MytempCell.getStringCellValue());
                                                mainCategoryVO.executeQuery();
                                                if(mainCategoryVO.getEstimatedRowCount()!=0){
                                                    activityRow.setAttribute("AssetMainCat", mainCategoryVO.first().getAttribute("MainCategory"));
                                                    activityRow.setAttribute("SubCategoryId", mainCategoryVO.first().getAttribute("CategoryId"));
                                                    activityRow.setAttribute("AssetSubCat", MytempCell.getStringCellValue());
                                                }else{
                                                   System.err.println("Date Not Found-->"); 
                                                flag="T";    
                                                }
                                            break;
                                            case 0:
                                                mainCategoryVO.setNamedWhereClauseParam("BV_SUB_CATEGORY", MytempCell.getNumericCellValue());
                                                mainCategoryVO.executeQuery();
                                                if(mainCategoryVO.getEstimatedRowCount()!=0){
                                                    activityRow.setAttribute("AssetMainCat", mainCategoryVO.first().getAttribute("MainCategory"));
                                                    activityRow.setAttribute("SubCategoryId", mainCategoryVO.first().getAttribute("CategoryId"));
                                                    activityRow.setAttribute("AssetSubCat", MytempCell.getNumericCellValue());
                                                }else{
                                                   System.err.println("Date Not Found-->"); 
                                                  flag="T"; 
                                                }
                                            break;
                                            }
                                            System.err.println("==Cell 0==>"+activityRow.getAttribute("AssetSubCat")); 
                                }else{
                                            System.err.println("!!!!!!!!!AssetSubCat is blank!!!!!!!!!");
                                            
//                                          if(rowNum==null){
//                                          rowNum="Row: "+skipcnt;
//                                          errorCount=errorCount+1;
//                                          }else{
//                                          rowNum=rowNum+", Row: "+skipcnt;
//                                          errorCount=errorCount+1;
//                                          }
                                      }
                          }else if(Index==1){
                               if(MytempCell!=null){
//                                  System.out.println("getCellType 1===>>"+MytempCell.getCellType());
                                        switch(MytempCell.getCellType()){
                                            case 1:
                                                activityRow.setAttribute("ActivityHours", MytempCell.getStringCellValue());
                                            break;
                                            case 0:
                                                activityRow.setAttribute("ActivityHours", MytempCell.getNumericCellValue());
                                            break;
                                            }
                                            System.err.println("==Cell 1==>"+activityRow.getAttribute("ActivityHours")); 
                                    }else{
                                            System.err.println("!!!!!!!!!ActivityHours is blank!!!!!!!!!");
        //                                  if(rowNum==null){
        //                                  rowNum="Row: "+skipcnt;
        //                                  errorCount=errorCount+1;
        //                                  }else{
        //                                  rowNum=rowNum+", Row: "+skipcnt;
        //                                  errorCount=errorCount+1;
        //                                  } 
                                            }
                           }else if(Index==2){
                                     if(MytempCell!=null){
//                                          System.out.println("getCellType 2===>>"+MytempCell.getCellType());
                                        switch(MytempCell.getCellType()){
                                            case 1:
                                                activityRow.setAttribute("GroupName", MytempCell.getStringCellValue());
                                            break;
                                            case 0:
                                                activityRow.setAttribute("GroupName", MytempCell.getNumericCellValue());
                                            break;
                                            }
                                            System.err.println("==cell 2==>"+activityRow.getAttribute("GroupName")); 
                                  }else{
                                        System.err.println("!!!!!!!!!ProjectNumber is blank!!!!!!!!!");
        //                                  if(rowNum==null){
        //                                  rowNum="Row: "+skipcnt;
        //                                  errorCount=errorCount+1;
        //                                  }else{
        //                                  rowNum=rowNum+", Row: "+skipcnt;
        //                                  errorCount=errorCount+1;
        //                                  } 
                                    }
                           }else if(Index==3){
                                          if(MytempCell!=null){
//                                        System.out.println("getCellType 3===>>"+MytempCell.getCellType());
                                          switch(MytempCell.getCellType()){
                                            case 1: 
                                                activityRow.setAttribute("ActivityList", MytempCell.getStringCellValue());
                                            break;
                                            case 0:
                                                activityRow.setAttribute("ActivityList", MytempCell.getNumericCellValue());
                                            break;
                                            }
                                            // task Id
                                            System.err.println("==Cell 3==>"+activityRow.getAttribute("ActivityList")); 
                                 }else{
                                          System.err.println("!!!!!!!!!Task number is blank!!!!!!!!!");
//                                          if(rowNum==null){
//                                          rowNum="Row: "+skipcnt;
//                                          errorCount=errorCount+1;
//                                          }else{
//                                          rowNum=rowNum+", Row: "+skipcnt;
//                                          errorCount=errorCount+1;
//                                          } 
                                            }
                                            }
                        
                        }catch(Exception e){
                                System.err.println("Exception Occured at Line & column position is.... " +Index);
                                e.printStackTrace();
                    }
                            
                } // one row completed 
                if(flag.equalsIgnoreCase("T")){
                    activityRow.remove(); 
                }
            } ////skip first n row for labels.
                
    //                String errorStr=ADFContext.getCurrent().getSessionScope().get("error")==null?"":ADFContext.getCurrent().getSessionScope().get("error").toString();
    //                if("error".equalsIgnoreCase(errorStr)){
    //                    errorRows.add(skipcnt+",");
    //                }
                if(totalNumberofRows>=skipcnt){
                    skipcnt++;        
                }
            System.err.println("Sheet ROW--"+skipcnt);
          }
           /* 
                for (String temp : errorRows) {
                    System.out.println("Error ROw---"+temp);
                    JSFUtils.addFacesErrorMessage("Please provide correct values in Row "+temp);
                } 
           */
//            if(errorCount!=0){
//                JSFUtils.addFacesErrorMessage("Please provide correct values in "+rowNum);   
//            }
            AdfFacesContext.getCurrentInstance().addPartialTarget(t1);    
            JSFUtils.addFacesInformationMessage("Line Added Successfully");
//            ADFUtils.findOperation("Commit").execute();
           excelStatus="Y";  
       }
      return excelStatus;  
    }


    
        
}

