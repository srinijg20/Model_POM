package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests/End2End.feature", glue = {
		"stepDefinitions" }, plugin = "json:json_output/cucumber.json", dryRun = false, strict = true, tags = {
				"@Srini" }, monochrome = true)
public class TestRunner {
}