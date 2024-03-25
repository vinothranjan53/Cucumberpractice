package scenariotestwithdata;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {

	
	@Given ("open browser as {string}")
	public static void openbrowser(String data1) {
		System.out.println("user must able to open the browser as "+data1);
	}
	@When ("enter url as {string}")
	public static void enterurl(String data2) {
		System.out.println("user must able to enter url as "+data2);
	}
	@When ("enter username as {string}")
	public static void enterusername(String data3) {
		System.out.println("user must able to enter username as "+data3);
	}
	@And ("enter password as {string}")
	public static void enterpassword(String data4) {
		System.out.println("user must able to enter password as "+data4);
	}
	@But ("dont click remember button")
	public static void rememberbutton() {
		System.out.println("user must not click remember button");
	}
	
	@Then ("verify welcome page as {string}")
	public static void verifywelcomepage(String data5) {
		System.out.println("user must verify welcome page as "+data5);
	}

}
