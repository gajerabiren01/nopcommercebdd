package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",tags = "@register", plugin = {"pretty", "html:target/cucumber-reports/reptort.html"},publish = true)

public class RunCuke

{

}
