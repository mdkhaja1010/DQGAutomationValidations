package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseTest;

public class DataQualityRules extends BaseTest{

	public DataQualityRules(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="[class*='MuiTypography-root MuiTypography-body1 MuiListItemText-primary']")private List<WebElement> lstElem;
	@FindBy(xpath ="//button[text()='Create Rule']")private WebElement createrulebutton;
	@FindBy(css="[src*='/static/media/database.0']")private WebElement databasesource;
	@FindBy(css="[type='text']")private WebElement filelist;
	@FindBy(xpath = "//button[text()='Next']")private WebElement nextbutton;
	@FindBy(css="[role='combobox']")private WebElement selecttable;
	@FindBy(xpath = "//button[text()='GO']")private WebElement gobutton;
	@FindBy(css="[class*='MuiTypography-body1 css-1ncylql']")private WebElement columnstext;
	@FindBy(css="[class*='-root css-d5fg4x']")private WebElement columns;
	@FindBy(xpath = "//table[contains(@class,'MuiTable-root css')]/tbody/tr/td[2]")private List<WebElement> listColumns;
	@FindBy(css="[class*='MuiTableCell-root MuiTableCell-body '] [class*='PrivateSwitchBase-input']")private List<WebElement> listColumnCheckboxes;
	@FindBy(css="[class='MuiBox-root css-pqs085']")private WebElement dqchecks;
	@FindBy(xpath ="//*[contains(@class,'selValBody MuiBox-root')] //*[contains(@class,'MuiCheckbox-root MuiCheckbox-colorPrimary')]")private List<WebElement> lstqualitycheckCheckboxes;
	@FindBy(xpath ="//*[contains(@class,'selValBody MuiBox-root')] //*[contains(@class,'MuiTypography-root MuiTypography-body')]")private List<WebElement> lstqualitychecknames;
	@FindBy(css = "[name='value_text']")private WebElement enterText;
	@FindBy(xpath = "//*[text()='Match Datatype']")private WebElement datatypevalidation;
	@FindBy(css="[class*='MuiBox-root css-1ir8goe'] [class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-136foal']") private List<WebElement> lstdatatype;
	@FindBy(xpath = "//*[text()='Add Data Quality Checks']")private WebElement addDataqualitycheckbutton;
	@FindBy(css = "[class*='MuiBox-root css-1ir8goe'] [class*='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary ']") private List<WebElement> lstdatatypecheckboxes;
	@FindBy(css="[class*='MuiGrid-root MuiGrid-item MuiGrid-grid-sm-6 css-1dmuaql'] [class*='MuiButton-containedSizeSmall css-1']")private WebElement createDqruleButton;
	@FindBy(css="[name='rulename']")private WebElement dqrulename;
	@FindBy(xpath = "//button[text()='Create']")private WebElement createDataqualityRule;
	@FindBy(css="[class*='MuiBox-root css-qniue5'] [aria-colindex='3']")private List<WebElement> lstDQRulenameColumn;
	
	
	
	String RuleName;
	public void enterIntodqRule(String strName)
	{
		try {
			Thread.sleep(4000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(int i=0;i<lstElem.size();i++) {
			//utilities.waitUntillElementVisible(lstElem.get(1));
			if(lstElem.get(i).getText().equals(strName)) {
				lstElem.get(i).click();		
				
			}
		}
		
		
	}
	public void createRule()
	{
		createrulebutton.click();
		
	}
	
	public void selectSource()
	{
		
		databasesource.click();
		
	}
	
	public void selectDatasourcefromList() 
	{
		utilities.waitUntillElementVisible(filelist);
		filelist.click();
		utilities.downKey();
		
		
	}
	
	public void nextButton()
	{
		nextbutton.click();
		
	}
	
	public void selectTable()
	{
		utilities.expicitWaitForVisibilityOfElement(selecttable, 15);
		selecttable.click();
		utilities.downKey();
		
	}
	
	public void goButton()
	{
		gobutton.click();
	}
	
	public void columntext()
	{
		utilities.explicitWaitForElementClickable(columnstext, 15);
		columnstext.click();
	}
	
	public void columnsvalidation()
	{
		validations.isDisplay(columns);
	}
	
	public void selectColumns(String column)
	{
		utilities.waitUntillElementVisible(listColumns.get(0));
		utilities.scrollby();
		try {
			Thread.sleep(4000);
			}catch (Exception e) {
			}
		for(int i=0;i<listColumns.size();i++)
		{
			if(listColumns.get(i).getText().equalsIgnoreCase(column))
			{
				//utilities.scrolltoElement(listColumns.get(i));
				//System.out.println(listColumns.get(i).getText());
				listColumnCheckboxes.get(i).click();
			}
		}
		
		columnstext.click();
		
	}
	public void qualityChecksValidation()
	{
		validations.isDisplay(dqchecks);
		
	}
	
	public void selectqualitychecks(String qualitycheckValues, String Value)
	{
		utilities.waitUntillElementVisible(lstqualitychecknames.get(0));
		utilities.scrollby();
		
		try {
			Thread.sleep(4000);
			}catch (Exception e) {
			}
		for(int i=0; i<lstqualitychecknames.size();i++)
		{
			if(lstqualitychecknames.get(i).getText().equalsIgnoreCase(qualitycheckValues))
			{
				utilities.waitUntillElementVisible(lstqualitycheckCheckboxes.get(i));
				lstqualitycheckCheckboxes.get(i).click();
				//System.out.println(lstqualitychecknames.get(i).getText());
				
				
			}
		}
		utilities.waitUntillElementVisible(columns);
		utilities.ClickOnElement(enterText);
		utilities.sendText(enterText, Value);
	}
	
	public void matchDatatypevalidation()
	{
		validations.isDisplay(datatypevalidation);
	}
	
	public void matchtype(String datatype)
	{
		utilities.waitUntillElementVisible(lstdatatype.get(0));
		for(int i=0;i<lstdatatype.size();i++)
		{
			if(lstdatatype.get(i).getText().equalsIgnoreCase(datatype))
			{
				lstdatatypecheckboxes.get(i).click();
				
			}
		}
	}
	
	public void addDataqualityCheck()
	{
		utilities.waitUntillElementVisible(addDataqualitycheckbutton);
		utilities.scrolltoElement(addDataqualitycheckbutton);
		utilities.ClickOnElement(addDataqualitycheckbutton);
	}
	
	public void createDQrule() {
		utilities.ClickOnElement(createDqruleButton);
		
	}
	
	public void dqruleName(String rulename)
	{
		String strRuleName=rulename+javafunctions.randomNumber();
		RuleName=strRuleName;
		
		utilities.sendText(dqrulename, strRuleName);
		
	}
	
	public void createDataQualityRule()
	{
		utilities.ClickOnElement(createDataqualityRule);
	}
	
	public void validatingDQRulename()
	{
		for(int i=0;i<lstDQRulenameColumn.size();i++)
		{
			if(lstDQRulenameColumn.get(i).getText().equalsIgnoreCase(RuleName)) {
				validations.assertionEquals(lstDQRulenameColumn.get(i).getText(), RuleName);
			}
		}
	}
}
