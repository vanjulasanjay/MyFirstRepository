package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\hooks.feature",
				 glue = "com.hooks",
				 dryRun = true,
				 monochrome = true
				 //tags = "@SmokeTest or @RegressionTest and not @E2ETest"
				 )
public class TestRunner {

}
