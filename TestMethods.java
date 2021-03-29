package TestingMethodForElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helperinputs.Locatorinputs;
import Helperinputs.inputsForSendKeys;



public class TestMethods {
	Locatorinputs locator=new	Locatorinputs();
	inputsForSendKeys sendkeys= new  inputsForSendKeys(); 
	
	public void enterMail(WebDriver driver)  {
	     WebDriverWait wait = new WebDriverWait(driver, 10);
		 try {
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getuserEmail()));

		 if(element.isDisplayed()) {
			 System.out.println("sucessfully located the mail block");
			WebElement mail= driver.findElement(locator.getuserEmail());
			 mail.sendKeys(sendkeys.getEmail());
			 }
    	 }
		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("mail locator not found  please replace the locator"+ timeout);
			}
      catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("mail locator not found please replace the locator"+e);
		}
		 
	}
	
	public void enterFirstName(WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	 try {
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getuName()));
    if(element.isDisplayed()) {
			 System.out.println("sucessfully located the firstname block");
				WebElement userName= driver.findElement(locator.getuName());
				 userName.sendKeys(sendkeys.getfirstName());
			 }
    	 }

	 catch(TimeoutException timeout)
		{
	       timeout.printStackTrace();
		 System.out.println("Firstname locator not found  please replace the locator"+ timeout);
		}
catch(Exception e)
	{
	 e.printStackTrace();
	 System.out.println("FirstName locator not found please replace the locator");
	}
	}
	public void enterLastName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getLastname()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the lasttName block");
				 WebElement LastName= driver.findElement(locator.getLastname());
				 LastName.sendKeys(sendkeys.getLastName());
				 }
	    	 }

		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("lastName locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("lastName locator not found please replace the locator");
		}
		
			
		}
	
public void enterMobileNumber(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getMobileNumber()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the Mobile number block");
				 WebElement MobileNo= driver.findElement(locator.getMobileNumber());
				 MobileNo.sendKeys(sendkeys.getMobileNumber());
				 }
	    	 }

		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("mobileNumber locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("mobileNumber locator not found please replace the locator");
		}
		
			
		}
	public void selectHobbie(WebDriver driver) {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator.getHobbie()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the hobbies block");
				 element.click();
				 }
	    	 }

		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("Hobbies locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("Hobbies locator not found please replace the locator");
		}
		
			
		}
	public void selectMaleAsGender(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator.getMale()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the gender block");
				 element.click();
				 }
	    	 }

		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("Gender locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("Gender locator not found please replace the locator");
		}
			
		}
	public void  selectFemaleAsGender(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator.getFemale()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the gender block");
				 }
	    	 }

		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("Gender locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("Gender locator not found please replace the locator");
		}
			
		}
	
			
		
	public void  uploadPicture(WebDriver driver) {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator.getChoosefile()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the uploadPicture block");
				 WebElement file= driver.findElement(locator.getChoosefile());
				 file.sendKeys(sendkeys.getFile());
				 }
	    	 }
		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("uploadPicture locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("uploadPicture locator not found please replace the locator");
		}
			
		}
	public void  enterCurrentAddress(WebDriver driver) {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getCurrentAddress()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the CurrentAddress block");
				 WebElement ad=driver.findElement(locator.getCurrentAddress());
						 ad.sendKeys(sendkeys.getcurrentAddress());
				 }
	    	 }
		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("CurrentAddress locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("CurrentAddress locator not found please replace the locator");
		}
		
			
		}
	public void  giveSubjects(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 try {
			 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.getSubjects()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the Subjects block");
					driver.findElement(locator.getSubjects()).sendKeys(sendkeys.getSubject());
					 Robot robot = null;
						try {
							robot = new Robot();
						} catch (AWTException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						robot.keyPress(KeyEvent.VK_DOWN);
						robot.keyRelease(KeyEvent.VK_DOWN);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
				 }
	    	 }

		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("Subjects  locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("Subjects  locator not found please replace the locator");
		}
		
	}
	public void  selectStateAndCity(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		 try {
			 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(locator.getState()));
			 WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(locator.getCity()));
	    if(element1.isDisplayed()&element2.isDisplayed()) {
				 System.out.println("sucessfully located the State block and city block");
					WebElement state=	driver.findElement(locator.getState());
					state.click();
					WebElement statevalue=	driver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
					statevalue.click();
					 WebElement city=	driver.findElement(locator.getCity());
						city.click();
						WebElement cityvalue=	driver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
						cityvalue.click();
				 }
	    	 }

		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("State  locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("State  locator not found please replace the locator");
		}
	
        }
	public void  enterSubmit(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		 try {
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator.getSubmit()));
	    if(element.isDisplayed()) {
				 System.out.println("sucessfully located the Submit button");
				 element.click();
				
				 }
	    	 }
		 catch(TimeoutException timeout)
			{
		       timeout.printStackTrace();
			 System.out.println("Submit button locator not found  please replace the locator"+ timeout);
			}
	catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("Submit button locator not found please replace the locator");
		} 
		 
	}
//	public void  selectCity(WebDriver driver) {
//	
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		driver.manage().window().maximize();
//		 try {
//			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator.getCity()));
//	    if(element.isDisplayed()) {
//				 System.out.println("sucessfully located the City block");
//				 WebElement city=	driver.findElement(locator.getCity());
//					city.click();
//					WebElement cityvalue=	driver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
//					cityvalue.click();
//				 }
//	    	 }
//
//		 catch(TimeoutException timeout)
//			{
//		       timeout.printStackTrace();
//			 System.out.println("city locator not found  please replace the locator"+ timeout);
//			}
//	catch(Exception e)
//		{
//		 e.printStackTrace();
//		 System.out.println("ciry locator not found please replace the locator");
//		}
//        }

	
}


