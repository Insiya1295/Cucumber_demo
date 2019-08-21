package Step_definations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium_workplace\\Cucumber_Demo_Project\\Feature456\\mytest999.feature",glue="Step_definations",plugin= {"html:src/cucumber-report.html","json:target/cucumber-reports.json"})
public class Runner {

}
