package Step_definations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="Feature456",glue="Step_definations",plugin= {"html:target/cucumber-report.html","json:target/cucumber-reports.json"})
public class Runner {

}
