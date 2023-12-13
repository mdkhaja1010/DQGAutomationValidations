package com.steps;

import com.global.Objects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class DataQualityRules extends Objects {
	
	@Given("Launch DQG Application")
	public void launch_dqg_application() {
		utilities.maximizeWindow();
		loginpage.loginToDqg();
	}

	@And("Enter the valid Credentials for accessing DQG")
	public void enter_the_valid_credentials_for_accessing_dqg() throws InterruptedException {
		loginpage.enterValidCredentials();
	}

	@And("Click on Sign button")
	public void click_on_sign_button() {
		loginpage.signin();
	}
	
	@And("Enter into {string} module")
	public void enter_into_module(String DataQualityRules) {
		
		DQrule.enterIntodqRule(DataQualityRules);
	}

	@And("Create rule by selecting Database")
	public void create_rule_by_selecting_database() {
		DQrule.createRule();
	}

	@And("Select Data Source List")
	public void select_data_source_list() {
		DQrule.selectSource();
		DQrule.selectDatasourcefromList();
	}

	@And("Click on Next button")
	public void click_on_next_button() {
		DQrule.nextButton();
	}

	@And("Select table from list")
	public void select_table_from_list() {

		DQrule.selectTable();
	}

	@And("Click on Go button")
	public void click_on_go_button() {

		DQrule.goButton();
	}

	@And("Click on the Columns Text")
	public void click_on_the_columns_text() {

		DQrule.columntext();
	}

	@And("Validate the columns are displayed")
	public void validate_the_columns_are_displayed() {

		DQrule.columnsvalidation();
	}

	@And("Select {string} from Column name in Table")
	public void select_from_column_name_in_table(String Column) {
		DQrule.selectColumns(Column);
	}

	@And("Validate select data quality checks is visible")
	public void validate_select_data_quality_checks_is_visible() {

		DQrule.qualityChecksValidation();
	}

	@And("Select {string} from Data Quality Checks  and update {string} in text field")
	public void select_from_data_quality_checks_and_update_in_text_field(String qualitychecks, String entervalue) {
		DQrule.selectqualitychecks(qualitychecks, entervalue);
	}

	@And("Validate  Match data type is visible")
	public void validate_match_data_type_is_visible() {
		DQrule.matchDatatypevalidation();
	}

	@And("Select {string} from Match Datatype")
	public void select_from_match_datatype(String datatype) {

		DQrule.matchtype(datatype);
	}

	@And("Click on Add Data Quality Checks button")
	public void click_on_add_data_quality_checks_button() {
		DQrule.addDataqualityCheck();
	}

	

	@And("Click on create DQ rule button")
	public void click_on_create_dq_rule_button() {

		DQrule.createDQrule();
	}

	@And("Update {string} in DQ Rule name field")
	public void update_in_dq_rule_name_field(String dqname) {
	
		DQrule.dqruleName(dqname);
	}

	@And("Click on Create button")
	public void click_on_create_button() {
		DQrule.createDataQualityRule();
	}

	@Then("Validate DQ rule name is updated in the Data Quality module")
	public void validate_dq_rule_name_is_updated_in_the_data_quality_module() {
		DQrule.validatingDQRulename();
	}



}
