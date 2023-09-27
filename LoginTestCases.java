package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginTestCases {
	
	//Here we are testing login feature
	/*
	 * 
	 * 
	 */
	
	WebDriver driver;

	@Given("user should be in login page")
	public void user_should_be_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();

		Thread.sleep(4000);
				
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	}

	@When("user enter the valid username and the valid password")
	public void user_enter_the_valid_username_and_the_valid_password() {
		driver.findElement(By.id("login1")).sendKeys("satishgangwani19");
		driver.findElement(By.id("password")).sendKeys("Sati1234$");
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
		driver.findElement(By.className("signinbtn")).click();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() throws InterruptedException {
		Thread.sleep(3000);
		boolean flag;
		try
		{
		flag = driver.findElement(By.linkText("Logout")).isDisplayed();
		}catch(NoSuchElementException e)
		{
			flag = false;
		}
		Assert.assertEquals(flag, true);
	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
	}

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.id("login1")).sendKeys("satishgangwani19");
		driver.findElement(By.id("password")).sendKeys("Sati1234");
	}

	@Then("user should not be able to login")
	public void user_should_not_be_able_to_login() throws InterruptedException {
		Thread.sleep(3000);
		String actualErrMsg = driver.findElement(By.xpath("//b[text() = 'Wrong username and password combination.']")).getText();
		String expectedErrMsg = "Wrong username and password combination.";
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}

	
	
}
