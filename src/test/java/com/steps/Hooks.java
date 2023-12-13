package com.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.global.BaseTest;
import com.global.Browsers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseTest{
  
	@Before
	public void setUp() {
		
//		switch(Browsers.Browser.getdata()){
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			break;
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			driver= new EdgeDriver();
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//			break;
//		default:
//			System.out.println("error");
//		}
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		log.Info("Successfully browser launched");
		driver.get(Browsers.URL.getdata());
		log.Info("Successfully DQG_Tool launched");
	}
	@After
	public void tearDown(Scenario scenario) {
		 if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	driver.quit();
	log.Info("Successfully DQG_Tool Closed");
	}

}
