package scenariotags;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefenition {
	
	
	@Given ("login with valid data")
	public void loginwithvalidata() {
		System.out.println("validate login page with valid data");
	}

	
	@Given ("login with invalid data")
	public void loginwithinvaliddata() {
		System.out.println("validate login page with in valid data");
	}
	
	
	@Given ("login with empty data")
	public void loginwithemptydata() {
		System.out.println("validate login page with valid data");
	}


	@Given ("search the required product")
	public void search() {
		System.out.println("search the required product in the searchbar");
	}

	
	@Given ("check the description")
	public void description() {
		System.out.println("validate the product specifications in the description");
	}

	

	
	@Given ("check the add to cart funtion")
	public void addtocart() {
		System.out.println("validate the add to cart funtionality by adding the product to it");
	}


	
	@Given ("check the payment funtion")
	public void payment() {
		System.out.println("validate the payment funtionality");
	}

	
	@Given ("check the mail and message")
	public void info() {
		System.out.println("validate the mail and message verification funtionality");
	}

}
