package cucumberOptionsPackage;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
glue = {"stepDefinition"},
monochrome = true,
//tags= "@user",
// tags = "@newUser",
// tags = "@login",
plugin = {
"pretty", "html:target/reports/index.html",
"pretty", "json:target/reports/cucumber.json",
"pretty", "junit:target/reports/cucumber.xml",
"pretty", "testng:target/reports/cucumber.xml"
}
)





public class TestRunner {





}
