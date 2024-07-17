package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

       (
	features=".//Features//OrangrhrmLogin.feature",
	glue="stepDefination",
	dryRun=false,
	monochrome = true,
	plugin= {"pretty",
			    "html:test-output"
	        }
        )
public class TestRun 
{

}
