/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.po.fusion.view.backing;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Base64;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 *
 * @author Aravind
 */
public class soapUsingOkHttp {

    public static void main(String args[]) {
        try {
            OkHttpClient client = new OkHttpClient();

            String xmlData = "<soapenv:Envelope xmlns:draf=\"http://xmlns.oracle.com/apps/prc/po/editDocument/flex/draftPurchaseOrderDistribution/\" xmlns:draf1=\"http://xmlns.oracle.com/apps/prc/po/editDocument/flex/draftPurchasingDocumentSchedule/\" xmlns:draf2=\"http://xmlns.oracle.com/apps/prc/po/editDocument/flex/draftPurchasingDocumentLine/\" xmlns:draf3=\"http://xmlns.oracle.com/apps/prc/po/editDocument/flex/draftPurchasingDocumentHeader/\" xmlns:pjc=\"http://xmlns.oracle.com/apps/prc/po/commonPo/flex/PJCPoDraftDistribution/\" xmlns:pur=\"http://xmlns.oracle.com/apps/prc/po/editDocument/purchaseOrderServiceV2/\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:typ=\"http://xmlns.oracle.com/apps/prc/po/editDocument/purchaseOrderServiceV2/types/\">\n"
                    + "   <soapenv:Header>\n"
                    + "      <wsse:Security soapenv:mustUnderstand=\"1\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n"
                    + "         <wsu:Timestamp wsu:Id=\"TS-6A59631E3BEBB2C0E314992652407973\">\n"
                    + "      </wsse:Security>\n"
                    + "   </soapenv:Header><soapenv:Body>\n"
                    + "      <typ:createPurchaseOrder>\n"
                    + "<typ:createOrderEntry>\n"
                    + "<pur:DocumentStyleId>1</pur:DocumentStyleId>\n"
                    + "<pur:ConsignmentTermsEnabledFlag/>\n"
                    + "<pur:DocumentDescription>rr</pur:DocumentDescription>\n"
                    + "<pur:DocumentStyle/>\n"
                    + "<pur:ProcurementBusinessUnit>Emitac Healthcare Solutions</pur:ProcurementBusinessUnit>\n"
                    + "<pur:RequisitioningBusinessUnit>Emitac Healthcare Solutions</pur:RequisitioningBusinessUnit>\n"
                    + "<pur:SoldToLegalEntity>Emitac Healthcare Solutions LLC</pur:SoldToLegalEntity>\n"
                    + "<pur:SupplierContactEmail/>\n"
                    + "<pur:SupplierCommunicationMethodCode/>\n"
                    + "<pur:SupplierCommunicationMethod/>\n"
                    + "<pur:SupplierCommunicationEmail/>\n"
                    + "<pur:SupplierCommunicationFax/>\n"
                    + "<pur:BillToLocationId/>\n"
                    + "<pur:BillToLocationCode/>\n"
                    + "<pur:DefaultShipToLocationId>300000002426419</pur:DefaultShipToLocationId>\n"
                    + "<pur:DefaultShipToLocationCode/>\n"
                    + "<pur:CurrencyCode>AED</pur:CurrencyCode>\n"
                    + "<pur:InterfaceSourceCode>CUSTOMPO</pur:InterfaceSourceCode>\n"
                    + "<pur:PurchaseOrderEntryLine>\n"
                    + "<pur:LineNumber>1</pur:LineNumber>\n"
                    + "<pur:LineTypeId/>\n"
                    + "<pur:LineType>Goods</pur:LineType>\n"
                    + "<pur:ItemId>100000000493034</pur:ItemId>\n"
                    + "<pur:ItemNumber/>\n"
                    + "<pur:ItemRevision/>\n"
                    + "<pur:ItemDescription>FREIGHT, INSURANCE AND FEES</pur:ItemDescription>\n"
                    + "<pur:CategoryId>300000002649008</pur:CategoryId>\n"
                    + "<pur:CategoryName/>\n"
                    + "<pur:SupplierItem/>\n"
                    + "<pur:UnitOfMeasureCode/>\n"
                    + "<pur:UnitOfMeasure>Numbers</pur:UnitOfMeasure>\n"
                    + "<pur:Quantity>3</pur:Quantity>\n"
                    + "<pur:Price>5</pur:Price>\n"
                    + "<pur:NoteToSupplier>test</pur:NoteToSupplier>\n"
                    + "<pur:ChangeReason/>\n"
                    + "<pur:CancelReason/>\n"
                    + "<pur:CancelRequisitionFlag/>\n"
                    + "<pur:Action/>\n"
                    + "<pur:PurchaseOrderEntrySchedule>\n"
                    + "<pur:ScheduleNumber>1</pur:ScheduleNumber>\n"
                    + "<pur:Quantity>3</pur:Quantity>\n"
                    + "<pur:SecondaryQuantity/>\n"
                    + "<pur:ParentLineLocationId/>\n"
                    + "<pur:ParentScheduleNumber/>\n"
                    + "<pur:SupplierOrderLine/>\n"
                    + "<pur:OrderedAmount>15.0</pur:OrderedAmount>\n"
                    + "<pur:ShipToLocationId>300000002426419</pur:ShipToLocationId>\n"
                    + "<pur:ShipToLocationCode/>\n"
                    + "<pur:ShipToOrganizationId>300000002426744</pur:ShipToOrganizationId>\n"
                    + "<pur:ShipToOrganizationCode/>\n"
                    + "<pur:CarrierId/>\n"
                    + "<pur:Carrier/>\n"
                    + "<pur:ServiceLevelCode/>\n"
                    + "<pur:ServiceLevel/>\n"
                    + "<pur:ModeOfTransportCode/>\n"
                    + "<pur:ModeOfTransport/>\n"
                    + "<pur:NeedByDate>2017-07-05</pur:NeedByDate>\n"
                    + "<pur:PromisedDate>2017-07-05</pur:PromisedDate>\n"
                    + "<pur:DestinationTypeCode>INVENTORY</pur:DestinationTypeCode>\n"
                    + "<pur:DestinationType/>\n"
                    + "<pur:Action/>\n"
                    + "</pur:HeaderFlexfield>\n"
                    + "</typ:createOrderEntry>\n"
                    + "</typ:createPurchaseOrder>\n"
                    + "</soapenv:Body>\n"
                    + "</soapenv:Envelope>";
            String authToken = usernameToken("gfdgfitac.ae", "fgfdg3");
            MediaType mediaType = MediaType.parse("text/xml");
            RequestBody body = RequestBody.create(mediaType, xmlData);
            Request request = new Request.Builder()
                    .url("https://edhx-test.prc.em2.oraclecloud.ceV2?wsdl=")
                    .post(body)
                    .addHeader("content-type", "text/xml")
                    .addHeader("cache-control", "no-cache")
                    .build();

            Response response = client.newCall(request).execute();

            InputStream isr = response.body().byteStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(isr));
            StringBuilder out = new StringBuilder();
            String resultsXml;
            while ((resultsXml = reader.readLine()) != null) {
                out.append(resultsXml);
            }

            int responseCode = response.code();
            String fault = getFaultString(out.toString());

            System.out.println("SOAP Response  :" + out.toString());
            System.out.println("Fault :" + fault);
            System.out.println("Response Code:" + responseCode);
            reader.close();

        } catch (Exception e) {

        }

    }

    public static String usernameToken(String userName, String passWord) {
        String token = userName + passWord;
        byte[] encodedBytes = Base64.getEncoder().encode(token.getBytes());
        return encodedBytes.toString();

    }

    public static String getFaultString(String xml) {
        String faultString = "";
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource src = new InputSource();
            src.setCharacterStream(new StringReader(xml));
            Document doc = builder.parse(src);
            faultString = doc.getElementsByTagName("faultstring").item(0).getTextContent();

        } catch (Exception e) {

        }
        return faultString;
    }

}
