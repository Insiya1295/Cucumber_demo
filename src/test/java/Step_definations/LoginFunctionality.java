package Step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginFunctionality {
	WebDriver driver;
	@Given("TestMe is up and running")
	public void testme_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		 driver =new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@Then("registered user enters the valid creds")
	public void registered_user_enters_the_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys("Lalitha");
		driver.findElement(By .name("password")).sendKeys("Password123");
		driver.findElement(By .name("Login")).click();
	}

	@Then("verifies for the login status for cred")
	public void verifies_for_the_login_status_for_cred() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String expected= "SignOut";
		String actual=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		Assert.assertEquals(expected, actual);
				
	}
}
