package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



/* if you want to run with Smoke  Test only
@CucumberOptions(features = "src/test/java/features", glue= "stepDefinitions", monochrome=true, tags= "@SmokeTest")
public class TestNGRunner extends AbstractTestNGCucumberTests{

}

*/

/* if you want to run Test Cases that are both Smoke and Regression Test
@CucumberOptions(features = "src/test/java/features", glue= "stepDefinitions", monochrome=true, tags= "@SmokeTest and @RegressionTest")
public class TestNGRunner extends AbstractTestNGCucumberTests{

}

*/
/* if you want to run Test Cases that not Regression test Example maybe used to run web testcases only or Mobile Testcases if
 *  testcases are not part of current sprint
@CucumberOptions(features = "src/test/java/features", glue= "stepDefinitions", monochrome=true, tags= "not  @RegressionTest")
public class TestNGRunner extends AbstractTestNGCucumberTests{

}

*/

/*
 *  feature : path of the feature file
 *  glue: stepDefinition package Name for execution of the Cucumber framework
 *  monochrome: able to read the reporting in the output in readable and clean by removing color text 
 *  plugin = {"pretty"} --> Reports will come in colors, if all test are passed come in Green and any test is failed it will come in red color
 *  dryRun = true --> will act as a compiler to check errors before running the  testcases to depic the errors which need to be fixed before 
 *  running testcases.
*/

// if you want to run testcases with Smoke or Regression tag
@CucumberOptions(features = "src/test/java/features", glue= "stepDefinitions", monochrome=true, tags= "@NetBankingTest or @Mortgage", dryRun = true,
plugin = {"pretty", "html:target/cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
