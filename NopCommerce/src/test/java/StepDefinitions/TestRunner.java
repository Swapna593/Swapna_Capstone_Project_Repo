package StepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",
                 glue={"StepDefinitions"},
                 plugin= {"pretty","html:target/HTML/htmlreport1.html",
		                           "json:target/JSON/jsonreport1",
		                           "junit:target/JUNIT/junitreport1"}
                 )
public class TestRunner {

}
