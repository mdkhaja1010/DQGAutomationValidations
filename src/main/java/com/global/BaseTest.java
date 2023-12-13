package com.global;

import org.openqa.selenium.WebDriver;


/*
 This Class contains basic configuration annotations
 for common functionalities like launch browser and quit etc
  @Author Bhasha.k
  * */
public class BaseTest {
	
   public static  WebDriver driver;
   public PropertyFile propertyfile= new PropertyFile();
   public LogUtility log = new LogUtility();
   public Java javafunctions = new Java();
   public  UtilFunctions utilities= new UtilFunctions(driver);
   public Validations validations=new Validations();
   public String strEmail=propertyfile.getEmail();
   public String strPassword=propertyfile.getPassword();
   
	
}