package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition1 {
	public String url="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	@Given("i should open the browser and naviagte to the login page of guru99")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_guru99() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	@When("Enter Username {string}")
	public void enter_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);

	}
	@And("Enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}
	@And("Click on the submitbutton")
	public void click_on_the_submitbutton() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.quit();
	    
	}


}
