package StepDefinitions;

//import cucumber.api.java.en.Given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class loginStepDefinition {
   WebDriver driver;



   @Given("^user is already on login page$")
    public void user_is_already_on_login_page(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.cogmento.com/");
    }

    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_crm() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @When("user enters username and pwd")
    public void user_enters_username_and_pwd() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("lichi_77@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jobs@123");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
    }
    @Then("user logs in successfully")
    public void user_logs_in_successfully() {
        System.out.println("user logs in successfully");
    }
    @Then("user is on home page")
    public void user_is_on_home_page() {
        String title = driver.getTitle();
        System.out.println("user is on "+title);
    }


}
