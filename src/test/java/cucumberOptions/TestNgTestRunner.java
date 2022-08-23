package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features/OrangeHrmLogin.feature", glue = "stepDefinations/orangehrm",
        plugin = {"pretty", "html:target/Reports/cucumber.html"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

/*
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/
}

