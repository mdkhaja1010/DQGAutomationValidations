package com.global;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* This class contains the methods which is used to read data from propertyfile
 *@Author bhasha.k */
public class PropertyFile {
	Constants constantutility = new Constants();
	FileInputStream fis;
	Properties pro;
	/* This methods will read specific key value form the propertyfile */
	public PropertyFile() {
		File f=new File(constantutility.getPropertyFilePath());
		try {
			fis= new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	public String getEmail() {
		String strEmail=pro.getProperty("email");
		return strEmail;
	}
	
	public String getPassword() {
		String strPassword=pro.getProperty("password");
		return strPassword;
	}
	
	public String getRuleName()
	{
		String strRulename=pro.getProperty("DQRuleName");
		return strRulename;
	}
	
	
	
}
