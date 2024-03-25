package scenariotest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {
	@Before
	public static void checkup() {
		System.out.println("*********user must able to switch on the system***********");
	}
	@After
	public static void checkdown() {
		System.out.println("********user must able to switch on the system************");
	}
	
	
	
	
	@BeforeAll
	public static void switchonsys() {
		System.out.println("++++++++++++++user must able to switch on the system+++++++++++++");
	}
	@AfterAll
	public static void switchoffsys() {
		System.out.println("+++++++++user must able to switch on the system++++++++++");
	}
	
	
	
	
	
	@BeforeStep
	public static void opendb() {
		System.err.println("user must able to open data base");
	}

	@AfterStep
	public static void closedb() {
		System.err.println("user must able to close data base");
	}

	@Given("open browser")
	public static void openbrowser() {
		System.out.println("user must able to open the browser");
	}

	@When("enter url")
	public static void enterurl() {
		System.out.println("user must able to enter url");
	}

	@When("enter username")
	public static void enterusername() {
		System.out.println("user must able to enter username");
	}

	@And("enter password")
	public static void enterpassword() {
		System.out.println("user must able to enter password");
	}

	@But("dont click remember button")
	public static void rememberbutton() {
		System.out.println("user must not click remember button");
	}

	@Then("verify welcome page")
	public static void verifywelcomepage() {
		System.out.println("user must verify welcome page");
	}

}
