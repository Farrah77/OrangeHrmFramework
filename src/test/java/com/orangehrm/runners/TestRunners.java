package com.orangehrm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/AddEmployee.feature"
		,glue="com/orangehrm/steps"
		,monochrome=true
		,dryRun=true //=true will show any missed steps. if there are missed steps we copy them and add to steps
		              // and change dryRun to false to run normally
		,tags={"@smoke" } //, @"regression" if e want to execute several 
		)


public class TestRunners {

}
