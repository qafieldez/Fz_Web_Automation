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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fieldez.testcases.BaseClass1;
import com.fieldez.utilities.Generate_Radom_Data;

public class CreateExpensePage {


		//Driver object
	    WebDriver ldriver; //local driver
	    Generate_Radom_Data genData;
	    
	    //Constructor LoginPage
	    
		public CreateExpensePage(WebDriver rdriver)
	  {
			//Initiate the drivers ,Remote Driver
			ldriver=rdriver; 
			
			//PageFactory Class  //This initElements method will create all WebElements
			PageFactory.initElements(rdriver, this);
	  }
		
		
	 
	    // Web Elements are identified by "FindBy" Annotation
	    
	    //Advanced Link
	    @FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'Advanced')]")
		@CacheLookup
		WebElement AdvancedLink;
	    
	    
	  //Expense Link
	    @FindBy(xpath="//span[contains(text(),'Expense')]")
		@CacheLookup
		WebElement ExpenseLink;
	    
	    // Create Expense Link
		@FindBy(xpath="//a[@class='btn btn-second']")
		@CacheLookup
		WebElement CreateExpenselink;
		
		//-------TC 01 --completed
		
		// Add Line Item
		@FindBy(xpath="//div[@class='btn btn-second']")
		@CacheLookup
		WebElement AddLineitem;
		
		// Select Food or Travel
		@FindBy(xpath="//select[@id='selectedExpenseType']")
		@CacheLookup
		WebElement SelectFood;
		
		// Paid By Button 
		@FindBy(xpath="//select[@id='exampleInputEmail1']")
		@CacheLookup
		WebElement paidBY;
		
		// Amount Value
		@FindBy(xpath="//div[@id='LineItemsModal']//div[3]//div[1]//input[1]")
		@CacheLookup
		WebElement Amount;
		
		
		
		// Save Line Item disabled Button 
		@FindBy(xpath="//button[@class='btn btn-prime disabled']")
		@CacheLookup
		WebElement SavebuttonDisabled;
		
		// Save Line Item Enabled Button 
		@FindBy(xpath="//div[@class='col-sm-9 footer-btn-section form-group']//button[@class='btn btn-prime'][contains(text(),'Save')]")
		@CacheLookup
		WebElement SaveItem;
		
		// Click Expense Date Picker
		@FindBy(css="#dropdown .input-group-addon")
		@CacheLookup
		WebElement ClickCalendar;
		
		// Select Date
		@FindBy(css=".form-group:nth-child(3) .ng-scope:nth-child(4) > .day:nth-child(4)")
		@CacheLookup
		WebElement SelectDate;
		
		
		// Submit Expense
		@FindBy(xpath="//button[@id='step5']")
		@CacheLookup
		WebElement submitexp;
		
		
		public void AdvancedLink() throws InterruptedException
		{   
			AdvancedLink.click();
		}
		
		public void ExpenseLink() throws InterruptedException
		{   
			ExpenseLink.click();
		}
		
		
		public void CreateExpense() throws InterruptedException
		{   
			CreateExpenselink.click();
		}
		
		public void AddLineItem() throws InterruptedException
		{   
			AddLineitem.click();
		}
		
		
		public void selectFoodTravel() throws InterruptedException
		{   
			
			Select SF = new Select(SelectFood);
			SF.selectByVisibleText("Food");
		}
		
		
		public void PaidBy() throws InterruptedException
		{   
			
			Select pb = new Select(paidBY);
			pb.selectByVisibleText("Client");
		}
		
		public void Amount(String amt) throws InterruptedException
		{   
			
			Amount.sendKeys(amt);
			
		}
		
		public void savebuttondisabled() throws InterruptedException
		{   
			
			SavebuttonDisabled.click();
		}
		
		
		public void savebuttonEnabled() throws InterruptedException
		{   
			
			SaveItem.click();
		}
		
		public void clickDatePicker() throws InterruptedException
		{   
			
			ClickCalendar.click();
		}
		
		
		public void SelectExpenseDate() throws InterruptedException
		{   
			
               SelectDate.click();
		}
		
		public void SubmitExpense() throws InterruptedException
		{   
			
			submitexp.click();
		}
	}




