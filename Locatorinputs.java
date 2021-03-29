package Helperinputs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Locatorinputs {

File file = new File(System.getProperty("user.dir") +"\\src\\Helperinputs\\locaterInputs.properties");

FileInputStream inputStream = null;
Properties property = null;


	 public Locatorinputs() {
		 try {
			 inputStream = new FileInputStream(file);
			 } catch (FileNotFoundException e) {
			 e.printStackTrace();
			 }

			 property = new Properties();

			 try {
			 property.load(inputStream);
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
	
	}

	String  Url="https://demoqa.com/automation-practice-form";
	String Driver="webdriver.chrome.driver";
	String DriverPath="C:\\Users\\arun.chinnapilla\\drivers\\chromedriver.exe";


	 public String getUrl() {
			return Url;
	}
	 public String getDriver() {
		return Driver;
		}
	public String getDriverPath() {
			return DriverPath;
	}




	public By getuName() {
		By uName=By.id(property.getProperty("uName"));
		return uName;
	}
 public By getuserEmail()
 {
	  By mail = By.id(property.getProperty("mail"));
			 return mail;
 }
 public By getLastname() {
	 By Lastname=By.id(property.getProperty("Lastname"));
		return Lastname;
		}
 public By getMale() {
	 By Male=By.xpath(property.getProperty("Male"));
		return Male;
	}
 public  By getFemale() {
	 By Female=  By.xpath(property.getProperty("Female"));
		return Female;
}
 public By getMobileNumber() {
	 By  Mobile= By.id(property.getProperty("Mobile"));
		return Mobile;
	}
 public By  getSubjects() {
	 By Subjects =By.id(property.getProperty("Subjects"));
		return Subjects;
	}
 public By  getHobbie() {
	 By hobbie=By.xpath(property.getProperty("hobbie"));
		return hobbie;
}
 public By  getChoosefile() {
	 By choosefile=By .xpath(property.getProperty("choosefile"));
		return choosefile;
	}
 public By getCurrentAddress() {
	 By Address=By.id(property.getProperty("CurrentAddress"));
		return Address;
		}
 public By getState() {
	 By State =By.id(property.getProperty("State"));
		return State;
		}
 public By getCity() {
       By selectCity=By.id(property.getProperty("City"));
		return selectCity;
	}
	public By getSubmit() {
		By done=By.id(property.getProperty("done"));
		return done;
}

}
