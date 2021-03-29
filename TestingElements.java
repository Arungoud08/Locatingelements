package userInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helperinputs.Locatorinputs;
import TestingMethodForElements.TestMethods;

public class TestingElements {
	public static void main(String[] args)  {
		Locatorinputs locator=new	Locatorinputs();
		
		System.setProperty(locator.getDriver(),locator.getDriverPath());
		WebDriver driver= new ChromeDriver();
		driver.get(locator.getUrl());
		
	TestMethods m= new TestMethods();
m.enterSubmit(driver);

	

		}


}