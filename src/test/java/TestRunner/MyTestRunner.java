package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = { "src/test/resources1/features/Login.feature" },
         glue = { "Steps","Applicationhooks" },
         plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/"

}

)

public class MyTestRunner {

}
