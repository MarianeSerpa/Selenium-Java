package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/reports/cucumberTests.json",
                "html:target/reports/cucumberReport.html"
        },
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "not @Ignore"
)
public class RunCucumber extends RunBase {

    @AfterClass
    public static void stop() {
        getDriver().quit();
    }
}
