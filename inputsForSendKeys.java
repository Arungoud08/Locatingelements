package Helperinputs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class inputsForSendKeys {
	

		File file = new File(System.getProperty("user.dir") +"\\src\\Helperinputs\\locaterInputs.properties");

		FileInputStream inputStream = null;
		Properties property = null;


			 public inputsForSendKeys() {
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

			 public String getfirstName() {
					
					return property.getProperty("firstName");
				}

public String getLastName() {
	
	return property.getProperty("lastName");
}
 public String getEmail() {					
return property.getProperty("Email");
					}	
			 
public String getMobileNumber() {
	
	return property.getProperty("mobileNumber");
}
public String getSubject() {
	
	return property.getProperty("subject");
}
public String  getFile() {
	return property.getProperty("file");
}
public String getcurrentAddress() {
	return property.getProperty("currentAddress");
}
public String getState() {
	return property.getProperty("State");
}

public String getcity() {
	return property.getProperty("city");
}



}
