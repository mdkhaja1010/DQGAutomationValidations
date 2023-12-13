package com.global;


import com.pagefactory.DataQualityRules;
import com.pagefactory.DQGLoginpage;


public class Objects extends BaseTest{
	
	   public DQGLoginpage loginpage=new DQGLoginpage(driver);
	   public DataQualityRules DQrule=new DataQualityRules(driver);

}
