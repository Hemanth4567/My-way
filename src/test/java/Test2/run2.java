package Test2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:src/test/java/Test2/output/jason.json"})
public class run2 {
	

}
