package Utils;

public class MailTemplates {
    
   
    /**********************double quotes convert into single quotes*****************************************/

        public static String quotesReplace(String htmldata){
                String out=htmldata.replace( "\"",  "'");
                //StringBuilder builder = new StringBuilder("<html> <body>");
                //builder.append(out);
                //builder.append("</body> </html>");
                //System.err.println("----HTML BODY value---"+builder.toString());    
                //return builder.toString();
                System.out.println("---Quotes Replace Output-----: "+out);
                return out;
                }
  
  /***************************************************************************************************/
   
    
    public static String requestMailContent(){
        
        String Msg="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" + 
        "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns=\"http://www.w3.org/1999/xhtml\">\n" + 
        "<head>\n" + 
        "	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" + 
        "	<meta name=\"viewport\" content=\"width=device-width\" />\n" + 
        "	\n" + 
        "<style>body {\n" + 
        "width: 100% !important; min-width: 100%; -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%; margin: 0; padding: 0;\n" + 
        "}\n" + 
        "img {\n" + 
        "outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; width: auto; float: left; clear: both; display: block;\n" + 
        "}\n" + 
        "body {\n" + 
        "color: #222222; font-family: \"Helvetica\", \"Arial\", sans-serif; font-weight: normal; padding: 0; margin: 0; text-align: left; line-height: 1.3;\n" + 
        "}\n" + 
        "body {\n" + 
        "font-size: 14px; line-height: 19px;\n" + 
        "}\n" + 
        "a:hover {\n" + 
        "color: #2795b6 !important;\n" + 
        "}\n" + 
        "a:active {\n" + 
        "color: #2795b6 !important;\n" + 
        "}\n" + 
        "a:visited {\n" + 
        "color: #2ba6cb !important;\n" + 
        "}\n" + 
        "body {\n" + 
        "font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none;\n" + 
        "}\n" + 
        "a:hover {\n" + 
        "color: #ff8f2b !important;\n" + 
        "}\n" + 
        "a:active {\n" + 
        "color: #F2821E !important;\n" + 
        "}\n" + 
        "a:visited {\n" + 
        "color: #E67612 !important;\n" + 
        "}\n" + 
        ".better-button:hover a {\n" + 
        "color: #FFFFFF !important; background-color: #F2821E; border: 1px solid #F2821E;\n" + 
        "}\n" + 
        ".better-button:visited a {\n" + 
        "color: #FFFFFF !important;\n" + 
        "}\n" + 
        ".better-button:active a {\n" + 
        "color: #FFFFFF !important;\n" + 
        "}\n" + 
        ".better-button-alt:hover a {\n" + 
        "color: #ff8f2b !important; background-color: #DDDDDD; border: 1px solid #F2821E;\n" + 
        "}\n" + 
        ".better-button-alt:visited a {\n" + 
        "color: #ff8f2b !important;\n" + 
        "}\n" + 
        ".better-button-alt:active a {\n" + 
        "color: #ff8f2b !important;\n" + 
        "}\n" + 
        "body {\n" + 
        "height: 100% !important; width: 100% !important;\n" + 
        "}\n" + 
        "body .copy {\n" + 
        "-ms-text-size-adjust: 100%; -webkit-text-size-adjust: 100%;\n" + 
        "}\n" + 
        ".ExternalClass {\n" + 
        "width: 100%;\n" + 
        "}\n" + 
        ".ExternalClass {\n" + 
        "line-height: 100%;\n" + 
        "}\n" + 
        "img {\n" + 
        "-ms-interpolation-mode: bicubic;\n" + 
        "}\n" + 
        "img {\n" + 
        "border: 0 !important; outline: none !important; text-decoration: none !important;\n" + 
        "}\n" + 
        "a:hover {\n" + 
        "text-decoration: underline;\n" + 
        "}\n" + 
        "@media only screen and (max-width: 600px) {\n" + 
        "  table[class=\"body\"] center {\n" + 
        "    min-width: 0 !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] .container {\n" + 
        "    width: 95% !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] .row {\n" + 
        "    width: 100% !important; display: block !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] .wrapper {\n" + 
        "    display: block !important; padding-right: 0 !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] .columns {\n" + 
        "    table-layout: fixed !important; float: none !important; width: 100% !important; padding-right: 0px !important; padding-left: 0px !important; display: block !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] table.columns td {\n" + 
        "    width: 100% !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] .columns td.six {\n" + 
        "    width: 50% !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] .columns td.twelve {\n" + 
        "    width: 100% !important;\n" + 
        "  }\n" + 
        "  table[class=\"body\"] table.columns td.expander {\n" + 
        "    width: 1px !important;\n" + 
        "  }\n" + 
        "  .logo {\n" + 
        "    margin-left: 10px;\n" + 
        "  }\n" + 
        "}\n" + 
        "@media (max-width: 600px) {\n" + 
        "  table[class=\"email-container\"] {\n" + 
        "    width: 95% !important;\n" + 
        "  }\n" + 
        "  img[class=\"fluid\"] {\n" + 
        "    width: 100% !important; max-width: 100% !important; height: auto !important; margin: auto !important;\n" + 
        "  }\n" + 
        "  img[class=\"fluid-centered\"] {\n" + 
        "    width: 100% !important; max-width: 100% !important; height: auto !important; margin: auto !important;\n" + 
        "  }\n" + 
        "  img[class=\"fluid-centered\"] {\n" + 
        "    margin: auto !important;\n" + 
        "  }\n" + 
        "  td[class=\"comms-content\"] {\n" + 
        "    padding: 20px !important;\n" + 
        "  }\n" + 
        "  td[class=\"stack-column\"] {\n" + 
        "    display: block !important; width: 100% !important; direction: ltr !important;\n" + 
        "  }\n" + 
        "  td[class=\"stack-column-center\"] {\n" + 
        "    display: block !important; width: 100% !important; direction: ltr !important;\n" + 
        "  }\n" + 
        "  td[class=\"stack-column-center\"] {\n" + 
        "    text-align: center !important;\n" + 
        "  }\n" + 
        "  td[class=\"copy\"] {\n" + 
        "    font-size: 14px !important; line-height: 24px !important; padding: 0 30px !important;\n" + 
        "  }\n" + 
        "  td[class=\"copy -center\"] {\n" + 
        "    font-size: 14px !important; line-height: 24px !important; padding: 0 30px !important;\n" + 
        "  }\n" + 
        "  td[class=\"copy -bold\"] {\n" + 
        "    font-size: 14px !important; line-height: 24px !important; padding: 0 30px !important;\n" + 
        "  }\n" + 
        "  td[class=\"small-text\"] {\n" + 
        "    font-size: 14px !important; line-height: 24px !important; padding: 0 30px !important;\n" + 
        "  }\n" + 
        "  td[class=\"mini-centered-text\"] {\n" + 
        "    font-size: 14px !important; line-height: 24px !important; padding: 15px 30px !important;\n" + 
        "  }\n" + 
        "  td[class=\"copy -padd\"] {\n" + 
        "    padding: 0 40px !important;\n" + 
        "  }\n" + 
        "  span[class=\"sep\"] {\n" + 
        "    display: none !important;\n" + 
        "  }\n" + 
        "  td[class=\"mb-hide\"] {\n" + 
        "    display: none !important; height: 0 !important;\n" + 
        "  }\n" + 
        "  td[class=\"spacer mb-shorten\"] {\n" + 
        "    height: 25px !important;\n" + 
        "  }\n" + 
        "  .two-up td {\n" + 
        "    width: 270px;\n" + 
        "  }\n" + 
        "}\n" + 
        "</style></head>\n" + 
        "<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" class=\"main\" style=\"height: 100% !important; width: 100% !important; min-width: 100%; -webkit-text-size-adjust: none; -ms-text-size-adjust: 100%; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; text-align: left; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; margin: 0 auto; padding: 0;\" bgcolor=\"#2e2e2e\">\n" + 
        "\n" + 
        "	<table class=\"body\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: left; height: 100%; width: 100%; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0;\" bgcolor=\"#2e2e2e\">\n" + 
        "		<tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "			<td class=\"center\" align=\"center\" valign=\"top\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0;\">\n" + 
        "        <center style=\"width: 100%; min-width: 580px;\">\n" + 
        "					<table class=\"row header\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: left; width: 100%; position: relative; margin-top: 25px; margin-bottom: 25px; padding: 0px;\">\n" + 
        "						<tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "						  <td class=\"center\" align=\"center\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0;\" valign=\"top\">\n" + 
        "						    <center style=\"width: 100%; min-width: 580px;\">\n" + 
        "\n" + 
        "						      <table class=\"container\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: inherit; width: 580px; margin: 0 auto; padding: 0;\">\n" + 
        "						        <tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "						          <td class=\"wrapper last\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; position: relative; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 10px 0px 0px;\" align=\"left\" valign=\"top\">\n" + 
        "\n" + 
        "						            <table class=\"twelve columns\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: left; width: 580px; margin: 0 auto; padding: 0;\">\n" + 
        "						              <tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "						                <td class=\"twelve sub-columns center\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; min-width: 0px; width: 100%; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0px 10px 10px 0px;\" align=\"center\" valign=\"top\">\n" + 
        "                              <img class=\"logo\" src=\"https://seeklogo.com/images/S/sobha-developers-logo-A13E8BA5BA-seeklogo.com.png\" style=\"width: 100px; padding: 0px 0px 0px 240px;\"/>\n" + 
        "                            </td>\n" + 
        "                            <td class=\"expander\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; visibility: hidden; width: 0px; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0;\" align=\"left\" valign=\"top\"></td>\n" + 
        "                          </tr>\n" + 
        "						            </table>\n" + 
        "\n" + 
        "						          </td>\n" + 
        "						        </tr>\n" + 
        "						      </table>\n" + 
        "\n" + 
        "						    </center>\n" + 
        "						  </td>\n" + 
        "						</tr>\n" + 
        "					</table>\n" + 
        "					\n" + 
        "<!--Title-->\n" + 
        "\n" + 
        "<table class=\"container\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: inherit; width: 580px; margin: 0 auto; padding: 0;\" width=\"600\" bgcolor=\"#efefef\">\n" + 
        "						<tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "							<td height=\"2\" class=\"spacer mb-shorten\" style=\"font-size: 0; line-height: 0; mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-image: linear-gradient(to right, #ffed00 0%, #f26529 75%); height: 2px !important; word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0; border: 0;\" valign=\"top\" align=\"left\"> </td>\n" + 
        "						</tr>\n" + 
        "						<tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "							<td class=\"mini-centered-text\" style=\"color: #343b41; mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 25px 35px; font: 400 16px/27px 'Helvetica Neue', Helvetica, Arial, sans-serif;\" align=\"center\" valign=\"top\">\n" + 
        "								<span style=\"color:rgb(44,48,94); font-size:24px; line-height:28px\"><strong>Contract</strong></span>\n" + 
        "\n" + 
        "<!-----Message----------->\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:0px; padding-left:10px\">\n" + 
        "<div style=\"color: rgb(85, 85, 85); line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; color: rgb(85, 85, 85); text-align: left;\">\n" + 
        "<p style=\"margin:0; font-size:14px; line-height:17px; text-align:justify\"><span style=\"font-size:24px; line-height:28px\"><strong><span style=\"line-height:28px; font-size:24px\"><span style=\"color:rgb(44,48,94); font-size:24px; line-height:28px\">Hey</span>,<span style=\"color:rgb(51,51,51); font-size:24px; line-height:28px\"><br/><br/><span style=\"font-size:20px; line-height:28px\">Contract Number 'CONT-001'&nbsp is Submitted for approval.</span></span></span></strong></span></p>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "\n" + 
        "<!-----Dot Line----------->\n" + 
        "<table align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"height:1px\">\n" + 
        "<table align=\"center\" border=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; border-top:1px solid #bbbbbb; width:100%\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "<!-----Message Description----------->\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:5px; padding-right:10px; padding-bottom:5px; padding-left:10px\">\n" + 
        "<div style=\"color: rgb(119, 119, 119); line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; color: rgb(119, 119, 119); text-align: left;\">\n" + 
        "<p style=\"margin:0; font-size:14px; line-height:17px; text-align:justify\"><span style=\"font-size:12px; line-height:14px; color:rgb(51,51,51)\"><span style=\"font-size:12px; line-height:14px\"><span style=\"font-size:14px; line-height:14px\"><strong style=\"color:rgb(255,102,0)\">'ABC SalesPerson' </strong> has placed an 'Contract' with Contract Number CONT-001 is Submitted for approval.<br>\n" + 
        "<br>\n" + 
        "Thank you!<br>\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">Good day!</span></span></span></span></p>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "<!-----Dot Line----------->\n" + 
        "\n" + 
        "<table align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"height:1px\">\n" + 
        "<table align=\"center\" border=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; border-top:1px solid #bbbbbb; width:100%\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "\n" + 
        "\n" + 
        "<!-----Details Information----------->\n" + 
        "\n" + 
        "\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:15px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; text-align: left;\">\n" + 
        "<table style=\"border-collapse:collapse; border-spacing:0\">\n" + 
        "<tbody>\n" + 
        "<tr>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#666; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">'Contract'</span></td>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#ff6600; font-weight:bold; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">'CONT-001'</span></td>\n" + 
        "</tr>\n" + 
        "<tr>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#666; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">Status</span></td>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#ff6600; font-weight:bold; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">Submitted for Approval</span></td>\n" + 
        "</tr>\n" + 
        "<tr>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#666; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">Salesperson</span></td>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#ff6600; font-weight:bold; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">'ABC SalesPerson'</span></td>\n" + 
        "</tr>\n" + 
        "<tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "<!-----Login Button----------->\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "<table class=\"row\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: left; width: 100%; position: relative; display: block; padding: 0px;\">\n" + 
        "  <tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "    <td class=\"wrapper last\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; position: relative; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 10px 0px 0px;\" align=\"left\" valign=\"top\">\n" + 
        "      <table class=\"twelve columns\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: left; width: 580px; margin: 0 auto; padding: 0;\">\n" + 
        "        <tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "          <td class=\"center six\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; width: 50%; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0px 0px 10px;\" align=\"center\" valign=\"top\">\n" + 
        "            <table class=\"better-button\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: left; margin-top: 10px; margin-bottom: 20px; padding: 0;\">\n" + 
        "              <tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "                <td align=\"center\" class=\"better-button\" bgcolor=\"#ff8f2b\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; -webkit-border-radius: 2px; -moz-border-radius: 2px; border-radius: 2px; margin: 0; padding: 0px;\" valign=\"top\">\n" + 
        "                  <a href=\"{{.RuleUrl}}\" target=\"_blank\" style=\"color: #FFF; text-decoration: none; -webkit-border-radius: 2px; -moz-border-radius: 2px; border-radius: 2px; display: inline-block; padding: 12px 25px; border: 1px solid #ff8f2b;\">Login</a>\n" + 
        "                </td>\n" + 
        "              </tr>\n" + 
        "            </table>\n" + 
        "            </td>\n" + 
        "        </tr>\n" + 
        "      </table>\n" + 
        "    </td>\n" + 
        "  </tr>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</table>\n" + 
        "\n" + 
        "<!-----End----------->			\n" + 
        "					<table class=\"footer center\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: center; color: #999999; margin-top: 20px; padding: 0;\" bgcolor=\"#2e2e2e\">\n" + 
        "						<tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "							<td class=\"wrapper last\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; position: relative; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 10px 20px 0px 0px;\" align=\"left\" valign=\"top\">\n" + 
        "								<table class=\"twelve columns center\" style=\"border-spacing: 0; border-collapse: collapse; vertical-align: top; text-align: center; width: 580px; margin: 0 auto; padding: 0;\">\n" + 
        "									<tr style=\"vertical-align: top; padding: 0;\" align=\"left\">\n" + 
        "										<td class=\"twelve\" align=\"center\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; width: 100%; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0px 0px 10px;\" valign=\"top\">\n" + 
        "											<center style=\"width: 100%; min-width: 580px;\">\n" + 
        "												<p style=\"font-size: 12px; color: #999999; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0 0 10px; padding: 0;\" align=\"center\">\n" + 
        "													Sent by <a href=\"{{.AppUrl}}\" style=\"color: #E67612; text-decoration: none;\">Grafana v{{.BuildVersion}}</a>\n" + 
        "													<br />© 2016 Grafana and raintank\n" + 
        "												</p>\n" + 
        "											</center>\n" + 
        "										</td>\n" + 
        "										<td class=\"expander\" style=\"word-break: break-word; -webkit-hyphens: auto; -moz-hyphens: auto; hyphens: auto; border-collapse: collapse !important; visibility: hidden; width: 0px; color: #222222; font-family: 'Open Sans', 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: normal; line-height: 19px; font-size: 14px; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; margin: 0; padding: 0;\" align=\"left\" valign=\"top\"></td>\n" + 
        "									</tr>\n" + 
        "								</table>\n" + 
        "							</td>\n" + 
        "						</tr>\n" + 
        "					</table>\n" + 
        "				</center>\n" + 
        "			</td>\n" + 
        "		</tr>\n" + 
        "	</table>\n" + 
        "</body>\n" + 
        "</html>";
        
        String Html_Msg=quotesReplace(Msg);
        return Html_Msg;
    }
    
   /***************************************************************************************************/
    
    // sobha 
    public static String submit(String nameOfNofication, String NoficationNumber, String LoginUser){
        
        String Msg="<html>\n" + 
        "<head>\n" + 
        "<title>Page Title</title>\n" + 
        "</head>\n" + 
        "<body>\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td width=\"100%\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:#444444\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" class=\"x_m_-6366644067162443722x_container\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; max-width:500px; margin:0 auto; text-align:inherit\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td width=\"100%\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" bgcolor=\"transparent\" class=\"x_m_-6366644067162443722x_block-grid\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; width:100%; max-width:500px; color:#333; background-color:transparent\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:transparent; text-align:center; font-size:0\">\n" + 
        "<div class=\"x_m_-6366644067162443722x_col x_m_-6366644067162443722x_num12\" style=\"display:inline-block; vertical-align:top; width:100%\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:transparent; padding-top:20px; padding-right:0px; padding-bottom:20px; padding-left:0px; border-top:0px solid transparent; border-right:0px solid transparent; border-bottom:0px solid transparent; border-left:0px solid transparent\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody><tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:0px; padding-left:10px\">\n" + 
        "<div style=\"color: rgb(85, 85, 85); line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; font-size: 12px; line-height: 14px; color: rgb(85, 85, 85); text-align: left;\">\n" + 
        "<p style=\"margin:0; font-size:18px; line-height:22px\"><span style=\"font-size:26px; line-height:31px; color:rgb(255,255,255)\"><strong><span style=\"line-height:31px; font-size:26px\">Sobha</span></strong></span></p>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:5px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"color: rgb(136, 136, 136); line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; color: rgb(136, 136, 136); text-align: left;\">\n" + 
        "<p style=\"margin:0; font-size:12px; line-height:14px\"><span style=\"color:rgb(153,153,153); font-size:12px; line-height:14px\">Sobha <span class=\"x_m_-6366644067162443722highlight\" id=\"x_m_-63666440671624437220.9182669872898304\" name=\"x_searchHitInReadingPane\">Notifications</span></span></p>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td width=\"100%\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:#e5e5e5\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" class=\"x_m_-6366644067162443722x_container\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; max-width:500px; margin:0 auto; text-align:inherit\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td width=\"100%\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" bgcolor=\"transparent\" class=\"x_m_-6366644067162443722x_block-grid\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; width:100%; max-width:500px; color:#333; background-color:transparent\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:transparent; text-align:center; font-size:0\">\n" + 
        "<div class=\"x_m_-6366644067162443722x_col x_m_-6366644067162443722x_num12\" style=\"display:inline-block; vertical-align:top; width:100%\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:transparent; padding-top:30px; padding-right:0px; padding-bottom:30px; padding-left:0px; border-top:0px solid transparent; border-right:0px solid transparent; border-bottom:0px solid transparent; border-left:0px solid transparent\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:0px; padding-left:10px\">\n" + 
        "<div style=\"color: rgb(85, 85, 85); line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; color: rgb(85, 85, 85); text-align: left;\">\n" + 
        "<p style=\"margin:0; font-size:14px; line-height:17px; text-align:justify\"><span style=\"font-size:24px; line-height:28px\"><strong><span style=\"line-height:28px; font-size:24px\"><span style=\"color:rgb(44,48,94); font-size:24px; line-height:28px\">Hey</span>,<span style=\"color:rgb(51,51,51); font-size:24px; line-height:28px\"> <span style=\"font-size:24px; line-height:28px\">"+nameOfNofication+"&nbsp"+NoficationNumber+"&nbspis Submitted for approval.</span></span></span></strong></span></p>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"height:1px\">\n" + 
        "<table align=\"center\" border=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; border-top:1px solid #bbbbbb; width:100%\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:5px; padding-right:10px; padding-bottom:5px; padding-left:10px\">\n" + 
        "<div style=\"color: rgb(119, 119, 119); line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; color: rgb(119, 119, 119); text-align: left;\">\n" + 
        "<p style=\"margin:0; font-size:14px; line-height:17px; text-align:justify\"><span style=\"font-size:12px; line-height:14px; color:rgb(51,51,51)\"><span style=\"font-size:12px; line-height:14px\"><span style=\"font-size:12px; line-height:14px\"><strong style=\"color:rgb(255,102,0)\">"+LoginUser+"</strong> has placed an "+nameOfNofication+" with "+nameOfNofication+" number "+NoficationNumber+" is Submitted for approval.<br>\n" + 
        "<br>\n" + 
        "Thank you!<br>\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">Good day!</span></span></span></span></p>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"height:1px\">\n" + 
        "<table align=\"center\" border=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; border-top:1px solid #bbbbbb; width:100%\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:15px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"line-height: 120%; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; font-family: Roboto, Tahoma, Verdana, Segoe, sans-serif, serif, EmojiFont; text-align: left;\">\n" + 
        "<table style=\"border-collapse:collapse; border-spacing:0\">\n" + 
        "<tbody>\n" + 
        "<tr>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#666; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">"+nameOfNofication+"</span></td>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#ff6600; font-weight:bold; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">"+NoficationNumber+"</span></td>\n" + 
        "</tr>\n" + 
        "<tr>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#666; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">Status</span></td>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#ff6600; font-weight:bold; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<span class=\"x_m_-6366644067162443722contextualExtensionHighlight x_m_-6366644067162443722ms-font-color-themePrimary x_m_-6366644067162443722ms-border-color-themePrimary x_m_-6366644067162443722ident_999_1058\">Submitted for Approval</span></td>\n" + 
        "</tr>\n" + 
        "<tr>\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#666; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "<td style=\"font-size:12px; font-weight:normal; padding:10px 5px; border:none; color:#ff6600; font-weight:bold; overflow:hidden; word-break:normal; vertical-align:top\">\n" + 
        "</tr>\n" + 
        "<tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table align=\"center\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"height:1px\">\n" + 
        "<table align=\"center\" border=\"0\" cellspacing=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; border-top:1px solid #bbbbbb; width:100%\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td align=\"center\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td class=\"x_m_-6366644067162443722x_button-container\" align=\"left\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:15px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td width=\"100%\" class=\"x_m_-6366644067162443722x_button\" align=\"left\" valign=\"middle\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "<div align=\"left\" style=\"display:inline-block; border-radius:5px; max-width:25%; width:100%; border-top:0px solid transparent; border-right:0px solid transparent; border-bottom:0px solid transparent; border-left:0px solid transparent\">\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td width=\"100%\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:#444444\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" class=\"x_m_-6366644067162443722x_container\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; max-width:500px; margin:0 auto; text-align:inherit\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td width=\"100%\" style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" bgcolor=\"transparent\" class=\"x_m_-6366644067162443722x_block-grid\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top; width:100%; max-width:500px; color:#333; background-color:transparent\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:transparent; text-align:center; font-size:0\">\n" + 
        "<div class=\"x_m_-6366644067162443722x_col x_m_-6366644067162443722x_num12\" style=\"display:inline-block; vertical-align:top; width:100%\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" border=\"0\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; background-color:transparent; padding-top:25px; padding-right:0px; padding-bottom:25px; padding-left:0px; border-top:0px solid transparent; border-right:0px solid transparent; border-bottom:0px solid transparent; border-left:0px solid transparent\">\n" + 
        "<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-spacing:0; border-collapse:collapse; vertical-align:top\">\n" + 
        "<tbody>\n" + 
        "<tr style=\"vertical-align:top\">\n" + 
        "<td style=\"word-break:break-word; border-collapse:collapse!important; vertical-align:top; padding-top:10px; padding-right:10px; padding-bottom:10px; padding-left:10px\">\n" + 
        "<div style=\"color: rgb(187, 187, 187); line-height: 120%; font-family: Helvetica Neue, Helvetica, Arial, sans-serif, serif, EmojiFont;\">\n" + 
        "<div style=\"font-size: 12px; line-height: 14px; color: rgb(187, 187, 187); font-family: Helvetica Neue, Helvetica, Arial, sans-serif, serif, EmojiFont; text-align: left;\">\n" + 
        "<p style=\"margin:0; font-size:12px; line-height:14px; text-align:center\">Sobha <span class=\"x_m_-6366644067162443722highlight\" id=\"x_m_-63666440671624437220.6246102622735843\" name=\"x_searchHitInReadingPane\">Notifications</span></p>\n" + 
        "<p style=\"margin:0; font-size:12px; line-height:14px; text-align:center\">mailto:Sobhanotifications@sobha-me.com <span class=\"x_m_-6366644067162443722highlight\" id=\"x_m_-63666440671624437220.6246102622735843\" name=\"x_searchHitInReadingPane\"></span></p>\n" + 
        "<p style=\"margin:0; font-size:12px; line-height:14px; text-align:center\"><a href=\"mailto:Sobhanotifications@sobha-me.com?subject=Order+Notifications+Support+(12001)\" target=\"_blank\" rel=\"noopener noreferrer\" title=\"Sobhanotification@gmail.com\" style=\"color:#ffffff; text-decoration:underline\"><wbr></a></p>\n" + 
        "</div>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</div>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</td>\n" + 
        "</tr>\n" + 
        "</tbody>\n" + 
        "</table>\n" + 
        "</body>\n" + 
        "</html>";
        
        String Html_Msg=quotesReplace(Msg);
        
        return Html_Msg;
    }
    
    
}
