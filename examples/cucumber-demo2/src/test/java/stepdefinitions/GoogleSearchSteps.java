package stepdefinitions;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleSearchSteps {

    // The 'driver' variable is our remote control for the browser
    private WebDriver driver;

    @Given("I am on the Google homepage")
    public void i_am_on_the_google_homepage() {
        // Create a new instance of a Chrome browser
        driver = new ChromeDriver();
        
        // Navigate to the Google homepage URL
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        // Find the search box by its 'name' attribute, then type the search term
        driver.findElement(By.id("APjFqb")).sendKeys(searchTerm);
        
        // Press the ENTER key to submit the search
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    }

    @Then("I should see search results for {string}")
    public void i_should_see_search_results_for(String expectedResults) {
    	 // Create a WebDriverWait object to manage the wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the page title contains the expected text
        wait.until(ExpectedConditions.titleContains(expectedResults));

        // Now, get the page title after the wait has completed
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        // Use an assertion to check if the page title contains the expected term
        assertTrue(pageTitle.contains(expectedResults));

        // Always close the browser when the test is done
        driver.quit();
    }
    }
