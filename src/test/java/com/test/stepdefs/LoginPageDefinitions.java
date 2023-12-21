package com.test.stepdefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
import java.time.Duration;
public class LoginPageDefinitions {

    private static WebDriver driver;
    public final static int TIMEOUT = 5;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        System.out.println("Se aperturo el navegador ");
    }


    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) throws  InterruptedException {

        driver.get(url);
        System.out.println("Se abrio el site LoginHRM.");
        Thread.sleep(6000);
    }

    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) throws  InterruptedException {

        // login to application
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
        System.out.println("Se ingreso usuario y password.");
        Thread.sleep(5000);
        // go the next page

    }

    @Then("User should be able to login successfully and new page open")
    public void user_should_be_able_to_login_successfully_and_new_page_open() throws  InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("En hora buena. Nos autenticamos al site!");
        Thread.sleep(5000);
    }

    @After
    public void teardown() {

        driver.quit();
    }



}