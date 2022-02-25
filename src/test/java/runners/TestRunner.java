package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome=true,
        strict = false,
        //plugin = {"pretty:target/cucumber-htmlreport.text", "json:target/cucumber-report.json"},
        plugin = { "pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"stepsdefinitions"},
        features = {"src/test/resources/features/"},
        tags = {"smokeTest","Error"}
        )
public class TestRunner {
    public static void main(String[] args) {

        { io.cucumber.core.cli.Main.main(args); }
    }
}
