package com.pages.stepdefs;

import Proj_Appli_Maven.Project_Mav.Home_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Page_Home_Stepdef {
	Home_Page home_Page=new Home_Page();
	
	
	@Given("^Home Page$")
    public void Home_Page(){
           System.out.println("Given statement executed successfully");
           home_Page.Initiatedriver();
    }

    @Then("^Check the logo Redirects to Home page$")
    public void Check_the_logo_Redirects_to_Home_page() throws InterruptedException{
           System.out.println("Check_the_logo_Redirects_to_Home_page-stepdf");
           home_Page.verifypageLogoworking();
    }
}

