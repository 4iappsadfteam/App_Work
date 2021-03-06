package backing;

import Utils.ADFUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;


public class DownlaodExcel {
    public DownlaodExcel() {
        super();
    }
    ViewObject contractLineVO= ADFUtils.findIterator("XxscContractLinesVO1Iterator").getViewObject();
    
    ViewObject downloadTaskVO= ADFUtils.findIterator("excelDownloadProjectTaskROVO1Iterator").getViewObject();
    ViewObject downloadUOMVO= ADFUtils.findIterator("excelDownloadUOMROVO1Iterator").getViewObject();
    
    
    
    public String  downlaodExcel(String cname) throws FileNotFoundException,
                                                     IOException {
       // String filename = "C:/"+cname+".xls" ;
        
        String path=new File("").getAbsolutePath();
        System.err.println("path======>"+path);
//        String basePath=path+cname+".xls";
        
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("ContractLines");
        
        HSSFRow rowhead = sheet.createRow((short)0);
        //rowhead.createCell(0).setCellValue("S.No");
        rowhead.createCell(0).setCellValue("Task Number");
        rowhead.createCell(1).setCellValue("Requisition Number");
        rowhead.createCell(2).setCellValue("ReqLineNumber");
        rowhead.createCell(3).setCellValue("Item Description");
        rowhead.createCell(4).setCellValue("BOQ Item Description");
        rowhead.createCell(5).setCellValue("UOM");
        rowhead.createCell(6).setCellValue("Quantity");
        rowhead.createCell(7).setCellValue("Unit Price");
       
        int i=1;
        RowSetIterator rs=contractLineVO.createRowSetIterator(null);
        while(rs.hasNext()){
          Row contractLineRow = rs.next();
          String tid=contractLineRow.getAttribute("TaskId")==null?"":contractLineRow.getAttribute("TaskId").toString();
          String tnum=contractLineRow.getAttribute("TaskNumber")==null?"":contractLineRow.getAttribute("TaskNumber").toString();
          String  reqId=contractLineRow.getAttribute("ReqHdrId")==null?"":contractLineRow.getAttribute("ReqHdrId").toString();
          String  reqNum=contractLineRow.getAttribute("ReqNumber")==null?"":contractLineRow.getAttribute("ReqNumber").toString();
          String  reqLNum=contractLineRow.getAttribute("ReqLineNumber")==null?"":contractLineRow.getAttribute("ReqLineNumber").toString();
          String  ItemDesc=contractLineRow.getAttribute("ItemDescription")==null?"":contractLineRow.getAttribute("ItemDescription").toString();
          String  BoQ=contractLineRow.getAttribute("BoqItemDesc")==null?"":contractLineRow.getAttribute("BoqItemDesc").toString();
          String  Uom=contractLineRow.getAttribute("Uom")==null?"":contractLineRow.getAttribute("Uom").toString();
          float  Qty=contractLineRow.getAttribute("OrigQuantity")==null?0:Float.parseFloat(contractLineRow.getAttribute("OrigQuantity").toString());
          float  Prz=contractLineRow.getAttribute("OrigUnitPrice")==null?0:Float.parseFloat(contractLineRow.getAttribute("OrigUnitPrice").toString());
          float  amt=contractLineRow.getAttribute("OrigAmount")==null?0:Float.parseFloat(contractLineRow.getAttribute("OrigAmount").toString());
            
        System.err.println(tid+"--"+tnum+"--"+reqId+"--"+reqNum+"--"+reqLNum+"--"+ItemDesc+"--"+BoQ+"--"+Uom+"--"+Qty+"--"+Prz);
    
         HSSFRow row = sheet.createRow((short)i);
          //row.createCell(0).setCellValue(tname);    
            row.createCell(0).setCellValue(getTaskname(tid, tnum)); 
            row.createCell(1).setCellValue(reqNum); 
            row.createCell(2).setCellValue(reqLNum); 
            row.createCell(3).setCellValue(ItemDesc); 
            row.createCell(4).setCellValue(BoQ); 
            row.createCell(5).setCellValue(getUOM(Uom)); 
            row.createCell(6).setCellValue(Qty);
            row.createCell(7).setCellValue(Prz);
            
           i++;
           System.err.println("I value=="+i); 
          }
        FileOutputStream fileOut = new FileOutputStream(new File(cname+".xls"));
        workbook.write(fileOut);
        fileOut.close();
        System.out.println("Your excel file has been generated!"+path);
        String filepath=path+"/"+cname+".xls";
        System.err.println("--filepath--"+filepath);
   
    return path;
    }
    
    
   
    public String getTaskname(String tid, String tnumber){
        String  taskName=null;
        ViewObjectImpl vo =(ViewObjectImpl)downloadTaskVO;
        ViewCriteria vc =vo.getViewCriteria("excelDownloadProjectTask");
        vo.applyViewCriteria(vc);
        vo.setNamedWhereClauseParam("BV_TID",tid);
        vo.setNamedWhereClauseParam("BV_TASKNUM",tnumber);
        vo.executeQuery();  
        System.err.println("COUNT--TASK--" +vo.getEstimatedRowCount());   
        if (vo.getEstimatedRowCount() == 1){
            taskName =vo.first().getAttribute("Name") ==null ? null :vo.first().getAttribute("Name").toString();  
            System.err.println("==="+taskName);
        }
       return taskName;
    }
    
    
    public String getUOM(String Ucode){
        String  UOMDesc=null;
        ViewObjectImpl vo =(ViewObjectImpl)downloadUOMVO;
        ViewCriteria vc =vo.getViewCriteria("excelDownloadUOM");
        vo.applyViewCriteria(vc);
        vo.setNamedWhereClauseParam("BV_CODE",Ucode);
        vo.executeQuery();  
        System.err.println("COUNT--UOM--" +vo.getEstimatedRowCount());   
        if (vo.getEstimatedRowCount() == 1){
            UOMDesc =vo.first().getAttribute("Description") ==null ? null :vo.first().getAttribute("Description").toString();  
            System.err.println("==="+UOMDesc);
        }
       return UOMDesc;
    }
    
    
    
    
    
    
    
}