package stepDefinition;

import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

////import org.testng.Assert;
//
//import pages.LandingPage;

import static org.junit.Assert.assertEquals;

public class SearchFunctionality extends Base {
    @Given("I am in Landing Page")
    public void i_am_in_landing_page() {
        navigate("https://phoenix.craigslist.org");
    }
}