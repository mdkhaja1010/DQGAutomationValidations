package com.pagefactory;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseTest;
import com.global.Browsers;
import com.global.ConstantData;

public class DQGLoginpage extends BaseTest {

	
	public DQGLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="[id*=':rb']") private WebElement logintodqgbutton;
	@FindBy(css="[type='email']")private WebElement email;
	@FindBy(css="#idSIButton9")private WebElement nextbutton;
	@FindBy(css="[type='password']")private WebElement password;
	@FindBy(css="[id*='idSIBut']")private WebElement signinbutton;
	@FindBy(css="[type='submit']")private WebElement yesbutton;
	@FindBy(xpath = "//button[text()='Confirm']")private WebElement confirmbutton;
	
	public void loginToDqg()
	{
		logintodqgbutton.click();
		
	}
	public void enterValidCredentials() throws InterruptedException
	{

		utilities.waitUntillElementVisible(email);
		utilities.windowHandle(ConstantData.microsoftTitle.getdata());
		utilities.waitUntillElementVisible(email);
		email.click();
        email.sendKeys(propertyfile.getEmail());
        nextbutton.click();
        password.sendKeys(propertyfile.getPassword());
        utilities.waitUntillElementVisible(signinbutton);
       
        
        
        
	}
	
	public void signin()
	{
		    signinbutton.click();
	        yesbutton.click();
	        utilities.windowHandle(ConstantData.DQGTitle.getdata());
	        utilities.expicitWaitForVisibilityOfElement(confirmbutton, 15);
	        confirmbutton.click();
	}
}
