package com.fieldez.testcases;


	//package com.fieldez.testcases;

	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import java.io.IOException;
	//import java.util.concurrent.TimeUnit;

	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.fieldez.pageobjects.LoginPage;
	import com.fieldez.utilities.ExcelUtilities;
	//import com.fieldez.utilities.XLUtils;
	//import com.fieldez.pageobjects.AddCustomerPage;
    import com.fieldez.pageobjects.CreateCallPage;
	public class TC_CreateCallTest_003 extends BaseClass1{
		
		SoftAssert softAssert =new SoftAssert();
		
		@Test(dataProvider="DatabaseLogin",priority=1)
		public void LoginTest(String username, String password) throws IOException, InterruptedException
		
		{  
			 
	//ExtentHtmlReporter reporter=new ExtentHtmlReporter("E:\\SVN\\FZ_Web_Automation_1.0\\com.fieldez.webautomation\\Reports\\AdvancedReports.html");
	//ExtentReports extent = new ExtentReports();
	//ExtentTest test=extent.createTest("LoginTestcc");
			 //logger.info("URL is launched");
	       
			LoginPage lp = new LoginPage(driver);
			lp.setUserName(username);
			//logger.info("Entered the username");
			
			
			
			lp.setPassword(password);
			//logger.info("Entered the password");
			
			
			
			lp.clickSubmit();
			//test.log(Status.INFO, "Login to fieldez");
			
			
			
			//logger.info("Logging into application");
			Thread.sleep(10000);
			// Check Test Case is passed 
			
			
			if(driver.getTitle().equals("FieldEZ"))

			{
				Assert.assertTrue(true);
				System.out.println("Fieldez Login Successful");
			//	test.log(Status.PASS, "Login Successful");
				
			}
			else if(driver.getTitle().equals("Dashboard"))
			{
				System.out.println("Fieldez Dashboard Login Successful");
				Assert.assertTrue(true);
				//test.log(Status.PASS, "Login Successful");
			}
			
			
			else if(driver.getPageSource().contains("Invalid username/password!")) {
				System.out.println("Inavlid Username and Password");
				AssertJUnit.assertTrue(false);
			}
			else
			{
				
				System.out.println("Fieldez Login is Not Successful");
				AssertJUnit.assertTrue(false);
				//BaseClass bc = new BaseClass();
				//bc.captureScreen(driver,"LoginTest");
				
			//	logger.error("Login Test Case Failed");
				
		    }
			//extent.flush();
		}
		
		@DataProvider(name="DatabaseLogin")

	    public Object[][] Authentication1() throws Exception{

	         Object[][] testObjArray = ExcelUtilities.getTableArray("E:\\SVN\\FZ_Web_Automation_1.0\\1.0\\com.fieldez.webautomation\\src\\test\\java\\com\\fieldez\\testdata\\FieldezTestData.xlsx","logindata");


		return testObjArray;
	}


		@Test(dataProvider="CreateCallData",priority=2,enabled=true)
		public void CreateCallTest(String Customerfirstn,/*,String Customermn,String Customerln, String CustAddress1,String CustAddress2,
				// Need to pass call number string for manual entry of call number
				 * 
				 * public void CreateCallTest(String callnumber,
				
				String city,
				String country,
				String state,
				String customerId,
				String primaryNo,
				String emailID,
				String orgName,
				String subOrg,
				String customerType,*/
				String problemDescription/*,
				String productName,
				String modelName,
				String productSerialNO,
				String warrrantyType,
				String specialInstructions,
				String remarks,
				String startTime,
				String endTime,
				String engineer*/) throws IOException, InterruptedException
		
		{
			//driver.navigate().to("http://qa.fieldez.com/emob/private/customerList.action#/");
			//logger.info("Customer page");
			
			CreateCallPage ccp = new CreateCallPage(driver);
			ccp.callnumber();

			logger.info("Entered the call number");
			//ccp.callnumber(callnumber);
			
			//ccp.Clickcustomerbutton();
			//logger.info("Click Add Customer Button");
			
			ccp.EnterCustomerFirstName(Customerfirstn);
			/*ccp.EnterCustomerMiddleName(Customermn);
			ccp.EnterCustomerLastName(Customerln);
			ccp.EnterCustomerAddres1(CustAddress1);
			ccp.EnterCustomerAddres2(CustAddress2);
			ccp.EnterCity(city);
			ccp.EnterCountry(country);
			ccp.EnterState(state);
			
			ccp.EnterCustomerId(customerId);
			ccp.EnterPrimaryNo(primaryNo);
			ccp.EnterEmailid(emailID);
			ccp.EnterOrgName(orgName);
			ccp.EnterSubOrg(subOrg);
			ccp.CustomerType(customerType);*/
			ccp.ProblemDesc(problemDescription);
			/*ccp.ProductName(productName);
			ccp.ProductSerialNo(productSerialNO);
			ccp.WarrantyType(warrrantyType);
			ccp.SepcialInstructions(specialInstructions);
			ccp.Remarks(remarks);
		*/
					
			//ccp.EnterCallDetails();
			//logger.info("Entered the customer first name");
				
			ccp.saveCreateCall();
			
			logger.info("Saved the call successfully");
			
			if(driver.getPageSource().contains("Sales Workflow")) {
				softAssert.assertTrue(true,"Call Created Succesfully");
				logger.info("T001-Pass- Call Create Successfully");	
			   }
			else
			{	
				softAssert.assertTrue(false,"Call Not Created");
				
				logger.error("T001-Fail- Call Not Created");	
				softAssert.assertAll();
			}
		}
		
		
		@DataProvider(name="CreateCallData")
		public Object[][] Authentication() throws Exception{

	        Object[][] testObjArray = ExcelUtilities.getTableArray("E:\\SVN\\FZ_Web_Automation_1.0\\1.0\\com.fieldez.webautomation\\src\\test\\java\\com\\fieldez\\testdata\\FieldezTestData.xlsx","CreateCallData");

	
		return testObjArray;
	}
		
		
		@Test(priority=3,enabled=true)
		public void UploadCallLevelAttachments() throws IOException, InterruptedException
		
		{
			//CreateCallPage ccp1 = new CreateCallPage(driver);
			CreateCallPage ccp1 = new CreateCallPage(driver);
			ccp1.SaveAttachments();
			logger.info("Call Details Page Loaded successfully");
			
			if(driver.getPageSource().contains("darjeeling.jpg")) {
				softAssert.assertTrue(true);
				System.out.println("Call level attachments uploaded successfully");
				logger.info("T002-Pass");	
			   }
			else
			{	
				softAssert.assertTrue(false);
				System.out.println("");
				logger.error("T002-Fail");
			}
			softAssert.assertAll();
		}
	
		
  } 


