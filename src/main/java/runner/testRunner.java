package runner;

//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/shris/IdeaProjects/FreeCRMBDDFramework/src/main/java/Features/login.feature"}, //path of feature file
        glue={"StepDefinitions"},   //path of the step definition file
        plugin={"html:test-output","json:json_output/cucumber.json"},  //generate report in a html/json format
        dryRun = false,  //checks the mapping of steps in feature file and step definition file
        monochrome = true,
        stepNotifications = true,
        publish = true
)  //result in console in a readable format
public class testRunner {
}
