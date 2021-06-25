package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/taggedFeatures/",
		glue = "stepdefs",
		dryRun = false,
		monochrome = true,
//		tags="@Regression"
		tags="@Regression or @Smoke"
//		tags="@Regression and @Smoke"
//		tags="@Regression and not @Smoke"
//		tags="@Regression and not @E2E"
//		tags="@E2E1 and not @Regression and not @Smoke"
		)
public class TaggedRunner extends AbstractTestNGCucumberTests {
	
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//	}
}
