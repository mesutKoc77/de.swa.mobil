package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "/Users/mesut/Desktop/swa Mobil/automation/de.swa.mobil/src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@mesut",
        dryRun =false


)

public class Runner {

}
