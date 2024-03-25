package scenariooutlinetestwithdata;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefenition {
	
	@Given ("open browser as {string}")
	public void openbrowser(String data1) {
		System.out.println("user should able to open browser-----------"+data1);
	}
	@When ("enter url as {string}")
	public void enterurl(String data1) {
		System.out.println("user should able to enter url-----------"+data1);
	}
	@When ("enter username as {string}")
	public void enterusername(String data1) {
		System.out.println("user should able to enter username-----------"+data1);
	}
	@And ("enter password as {string}")
	public void enterpassword(String data1) {
		System.out.println("user should able to enter username------------"+data1);
	}
	@When ("click login button")
	public void clicklogin() {
		System.out.println("user should able to  click login");
	}
	@But ("dont click remember button")
	public void dontclickremember() {
		System.out.println("user should  not click remember button");
	}
	@Then ("verify username as {string}")
	public void verifyusername(String data1) {
		System.out.println("user should  be able to verify username-----------"+data1);
		System.out.println("-----------------------------------");
		System.out.println();
	}

}
