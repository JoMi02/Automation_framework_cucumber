package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinition"},
        tags = "@contact-us",
        monochrome = true, dryRun = false)

public class MainRanners extends AbstractTestNGCucumberTests {
    @DataProvider (parallel = true)
    public Object [][]scenarios (){
        return super.scenarios();
    }

}
