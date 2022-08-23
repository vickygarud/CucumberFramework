package cucumberOptions;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/OrangeHrmLogin.feature",
        glue = "stepDefinations/orangehrm", dryRun = false,
        monochrome = true, plugin = {"pretty", "html:target/Reports/cucumber.html"})
public class TestRunner {
}

/*

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/OrangeHrmLogin.feature",
        glue = "stepDefinations/orangehrm", dryRun = true, tags = "@SmokeTest",
        monochrome = true,
        plugin = {"pretty", "html:target/Reports/cucumber.html", "junit:target/Reports/junit.xml"})*/
