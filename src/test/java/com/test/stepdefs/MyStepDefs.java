package com.test.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefs {

    @Given("I navigate to bank site")
    public void i_navigate_to_bank_site() throws InterruptedException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://formy-project.herokuapp.com/form");
        System.out.println("Navigated to bank site " + driver.getTitle());
    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("Entered User Name and Password");
    }
    @Then("I log in to home page")
    public void iLogInToHomePage() {
        System.out.println("Logged into home page");
    }

    @Given("I have a Stomach/Belly")
    public void iHaveAStomach() {
        System.out.println("This step matches both stomach or belly");
    }

    @When("I eat {int} cucumber(s)")
    public void iEatCucumber(int arg0) {
        System.out.println("This step matches integer in the feature");
    }

    @Then("I don't feel full")
    public void iDonTFeelFull() {
        System.out.println("I don't feel full");
    }

    @When("I eat {int} cucumber(s) and {string} tomatoes")
    public void iEatCucumbersAndTomatoes(int arg0, String arg1) {
        System.out.println("Matches integer and string passed");
    }

    @Then("I feel full")
    public void iFeelFull() {
        System.out.println("I feel full");
    }
}
