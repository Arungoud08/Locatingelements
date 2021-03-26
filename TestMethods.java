package TestingMethodForElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helperinputs.Locatorinputs;



public class TestMethods {
	
	public void TestMail(WebDriver driver)  {
		Locatorinputs locator=new	Locatorinputs();
	     WebDriverWait wait = new WebDriverWait(driver, 10);
		 try {
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator.getMail())));

		 if(element.isDisplayed()) {
			 System.out.println("sucess");
			 }
    	 }
      catch(Exception e)
		{
		 e.printStackTrace();
		 System.out.println("locator not find please replace the locator");
		}
	}
	
	public void enterFirstName(WebDriver driver) {
	Locatorinputs locator=new	Locatorinputs();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	 try {
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator.getuName())));
    if(element.isDisplayed()) {
			 System.out.println("sucess");
			 }
    	 }

	catch(Exception e)
		{
		 e.printStackTrace();//It is a method of Java’s throwable class which prints the throwable along with other details like the line number and class name where the exception occurred.
		 System.out.println("locator not find please replace the locator");
		 
		}
	
		
	}
}


