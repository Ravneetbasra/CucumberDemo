package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	// if we want to run setup methods specific to the particular tag Test eg. @NetBankingTest, @RegressionTest, @smokeTest etc before 
	// testcase, use Before annotation
	// Execution order -->Before -->Background -->Scenario --->After
	// Before and After are Cucumber Hooks
	
	@Before("@NetBankingTest")
	public void netBankingSetup() {
		System.out.println("************************");
		System.out.println("setup the enteries in NetBanking database");
	}
	
	// Below code will execute after each and every scenario
	@After
     public void tearDown() {
		
		System.out.println("clear the entries");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("************************");
		System.out.println("setup the enteries in Mortgage database");
	}
}
