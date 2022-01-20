package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Owner\\eclipse-workspace\\InternshipJan2022BDDPOM\\src\\test\\java\\featuresPackage",
glue = "stepDefination",
monochrome = true,
plugin = {"pretty", "html:target/HTML report/InternshipReport.html"}
)

public class RunnerTest {

}
