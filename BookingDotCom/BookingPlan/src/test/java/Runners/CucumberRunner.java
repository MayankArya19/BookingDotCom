package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features"}, 
glue={"stepDefinitions"},
tags="@LoginFeature", 
dryRun=false,
monochrome=true, 
plugin= {"pretty","html:target/HTMLReports.html","json:target/JSONReport.json","junit:target/JUNITReport.xml"})
public class CucumberRunner {

}
