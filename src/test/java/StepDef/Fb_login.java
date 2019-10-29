package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Fb_login {
	
	WebDriver d;
	
    
	
	@Given("User has chosen to login")
	public void user_has_chosen_to_login() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe ");
	    d= new ChromeDriver();
	    d.get("https://www.facebook.com/");
	    d.manage().window().maximize();
	    
	    d.findElement(By.xpath("//input[@name='email']")).sendKeys("srjkumar35@gmail.com");
	    d.findElement(By.xpath("//input[@name='pass']")).sendKeys("7123456789");
	    d.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    Assert.assertEquals("Facebook", d.getTitle());
	    System.out.println("Login is Successful");
	    
	    
	  
	}
//
//	@When("User login with valid credentials")
//	public void user_login_with_valid_credentials() {
//	
	
//	@When("click on login button")
//	public void click_on_login_button() {
//		
//	}

//	}
//
//	@Then("user will able to see the homepage")
//	public void user_will_able_to_see_the_homepage() {
//	   

//	}
//
//	@Then("user will able to post text, photos, videos")
//	public void user_will_able_to_post_text_photos_videos() {
//	   

//	}

}
