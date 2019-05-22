package com.fieldez.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.fieldez.pageobjects.LoginPage;
import com.fieldez.utilities.ReadConfig;
import com.fieldez.utilities.XLUtils;

public class BaseClass1 {
	ReadConfig readconfig=new ReadConfig();
	// Define the common variables for all the test cases
	public String baseURL="http://qa.fieldez.com/emob/login.jsp";
	
	public static WebDriver driver;
	public static Logger logger;
	
	// Set Up Method
	@Parameters("browser")
	@BeforeClass
	public void setup(String brw) throws InterruptedException
	{   

		
		// Log4j Set Up
				logger = Logger.getLogger("Fieldez");
				PropertyConfigurator.configure("Log4j.properties");
				
				
		if(brw.equals("Firefox"))
		{		
		// Set GeckoDriver Property
		System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
		
		//Instantatation the Driver
		driver=new FirefoxDriver();
		}
			
		else if (brw.equals("Chrome"))
	   {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			
			//Instantatation the Driver
			driver=new ChromeDriver();
		}
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
	}
	
	
	
	/*public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;}*/
	
	@AfterClass
	public void OpenTestResults(WebDriver driver, String tname) throws IOException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		//Instantatation the Driver
	//	driver=new ChromeDriver();
		//System.out.println("Screenshot taken");
		//driver.get("E:\\SVN\\FZ_Web_Automation_1.0\\com.fieldez.webautomation\\test-output\\index.html");
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		/*
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") +"/Screenshots/"+ tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");*/
		driver.quit();
	}	
	
	/*public void teardown()
	{
		// Set GeckoDriver Property
		driver.quit();
		
	}*/
		
}
