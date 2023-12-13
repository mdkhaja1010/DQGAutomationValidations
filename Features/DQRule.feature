Feature: As a user i want to validate Data Quality Rules
@DataQualityRule
  Scenario: Verify the user able to create a New Rule in Data Quality Rules 
    Given Launch DQG Application
    And Enter the valid Credentials for accessing DQG
    And Click on Sign button
    And Enter into "Data Quality Rules" module
    And Create rule by selecting Database
    And Select Data Source List 
    And Click on Next button
    And Select table from list
    And Click on Go button
    When Click on the Columns Text
    And Validate the columns are displayed 
    And Select "Country" from Column name in Table
    And Validate select data quality checks is visible
    And Select "Ends with" from Data Quality Checks  and update "a" in text field
    And Validate  Match data type is visible
    And Select "Text" from Match Datatype
    And Click on Add Data Quality Checks button
    And Click on create DQ rule button
    And Update "Postgres DQRule" in DQ Rule name field
    And Click on Create button
    Then Validate DQ rule name is updated in the Data Quality module
    
  
    
    
    
