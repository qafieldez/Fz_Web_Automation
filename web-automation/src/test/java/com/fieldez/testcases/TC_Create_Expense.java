
package com.fieldez.testcases;

	//package com.fieldez.testcases;

	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
    import org.testng.AssertJUnit;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.fieldez.pageobjects.LoginPage;
	import com.fieldez.utilities.ExcelUtilities;
	//import com.fieldez.utilities.XLUtils;
	//import com.fieldez.pageobjects.AddCustomerPage;
    import com.fieldez.pageobjects.CreateCallPage;
    import com.fieldez.pageobjects.CreateExpensePage;
//   import com.fieldez.pageobjects.IWebElement;
    
    
	public class TC_Create_Expense extends BaseClass1 {

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
	Thread.sleep(3000);
	// Check Test Case is passed 
			
			
	if(driver.getTitle().equals("FieldEZ"))

	{
	 Assert.assertTrue(true);
	 System.out.println("Fieldez Login Successful");
	 //	test.log(Status.PASS, "Login Successful");
				
	}
	else if(driver.getTitle().equals("Dashboard"))
	{
		
		Assert.assertTrue(true);
	  System.out.println("Fieldez Dashboard Login Successful");
	  //test.log(Status.PASS, "Login Successful");
	}	
			
	else if(driver.getPageSource().contains("Invalid username/password!")) 
	{
     	System.out.println("Inavlid Username and Password");
		Assert.assertTrue(false);
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

	Object[][] testObjArray = ExcelUtilities.getTableArray("E:\\SVN\\FZ_Web_Automation_1.0\\com.fieldez.webautomation\\src\\test\\java\\com\\fieldez\\testdata\\FieldezTestData.xlsx","logindata");


	return testObjArray;
	}


	@Test(dataProvider="ExpenseData",priority=2)
	public void CreateExpenseTest(String amt1) throws IOException, InterruptedException
	{
// ----------------------Test Cases 001------------------------------		
	CreateExpensePage cep=new  CreateExpensePage(driver);
	cep.AdvancedLink();
	logger.info("Advanced Link is Clicked");
	cep.ExpenseLink();
	logger.info("Expense Link is clicked");
	Thread.sleep(2000);
	cep.CreateExpense();
	Thread.sleep(2000);
	logger.info("Create Expense is Clicked");

	if(driver.getPageSource().contains("Select Calls For This Expense")) {
		Assert.assertTrue(true);
		System.out.println("Add Expense page loaded successful");
		logger.info("T001-Pass");	
	   }
	else
	{	
		Assert.assertTrue(false);
		System.out.println("page is not loaded");
		logger.error("T001-Fail");
	}
	
// -----------------------Test Cases 001 Completed	
	
	
// ------------------------Test Cases 002 Start	
	    
	
	    cep.AddLineItem();
	    Thread.sleep(2000);
	    if(driver.getPageSource().contains("Expense Type"))
	    {
			AssertJUnit.assertTrue(true);
			logger.info("T002-Pass");	
		}
		else
		{	
			AssertJUnit.assertTrue(false);
			logger.error("T002-Fail");	    
		}
// ------------------------Test Cases 002 Completed
	    
	    	    
// ------------------------Test Cases 003 Start	    
	    cep.selectFoodTravel();
	    Thread.sleep(2000);
	    if(driver.getPageSource().contains("Paid By"))
	    {
			AssertJUnit.assertTrue(true);
			logger.info("T003-Pass");	
		}
		else
		{	
			AssertJUnit.assertTrue(false);
			logger.error("T003-Fail");
		}
	    
			
// ------------------------Test Cases 003 Completed
	    
	
//----------------------Test Cases 004 Start-- Is Save Button Disabled----
	    boolean save = driver.findElement(By.xpath("//button[@class='btn btn-prime disabled']")).isEnabled();
	      if(save==false)
	      {
	    	  logger.info("Save Line Item Button is disabled");
	    	  logger.info("TC004-----> Pass");
	      }
	      else
	      {
	    	  logger.info("Save Line Item Button is Enabled");
	    	  logger.info("TC004-----> Fail");
	      }
//----------------------Test Cases 005 Start-- Is Save Button Enabled----	  
	      
	  cep.PaidBy();
	  cep.Amount(amt1);
	  boolean fname = driver.findElement(By.xpath("//div[@class='col-sm-9 footer-btn-section form-group']//button[@class='btn btn-prime'][contains(text(),'Save')]")).isEnabled();
      if(fname==true)
      {
    	  logger.info("Save Line Item Button is enabled");
      }
      else
      {
    	  logger.info("Save Line Item Button is disbaled");
      }
    	  
	  cep.savebuttonEnabled();
	  logger.info("Line item saved");
	  Thread.sleep(1000);
	  cep.clickDatePicker();
	  logger.info("Clicked on Calendar");
	  Thread.sleep(3000);
	  
	  cep.SelectExpenseDate();
	  logger.info("Selected Date");
	 // Thread.sleep(3000);
	  
	  cep.SubmitExpense();
	  Thread.sleep(3000);
	  Alert alert=driver.switchTo().alert();
	  alert.accept();
	  Thread.sleep(3000);
	
	}
		
	@DataProvider(name="ExpenseData")
	public Object[][] Authentication() throws Exception
	{
    
	Object[][] testObjArray = ExcelUtilities.getTableArray("E:\\SVN\\FZ_Web_Automation_1.0\\1.0\\com.fieldez.webautomation\\src\\test\\java\\com\\fieldez\\testdata\\FieldezTestData.xlsx","ExpenseData");
	return testObjArray;
	
	}
	
	} 


