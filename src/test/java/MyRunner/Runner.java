package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\eclipse codes\\Cucumber\\feature\\demo_login.feature",
glue= {"StepDef"},
tags= {"@login2"})

public class Runner {

}
