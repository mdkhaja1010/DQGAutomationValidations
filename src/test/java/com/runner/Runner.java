package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features",
glue = {"com.steps","com.hooks"},
dryRun =false, 
monochrome = true,
plugin={"pretty","html:test-output",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class Runner {

}
