package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMStepDef {
	

	
	@Before (order=2)
	public void setUpChome() {
		System.out.println("Init Browser Chrome");
	}

	@Before (order=1)
	public void setUpDB() {
		System.out.println("Set Up DB");
	}
	
	@Before(order=3)
	public void setUpProperty() {
		System.out.println("Set Up Property File");
	}
//	@Before("@Regression")
//	public void setupBrowser_reg() {
//		System.out.println("Init Browser Chrome");
//	}
//	
//	@Before("@Smoke")
//	public void setupBrowser_smoke() {
//		System.out.println("Init Browser Edge");
//	}
	
	@Given("^User logged in$")
    public void user_logged_in() {
        System.out.println("User Logged in");
    }

    @Given("^User on Home page$")
    public void user_on_home_page() throws Throwable {
    	System.out.println("User on Home Page");
    }

    @When("^Create Contact is clicked$")
    public void create_contact_is_clicked() {
    	System.out.println("Create Contact is clicked");
    }

    @When("^Update Contact is clicked$")
    public void update_contact_is_clicked()  {
    	System.out.println("Update Contact is clicked");
    }

    @When("^Create Companies is clicked$")
    public void create_companies_is_clicked() {
    	System.out.println("Create Companies is clicked");
       
    }

    @When("^Update Companies is clicked$")
    public void update_companies_is_clicked(){
    	System.out.println("Update Companies is clicked");
    }

    @When("^Create Deals is clicked$")
    public void create_deals_is_clicked() {
    	System.out.println("Create Deals is clicked");
    }
    
    @When("^Create Tasks is clicked$")
    public void create_tasks_is_clicked() {
    	System.out.println("Create Tasks is clicked");
    }

    @When("^Update Tasks is clicked$")
    public void update_tasks_is_clicked(){
    	System.out.println("Update Tasks is clicked");
    }

    @When("^Create Cases is clicked$")
    public void create_cases_is_clicked() {
    	System.out.println();
    }

    @When("^Update Cases is clicked$")
    public void update_cases_is_clicked() {
    	System.out.println("Create Cases is clicked");
    }


    @When("^Update Deals is clicked$")
    public void update_deals_is_clicked(){
    	System.out.println("Update Deals is clicked");
    }

    @Then("^User click logout$")
    public void user_click_logout() {
    	System.out.println("User click logout");
    }

	@After
	public void closerBrowser() {
		System.out.println("Close Browser");
		
	}
}
