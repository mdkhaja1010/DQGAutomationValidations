package com.global;

import org.openqa.selenium.WebDriver;
import com.pagefactory.AddToCartPage;
import com.pagefactory.HomePage;
import com.pagefactory.SearchProductPage;

/*
 This Class contains basic configuration annotations
 for common functionalities like launch browser and quit etc
  @Author Mohammed Imran
  * */
public class BaseTest {
	
   public static  WebDriver driver;
   public PropertyFile propertyfile= new PropertyFile();
   public CreateLog log = new CreateLog();
   public DateTime datetime = new DateTime();
   public  UtilFunctions utilities= new UtilFunctions(driver);
   public Validations validations=new Validations();
   public ReadExcellFile readexcell=new ReadExcellFile();
   public HomePage homepage;
   public SearchProductPage searchproductpage;
   public AddToCartPage addtocartpage;
   public String url=propertyfile.getApplicationUrl();
   public String title=readexcell.readDataFromExcel("SearchProduct", 1, 1);
   public String browser=propertyfile.getApplicationBrowser();
	
}