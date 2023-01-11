package stepdefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.*;
import utilities.Driver;


public class ParameterizedStepsExampleStepDefinitions {

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("test faild!");
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        }
    }
}