import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MysqlJson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JSONException {
		
		Class.forName("com.mysql.jdbc.Driver");
	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miracle?useUnicode=yes&characterEncoding=UTF-8","root","root");  
	      Statement select1 = conn.createStatement();
	      Statement select2 = conn.createStatement();
	      Statement select3 = conn.createStatement();
          ResultSet BusinessActivityED=select1.executeQuery("Select * from BusinessActivityED");  
          ResultSet issueBLED=select2.executeQuery("Select * from issueBLED");  
          ResultSet OwnerRelationshipED=select3.executeQuery("Select * from OwnerRelationshipED");  
  	      
          
          JSONArray jArray1 = new JSONArray();
             
          while (BusinessActivityED.next())
          {
             String  ActivityCode=BusinessActivityED.getString("ActivityCode");
             System.out.println(ActivityCode);
             String ActivityStatus=BusinessActivityED.getString("ActivityStatus");
             System.out.println(ActivityStatus);
             String BADescriptionAR=BusinessActivityED.getString("BADescriptionAR");
             System.out.println(BADescriptionAR);
             String BADescriptionEN=BusinessActivityED.getString("BADescriptionEN");
             System.out.println(BADescriptionEN);
             
             JSONObject jo=new JSONObject();
             jo.put("ActivityCode",BADescriptionEN);
             jo.put("ActivityStatus",ActivityStatus);
             jo.put("BADescriptionAR",BADescriptionAR);
             jo.put("BADescriptionEN",BADescriptionEN);
             
             jArray1.put(jo);
          }
          
          JSONObject BusinessActivityEDobj=new JSONObject();
          BusinessActivityEDobj.put("BusinessActivityED",jArray1);
          
          JSONObject BusinessActivities=new JSONObject();
          BusinessActivities.put("BusinessActivities",BusinessActivityEDobj);
          
          System.out.println(BusinessActivities.toString());
          
          JSONArray jArray2 = new JSONArray();
          
          while(OwnerRelationshipED.next())
          {
        	  String  EDOwnerID=OwnerRelationshipED.getString("EDOwnerID");
              System.out.println(EDOwnerID);
              String OwnerDateOfBirth=OwnerRelationshipED.getString("OwnerDateOfBirth");
              System.out.println(OwnerDateOfBirth);
              String OwnerEmiratesID=OwnerRelationshipED.getString("OwnerEmiratesID");
              System.out.println(OwnerEmiratesID);
              String OwnerFullNameAR=OwnerRelationshipED.getString("OwnerFullNameAR");
              System.out.println(OwnerFullNameAR);
              
              String  OwnerFullNameEN=OwnerRelationshipED.getString("OwnerFullNameEN");
              System.out.println(OwnerFullNameEN);
              String OwnerGender=OwnerRelationshipED.getString("OwnerGender");
              System.out.println(OwnerGender);
              String OwnerMobileNo=OwnerRelationshipED.getString("OwnerMobileNo");
              System.out.println(OwnerMobileNo);
              String OwnerNationality=OwnerRelationshipED.getString("OwnerNationality");
              System.out.println(OwnerNationality);
              
              String  OwnerPassportNo=OwnerRelationshipED.getString("OwnerPassportNo");
              System.out.println(OwnerPassportNo);
              String OwnerTypeId=OwnerRelationshipED.getString("OwnerTypeId");
              System.out.println(OwnerTypeId);
              String OwnerVisaNo=OwnerRelationshipED.getString("OwnerVisaNo");
              System.out.println(OwnerVisaNo);
              String RelationShipStartDate=OwnerRelationshipED.getString("RelationShipStartDate");
              System.out.println(RelationShipStartDate);
              
              String RelationshipStatus=OwnerRelationshipED.getString("RelationshipStatus");
              System.out.println(RelationshipStatus);
              String RelationshipType=OwnerRelationshipED.getString("RelationshipType");
              System.out.println(RelationshipType);

              JSONObject jo1=new JSONObject();
              jo1.put("EDOwnerID",EDOwnerID);
              jo1.put("OwnerDateOfBirth",OwnerDateOfBirth);
              jo1.put("OwnerEmiratesID",OwnerEmiratesID);
              jo1.put("OwnerFullNameAR",OwnerFullNameAR);
              
              jo1.put("OwnerFullNameEN",OwnerFullNameEN);
              jo1.put("OwnerGender",OwnerGender);
              jo1.put("OwnerMobileNo",OwnerMobileNo);
              jo1.put("OwnerNationality",OwnerNationality);
              
              
              jo1.put("OwnerPassportNo",OwnerPassportNo);
              jo1.put("OwnerTypeId",OwnerTypeId);
              jo1.put("OwnerVisaNo",OwnerVisaNo);
              jo1.put("RelationShipStartDate",RelationShipStartDate);
              
              jo1.put("RelationshipStatus",RelationshipStatus);
              jo1.put("RelationshipType",RelationshipType);             
              jArray2.put(jo1);
              
          }
          
          JSONObject OwnerRelationshipEDObj=new JSONObject();
          OwnerRelationshipEDObj.put("OwnerRelationshipED",jArray2);
          
          JSONObject OwnerRelationshipEDObj1=new JSONObject();
          OwnerRelationshipEDObj1.put("OwnerRelationshipED",OwnerRelationshipEDObj);
          
          JSONObject BLOwner=new JSONObject();
          BLOwner.put("BLOwner",OwnerRelationshipEDObj1);
          
          System.out.println(BLOwner.toString());
          
          JSONObject jo2=new JSONObject();
          while(issueBLED.next())
          {
        	  String  EDInitialApprovalID=issueBLED.getString("EDInitialApprovalID");
              System.out.println(EDInitialApprovalID);
              String EDLicenseID=issueBLED.getString("EDLicenseID");
              System.out.println(EDLicenseID);
              String ExpirationDate=issueBLED.getString("ExpirationDate");
              System.out.println(ExpirationDate);
              String ForeignCompCertID=issueBLED.getString("ForeignCompCertID");
              System.out.println(ForeignCompCertID);
              
              String  LegalType=issueBLED.getString("LegalType");
              System.out.println(LegalType);
              String LicenseAddrLine1=issueBLED.getString("LicenseAddrLine1");
              System.out.println(LicenseAddrLine1);
              String LicenseAddrLine2=issueBLED.getString("LicenseAddrLine2");
              System.out.println(LicenseAddrLine2);
              String LicenseAddrLine3=issueBLED.getString("LicenseAddrLine3");
              System.out.println(LicenseAddrLine3);
              
              String  LicenseAddrLine4=issueBLED.getString("LicenseAddrLine4");
              System.out.println(LicenseAddrLine4);
              String LicenseFaxNo=issueBLED.getString("LicenseFaxNo");
              System.out.println(LicenseFaxNo);
              String LicenseMobPhoneNo=issueBLED.getString("LicenseMobPhoneNo");
              System.out.println(LicenseMobPhoneNo);
              String LicensePhoneNo=issueBLED.getString("LicensePhoneNo");
              System.out.println(LicensePhoneNo);
              
              String  LicenseStatus=issueBLED.getString("LicenseStatus");
              System.out.println(LicenseStatus);
              String LicenseType=issueBLED.getString("LicenseType");
              System.out.println(LicenseType);
              String ParentLicenceEDLicenseID=issueBLED.getString("ParentLicenceEDLicenseID");
              System.out.println(ParentLicenceEDLicenseID);
              String ParentLicenceIssuanceEDID=issueBLED.getString("ParentLicenceIssuanceEDID");
              System.out.println(ParentLicenceIssuanceEDID);
              
              String  RegistrationDate=issueBLED.getString("RegistrationDate");
              System.out.println(RegistrationDate);
              String SubmissionTypeID=issueBLED.getString("SubmissionTypeID");
              System.out.println(SubmissionTypeID);
              String BNLocalID=issueBLED.getString("BNLocalID");
              System.out.println(LicenseMobPhoneNo);
              String BNRegNameAr=issueBLED.getString("BNRegNameAr");
              System.out.println(BNRegNameAr);
              
              String  BNRegNameEn=issueBLED.getString("BNRegNameEn");
              System.out.println(BNRegNameEn);
              String BranchBL=issueBLED.getString("BranchBL");
              System.out.println(BranchBL);
              String BranchBNTextAr=issueBLED.getString("BranchBNTextAr");
              System.out.println(BranchBNTextAr);
              String BranchBNTextEn=issueBLED.getString("BranchBNTextEn");
              System.out.println(BranchBNTextEn);
              
              
              
              jo2.put("EDInitialApprovalID",EDInitialApprovalID);
              jo2.put("EDLicenseID",EDLicenseID);
              jo2.put("ExpirationDate",ExpirationDate);
              
              jo2.put("ForeignCompCertID",ForeignCompCertID);
              jo2.put("LegalType",LegalType);
              jo2.put("LicenseAddrLine1",LicenseAddrLine1);
              
              jo2.put("LicenseAddrLine2",LicenseAddrLine2);
              jo2.put("LicenseAddrLine3",LicenseAddrLine3);
              jo2.put("LicenseAddrLine4",LicenseAddrLine4);
              
              jo2.put("LicenseFaxNo",LicenseFaxNo);
              jo2.put("LicenseMobPhoneNo",LicenseMobPhoneNo);
              jo2.put("LicensePhoneNo",LicensePhoneNo);
              
              jo2.put("LicenseStatus",LicenseStatus);
              jo2.put("LicenseType",LicenseType);
              jo2.put("ParentLicenceEDLicenseID",ParentLicenceEDLicenseID);
              
              jo2.put("ParentLicenceIssuanceEDID",ParentLicenceIssuanceEDID);
              jo2.put("RegistrationDate",RegistrationDate);
              jo2.put("SubmissionTypeID",SubmissionTypeID);
              
              jo2.put("BNLocalID",BNLocalID);
              jo2.put("BNRegNameAr",BNRegNameAr);
              jo2.put("BNRegNameEn",BNRegNameEn);
              
              jo2.put("BranchBL",BranchBL);
              jo2.put("BranchBNTextAr",BranchBNTextAr);
              jo2.put("BranchBNTextEn",BranchBNTextEn);
              
              

        	  
          }
          
       //   JSONObject issueBLEDObj=new JSONObject();
       //   issueBLEDObj.put("issueBLED",jo2);
          jo2.put("BLOwner",OwnerRelationshipEDObj1);
          jo2.put("BusinessActivities",BusinessActivityEDobj);
          System.out.println(jo2.toString());
          
          JSONObject CBLSAuthenticate=new JSONObject();
          CBLSAuthenticate.put("Username","AJDED_ADG");
          CBLSAuthenticate.put("Password","A$j#d@hQ#2wD7@sEp$3@zZ12#");
          
          JSONObject serviceCall=new JSONObject();
          serviceCall.put("CBLSAuthenticate",CBLSAuthenticate);
          
          JSONObject serviceCall1=new JSONObject();
          serviceCall1.put("serviceCall",serviceCall);
          System.out.println(serviceCall1.toString());
          
          JSONObject jfin=new JSONObject();
          jfin.put("serviceCall",serviceCall1);
          jfin.put("issueBLED",jo2);
          
          System.out.println(jfin.toString());
     conn.close();     
	}

}
