package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\dell\\eclipse-workspace\\CucumberPratice\\src\\test\\resources\\Features\\Flipkart.feature",glue ="org.stepsdefiniation"
,dryRun = false)

public class TestRunner {

}
