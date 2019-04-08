package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProjectStepDefinition {
    static WebDriver mydriver;
    @Given("^Open The Chrome Browers$")
    public void open_The_Chrome_Browers() {
System.setProperty("webdriver.chrome.driver","C:\\work_space\\MySecondMavenProject\\src\\chromedriver.exe");
        // Write code here that turns the phrase above into concrete actions
mydriver = new ChromeDriver();
    }

    @When("^Enter Valid Facebook URL$")
    public void enter_Valid_Facebook_URL()  {
        // Write code here that turns the phrase above into concrete actionsm
        mydriver.get("https://www.facebook.com/");

    }

    @Then("^Validate Facebook Site Opening Successfully$")
    public void validate_Facebook_Site_Opening_Successfully() {
        // Write code here that turns the phrase above into concrete actions
       // mydriver.quit();
        mydriver.getTitle();
        System.out.println(mydriver.getTitle());

    }


}
