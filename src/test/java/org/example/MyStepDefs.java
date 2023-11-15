package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    RegistrationResultPage registrationResultPage = new RegistrationResultPage();


    @Given("I am on NopEcommerce Homepage")
    public void i_am_on_nop_ecommerce_homepage() {

    }

    @When("I click on Register button")
    public void i_click_on_register_button() {
        homePage.clickOnRegisterButton();
    }

    @When("I enter all required registration details")
    public void i_enter_all_required_registration_details() {
        registerPage.enterRegistrationInfo();
    }

    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        registrationResultPage.verifyUserRegisteredSuccessFully();

    }

    @Given("I am on nopcommerce homepage")
    public void i_am_on_nopcommerce_homepage() {

    }
    @When("hover to computer category option")
    public void hover_to_computer_category_option() {
        homePage.hoverComputerCategoriesOption();
    }
    @Then("color of computer option turn blue")
    public void color_of_computer_option_turn_blue() {
        homePage.colorChangeVerifyOnComputerLink();
    }


}
