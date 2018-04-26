package Utils;

import java.sql.SQLException;

import oracle.adf.share.ADFContext;

import oracle.jbo.server.ApplicationModuleImpl;

import oracle.jdbc.OracleTypes;

public class ADFApproval {
    public ADFApproval() {
        super();
    }
    private static Object[][] dobProcArgs = null;
    
    
    public static String invokeSubmitPkg(String submitPkg, Object func_id, Object ref_id, Object level_no, String tableName, String app_status_column, String pk_column) throws SQLException{
           
           String flag=null;
           String pkgMethod="call "+submitPkg+"(?,?,?,?,?,?,?,?,?)";
           oracle.jbo.domain.Number p_func_id = new oracle.jbo.domain.Number(func_id.toString());
           oracle.jbo.domain.Number p_ref_id  = new oracle.jbo.domain.Number(ref_id.toString());
           oracle.jbo.domain.Number p_level_no= new oracle.jbo.domain.Number(level_no.toString());
           String p_table_name   = tableName;
           String p_app_status_column  = app_status_column; 
           String p_pk_column= pk_column;
           String p_flow_with=null;
           String p_err_code     = null;
           String p_err_msg      = null;
           System.err.println("submitPkg==>"+submitPkg+"p_func_id==>"+p_func_id+"p_ref_id==>"+p_ref_id+"p_level_no==>"+p_level_no+"p_table_name==>"+p_table_name+"p_app_status_column==>"+p_app_status_column+"p_pk_column==>"+p_pk_column);
           
           ApplicationModuleImpl am=(ApplicationModuleImpl)view.backing.ADFUtils.getApplicationModuleForDataControl(null); 
           
           dobProcArgs = new Object[][]{ { "IN",  p_func_id             , OracleTypes.NUMBER },        //0
                                         { "IN",  p_ref_id              , OracleTypes.NUMBER },        //1
                                         { "IN",  p_level_no            , OracleTypes.NUMBER },    //2
                                         { "IN",  p_table_name          , OracleTypes.VARCHAR},        //3
                                         { "IN",  p_app_status_column   , OracleTypes.VARCHAR },       //4
                                         { "IN",  p_pk_column           , OracleTypes.VARCHAR },       //5
                                         { "OUT", p_flow_with           , OracleTypes.VARCHAR },       //6
                                         { "OUT", p_err_code            , OracleTypes.VARCHAR },       //7
                                         { "OUT", p_err_msg             , OracleTypes.VARCHAR },       //8
                                         };  
           
           try {
                   DBUtils.callDBStoredProcedure(am.getDBTransaction(), pkgMethod, dobProcArgs);
                   flag = (String)dobProcArgs[8][1];    
                   p_flow_with=(String)dobProcArgs[6][1];    
                   ADFContext.getCurrent().getSessionScope().put("flow_with", p_flow_with);
                   
               } catch (SQLException e) {
                   flag = (String)dobProcArgs[8][1];
           }
           return flag;
       }
    
   
    
    
    public static String invokeResponsePkg(String responsePkg, Object func_id, Object ref_id, Object level_no, Object appr_id, String response, String ar_status, Object fwd_to, 
                                           String tableName, String status_column, String pk_column) throws SQLException{
           String flag=null;
           String pkgMethod="call "+responsePkg+"(?,?,?,?,?,?,?,?,?,?,?,?)";
           
           
           oracle.jbo.domain.Number p_func_id = new oracle.jbo.domain.Number(func_id.toString());
           oracle.jbo.domain.Number p_ref_id  = new oracle.jbo.domain.Number(ref_id.toString());
           oracle.jbo.domain.Number p_level_no= new oracle.jbo.domain.Number(level_no.toString());
           oracle.jbo.domain.Number p_appr_id = new oracle.jbo.domain.Number(appr_id.toString());
           String p_response=response;
           String p_ar_status=ar_status;
           oracle.jbo.domain.Number p_fwd_to  = new oracle.jbo.domain.Number(fwd_to.toString());
           String p_table_name=tableName;
           String p_status_column=status_column;
           String p_pk_column=pk_column;
           String p_err_code=null;
           String p_err_msg=null;           
           
           ApplicationModuleImpl am=(ApplicationModuleImpl)view.backing.ADFUtils.getApplicationModuleForDataControl(null); 
           dobProcArgs = new Object[][]{ { "IN", p_func_id, OracleTypes.NUMBER },           //0
                                         { "IN", p_ref_id, OracleTypes.NUMBER },            //1
                                         { "IN", p_level_no, OracleTypes.NUMBER},           //2
                                         { "IN", p_appr_id, OracleTypes.NUMBER} ,           //3
                                         { "IN", p_response, OracleTypes.VARCHAR },         //4
                                         { "IN", p_ar_status, OracleTypes.VARCHAR },        //5
                                         { "IN", p_fwd_to, OracleTypes.NUMBER },            //6
                                         { "IN", p_table_name, OracleTypes.VARCHAR},        //7
                                         { "IN", p_status_column, OracleTypes.VARCHAR},     //8
                                         { "IN", p_pk_column, OracleTypes.VARCHAR} ,        //9
                                         { "OUT", p_err_code, OracleTypes.VARCHAR},         //10
                                         { "OUT", p_err_msg, OracleTypes.VARCHAR}           //11                          
                                         }; 

           try {
               DBUtils.callDBStoredProcedure(am.getDBTransaction(), pkgMethod,
                                         dobProcArgs);
               
               } catch (SQLException e) {
           }
           
           flag = (String)dobProcArgs[11][1];
    
           return flag;
       }
    
    
    public static String submitMailPkg(String to ,String nameOfNofication,String noficationNumber,String User) throws SQLException{
           
           String  fromMail="sdl@sobha-me.com";
//         String  fromMail="naresco@eim.ae";
//           String  fromMail="info@nsccme.com";
           
//           to= "dineshkumar.p@4iapps.com,ananthakumar.gmr@4iapps.com, sundarrajan.v@4iapps.com,mahalingam.m@4iapps.com";
             to= "sundarrajan.v@4iapps.com,vijayakumar.r@4iapps.com,mahalingam.m@4iapps.com,dineshkumar.p@4iapps.com,karthikraj.r@sobha-me.com";

           String flag=null;
           String pkgMethod="call XXFND_UTIL_PKG.SUBMIT_MAIL (?,?,?,?,?,?,?)";
           String p_from  = fromMail; 
           String p_to    = to;
           String p_nameOfNofication= nameOfNofication;
           String p_noficationNumber= noficationNumber;
           String p_User= User;
           String p_err_code     = null;
           String p_err_msg      = null;
           
           ApplicationModuleImpl am=(ApplicationModuleImpl)view.backing.ADFUtils.getApplicationModuleForDataControl(null); 
           
           dobProcArgs = new Object[][]{ { "IN",  p_from                    , OracleTypes.VARCHAR},        //0
                                         { "IN",  p_to                      , OracleTypes.VARCHAR },       //1
                                         { "IN",  p_nameOfNofication        , OracleTypes.VARCHAR },       //2
                                         { "IN",  p_noficationNumber        , OracleTypes.VARCHAR},        //3
                                         { "IN",  p_User                    , OracleTypes.VARCHAR },       //4
                                         { "OUT", p_err_code                , OracleTypes.VARCHAR },       //5
                                         { "OUT", p_err_msg                 , OracleTypes.VARCHAR },       //6
                                         };  
           
           try {
                   DBUtils.callDBStoredProcedure(am.getDBTransaction(), pkgMethod, dobProcArgs);
                   flag = (String)dobProcArgs[6][1];    
               } catch (SQLException e) {
                   flag = (String)dobProcArgs[6][1];
           }
           return flag;
       }
   
    
}



