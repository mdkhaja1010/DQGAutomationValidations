package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features",
glue = {"com.steps"},
dryRun =false, 
tags="@DataQualityRule",
monochrome = true,
plugin={"pretty","html:test-output",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:Reports//JSON_Reports//cucumber.json",
		"junit:Reports//JUNiT_Reports//cucumber.xml"}
)
public class Runner {

}
