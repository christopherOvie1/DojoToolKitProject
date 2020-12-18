package myRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"classpath:Problematic.Feature"},
        glue = {"classpath:stepDefinition"},
        monochrome = true,  //display the console in a proper readable format
        dryRun  = false ,  //check the mapping is proper between the feature file and step def file
        plugin = {"pretty","html:target/cucumber-html-report",  "json:target/cucumber.json"}
               )
public class TestRunner {

}
