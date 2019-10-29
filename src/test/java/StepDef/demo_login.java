package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class demo_login {
	WebDriver d;

	@Given("User is on DemoWebShop")
	public void user_is_on_DemoWebShop() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("http://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		
	   
		
	}

	@Given("User clicks on login button")
	public void user_clicks_on_login_button() {
		d.findElement(By.xpath("//a[text()='Log in']")).click();
	    
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials() {
		
		d.findElement(By.xpath("//input[@name='Email']")).sendKeys("karthik456@gmail.com");
		d.findElement(By.xpath("//input[@name='Password']")).sendKeys("karthik456");
	   
	}

	@When("Click on Login button")
	public void click_on_Login_button() throws InterruptedException {
		
		d.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(5000);
	   
	}

	@Then("User will be directed to homepage")
	public void user_will_be_directed_to_homepage() throws InterruptedException {
		Assert.assertEquals("Demo Web Shop", d.getTitle());
		System.out.println("Login Successful");
		Thread.sleep(5000);
		d.close();
	   
	}
	
	//Search
	@Given("Again user is on DEMOWEBSHOP")
	public void again_user_is_on_DEMOWEBSHOP() {
		
	    
	}

	@Given("Enter product name")
	public void enter_product_name() {
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Build your own cheap computer");
		
	    
	}

	@When("Clicks on search button")
	public void clicks_on_search_button() {
	   d.findElement(By.xpath("//input[@value='Search']")).click();
		
	}

	@Then("Products will appear")
	public void products_will_appear() {
		Assert.assertEquals("Build your own computer", d.findElement(By.xpath("//a[text()='Build your own computer']")));
		System.out.println("Searching is Successful");
	    
	}

	
	//multiple time logining
	
	@Given("User is on demopage")
	public void user_is_on_demopage() {System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
	d= new ChromeDriver();
	d.get("http://demowebshop.tricentis.com/");
	d.manage().window().maximize();
	   
	}

	@Given("Again clicks on login button")
	public void again_clicks_on_login_button() {
		d.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String Email, String Password) {
		d.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email);
		d.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
	    
	}

	@When("Again click on Login Button")
	public void again_click_on_Login_Button() throws InterruptedException {
		d.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(5000);
	   
	}

	@Then("user will again directed to homepage")
	public void user_will_again_directed_to_homepage() throws InterruptedException {
		Assert.assertEquals("Demo Web Shop", d.getTitle());
		System.out.println("Login Successful");
		Thread.sleep(5000);
		d.close();
	   
	    
	}
	
	
	
	
	
	
	
}
