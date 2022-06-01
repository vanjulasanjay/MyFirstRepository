package com.taggedhooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TaggedHooks {
	
	@Before(order = 0)
	public void setUpFirst() {
		System.out.println("This is before executing scenario - FIRST");
	}

	@After(order = 0)
	public void teardownFirst() {
		System.out.println("This is after executing the scenario - FIRST");
	}
	
	@Before(order = 1)
	public void setUpSecond() {
		System.out.println("This is before executing scenario - Second");
	}

	@After(order = 1)
	public void teardownSecond() {
		System.out.println("This is after executing the scenario - Second");
	}
	// First case 
//	@Before("@first")
//	public void beforeFirst() {
//		System.out.println("Before First");
//	}
//	@After("@second")
//	public void afterFirst() {
//		System.out.println("After first");
//	}
	
	// second case
//		@Before("@first and @second")
//		public void beforeFirst() {
//			System.out.println("Before First");
//		}
//		@After("@second and @first")
//		public void afterFirst() {
//			System.out.println("After first");
//		}
	
	// third case
	@Before("@first or @second")
	public void beforeFirst() {
		System.out.println("Before First");
	}
	@After("@second or @first")
	public void afterFirst() {
		System.out.println("After first");
	}
	
	@Given("navigate to  the home page")
	public void navigate_to_the_home_page() {
	   System.out.println("Navigate to the home page"); 
	}

	@Then("enter the valid user name")
	public void enter_the_valid_user_name() {
	    System.out.println("Enter the valid user name");
	}

	@Then("click on home page submit button")
	public void click_on_home_page_submit_button() {
	    System.out.println("Click on home page submit button");
	}

	@Given("enter all the mandatory field values on register page")
	public void enter_all_the_mandatory_field_values_on_register_page() {
	    System.out.println("Enter all the mandatory field values on register page");
	}

	@Then("click on submit button to save the entry")
	public void click_on_submit_button_to_save_the_entry() {
	    System.out.println("Click on submit button to save the entry");
	}

	@Then("verify in database and web table page")
	public void verify_in_database_and_web_table_page() {
	    System.out.println("Verify the save entry on data base and wbe table page");
	}

	@Given("enter username into email box")
	public void enter_username_into_email_box() {
	   System.out.println("Enter user name into email box");
	}

	@Then("click on enterimg icon to submit the details")
	public void click_on_enterimg_icon_to_submit_the_details() {
	    System.out.println("Click on enterimg icon to submit the details");
	}

}
