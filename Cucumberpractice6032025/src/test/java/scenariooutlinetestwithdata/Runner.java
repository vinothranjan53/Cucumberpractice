package scenariooutlinetestwithdata;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@login",plugin = {"pretty","html:reports/index.html",
		"json:reports/index.json",
		"junit:reports/index.xml"},monochrome=true)
public class Runner {

}
