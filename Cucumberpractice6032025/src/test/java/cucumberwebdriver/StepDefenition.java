package cucumberwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {

	WebDriver wd;

	@Given("open browser as {string}")
	public void openbrowser(String data1) {
		if (data1.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		} else {
			System.out.println("browser is not chrome");
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	@When("enter url as {string}")
	public void enterurl(String data2) {
		wd.get(data2);
	}

	@When("enter username as {string}")
	public void enterusername(String data3) {
		wd.findElement(By.name("username")).sendKeys(data3);
	}

	@And("enter password as {string}")
	public void enterpassword(String data4) {
		wd.findElement(By.name("password")).sendKeys(data4);
	}

	@And("click login")
	public void login() {
		wd.findElement(By.name("password")).submit();
	}

	@But("dont click remember button")
	public void rememberbutton() {
		System.out.println("user must not click remember button");
	}

	@Then("verify welcome page as {string}")
	public void verifywelcomepage(String data5) {
		String name = wd.findElement(By.xpath("//*[@id=\'navbarToggle\']/div[2]/a[2]")).getText();
		if (name.equals(data5)) {
			System.out.println("login success");
		} else {
			System.out.println("login failed");
		}
	}

}
