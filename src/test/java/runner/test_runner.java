package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/guru99/guru99.feature"}, glue="definition",tags="@PositiveTesting",plugin= {"html:report/htmlreport.html"})
public class test_runner  extends AbstractTestNGCucumberTests {
}