    package com.fieldez.pageobjects;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.fieldez.utilities.Generate_Radom_Data;
	public class CreateCallPage {
		
			//Driver object
		    WebDriver ldriver; //local driver
		    Generate_Radom_Data genData;
		    //Constructor LoginPage
			public CreateCallPage(WebDriver rdriver)
		  {
				//Initiate the drivers ,Remote Driver
				ldriver=rdriver; 
				
				//PageFactory Class  //This initElements method will create all WebElements
				PageFactory.initElements(rdriver, this); 
		  }
			
			
		 
		    // Web Elements are identified by "FindBy" Annotation
		    
		    //Calls Link
		    @FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'Calls')]")
			@CacheLookup
			WebElement CallLink;
		    
		    
		  //Workflow Link
		    @FindBy(xpath="//a[@href='listComplaints.action?defSearch=true&workflowId=3690#/']")
			@CacheLookup
			WebElement WorkflowLink;
		    
		    // Create Call Link
			@FindBy(xpath="//a[contains(text(),'Create Call')]")
			@CacheLookup
			WebElement CreateCallLink;
			
			//Call No Text Field
			@FindBy(xpath="//input[@name='complaint.externalId']")
			@CacheLookup
			WebElement CallNo;
			
			
//-------- Customer Level Attributes-----------------------------------
			
			
			//Pass Customer First Name
			@FindBy(xpath="//input[@name='customer.customerName']")
			@CacheLookup
			WebElement CustomerFirstName;
			
			//Pass Customer Middle Name
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement CustomerMiddleName;
			

			//Pass Customer Last Name
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement CustomerLastName;
			
			
			//Pass Customer Address 1
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement CustomerAddress1;
			
			//Pass Customer Address 2
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement CustomerAddress2;
			
			
			
			//Pass Customer City
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement City;
			
			
			
			//Pass Customer Country
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement Country;
			
			
			
			//Pass Customer State
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement State;
			
			//Pass Customer CustomerId
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement CustomerId;
			
			
			
			//Pass Customer PrimaryNo
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement PrimaryNo;
			
			
			//Pass Customer EmailID
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement EmailID;
			
			

			//Pass Customer OrgName
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement OrgName;
			
			
			
			//Pass Customer SubOrg
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement SubOrg;
			
			
			//Pass Customer CustomerType
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement CustomerType;
			
//---------------------- Call Level Objects--------------------
			
			
			//Pass  ProblemDesc
			@FindBy(xpath="//input[@id='problemDescription']")
			@CacheLookup
			WebElement ProblemDesc;
			
			//Pass  ProductName
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement ProductName;
			
			
			//Pass  ModelName
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement ModelName;
			
			
			//Pass  ProductSerialNO
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement ProductSerialNO;
			
			
			//Pass  WarrantyType
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup 
			WebElement WarrrantyType;
			
			//Pass  SpecialInstructions
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement SpecialInstructions;
			
			//Pass  Remarks
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement Remarks;
			
//---------- Schedule Objects-------------------------			
			
			//Pass  StartTime
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement StartTime;
			
			//Pass  EndTime
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement EndTime;
			
			
			//Pass  Engineer
			@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//input[1]")
			@CacheLookup
			WebElement Engineer;
			
			
			//Pass  SaveCall
			@FindBy(xpath="//input[@id='saveActivity']")
			@CacheLookup
			WebElement SaveCall;
			
			
//========================Attachments Objects===========================================================================
					
			// Search Text Box
			@FindBy(xpath="//input[@id='callCre-searchCus']")
			@CacheLookup
			WebElement SearchTextBox;
			
			
			//Search Go
			@FindBy(xpath="//button[@class='btn mrglft22 gobtn']")
			@CacheLookup
			WebElement Go;
			
			//Add Attachments Xpath
			@FindBy(xpath="//span[@class='att-notification']")
			@CacheLookup
			WebElement AddAttachmentsLink;	
			
			//Choose File Xpath
			@FindBy(xpath="//input[@id='uploadFile']")
			@CacheLookup
			WebElement ChooseFile;	
			
			
			//Submit Attachments Xpath
			@FindBy(xpath="//button[@class='btn btn-primary'][contains(text(),'Submit')]")
			@CacheLookup
			WebElement SaveAttachments;	
			//input[@id='uploadFile']
			
			//Attachments Section
			@FindBy(xpath="//a[@class='collapsed'][contains(text(), 'Attachment')]")
			@CacheLookup
			WebElement AttachmentSection;	
			
			
		
// --------------------Methods Implementation-----------------------------------------			
			public void callnumber() throws InterruptedException
			{   
				//Need to pass the string values here
				// public void callnumber(String callnumber) throws InterruptedException
				
				genData=new Generate_Radom_Data();
				CallLink.click();
				Thread.sleep(5000);
				WorkflowLink.click();
				Thread.sleep(5000);
				CreateCallLink.click();
				Thread.sleep(5000);
				CallNo.sendKeys(genData.generateRandomNumber(25));
				
				//This is used for Normal Call number manual entry
				//CallNo.sendKeys(callnumber);
			}
			
			
			public void EnterCustomerFirstName(String CustomerFirstname) {
				CustomerFirstName.sendKeys(CustomerFirstname);	
			}
			
			
			public void EnterCustomerLastName(String CustomerLastname)
			{
				CustomerLastName.sendKeys(CustomerLastname);	
			}
			
			
			
			
			public void EnterCustomerMiddleName(String CustomerMiddlename)
			{
				CustomerMiddleName.sendKeys(CustomerMiddlename);
				
			}
			
			
			public void EnterCustomerAddres1(String Customeraddress1)
			{
				CustomerAddress1.sendKeys(Customeraddress1);	
			}	
					
			public void EnterCustomerAddres2(String Customeraddress2)
			{
				CustomerAddress2.sendKeys(Customeraddress2);
			}
			
			public void EnterCity(String city)
			{
				City.sendKeys(city);
			}
					
			public void EnterCountry(String country)
			{
				Country.sendKeys(country);
			}		
			public void EnterState(String state)
			{
				State.sendKeys(state);
			}	
			public void EnterCustomerId(String customerId)
			{
				CustomerId.sendKeys(customerId);
			}	
			
			public void EnterPrimaryNo(String primaryNo)
			{
				PrimaryNo.sendKeys(primaryNo);
			}
			
			public void EnterEmailid(String emailID)
			{
				EmailID.sendKeys(emailID);
			}
			
			public void EnterOrgName(String orgName)
			{
				OrgName.sendKeys(orgName);
			}
			
			public void EnterSubOrg(String subOrg)
			{
				SubOrg.sendKeys(subOrg);
			}  
			
			public void CustomerType(String customerType)
			{
				CustomerType.sendKeys(customerType);
			}  
			
			public void ProblemDesc(String problemDesc)
			{
				ProblemDesc.sendKeys(problemDesc);
			}  
			
			public void ProductName(String productName)
			{
				ProductName.sendKeys(productName);
			}  
			
			public void ModelName(String modelName)
			{
				ModelName.sendKeys(modelName);
			}  
			
			public void ProductSerialNo(String productSerialNO)
			{
				ProductSerialNO.sendKeys(productSerialNO);
			}  
			
			public void WarrantyType(String warrantytype)
			{
				WarrrantyType.sendKeys(warrantytype);
			}  
			
			
			public void SepcialInstructions(String specialInstructions)
			{
				SpecialInstructions.sendKeys(specialInstructions);
			}  
			
			public void Remarks(String remarks)
			{
				Remarks.sendKeys(remarks);
			} 
		
			public void StartTime(String startTime)
			{
				StartTime.sendKeys(startTime);
			} 
			
			
			public void Endtime(String endTime)
			{
				EndTime.sendKeys(endTime);
			} 
			
			public void Engineer(String engineer)
			{
				Engineer.sendKeys(engineer);
			}				
				//WebElement AddCustomerButton1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")));
			
		
			
			public void saveCreateCall() throws InterruptedException
			
			{   // ldriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			     SaveCall.click();
				Thread.sleep(10000);
			}	
            public void SaveAttachments() throws InterruptedException
			
			{   // ldriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            	CallLink.click();
				Thread.sleep(10000);
				WorkflowLink.click();
				Thread.sleep(10000);
				SearchTextBox.sendKeys("8066774990877393400314099");
				Go.click();
            	Thread.sleep(3000);
            	AddAttachmentsLink.click();
            	ChooseFile.sendKeys("C:\\Users\\fieldez\\Desktop\\new\\desktop\\product images\\darjeeling.jpg");
            	SaveAttachments.click();
            	Thread.sleep(10000);
            	
            	// JavaScripto to scroll to an Element
            	JavascriptExecutor js=(JavascriptExecutor) ldriver;
            	js.executeScript("arguments[0].scrollIntoView();",AttachmentSection);
            	
            	AttachmentSection.click();
            	
            	
			}	
			
		}




