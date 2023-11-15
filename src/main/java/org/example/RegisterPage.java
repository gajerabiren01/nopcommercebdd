package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils

{
    LoadProp loadProp = new LoadProp();

    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _registerButton = By.id("register-button");

    private By _birthDay = By.name("DateOfBirthDay");
    private By _birthMonth = By.name("DateOfBirthMonth");
    private By _birthYear = By.name("DateOfBirthYear");
    private By _email = By.id("Email");

    private By _company = By.id("Company");
    private By _password = By.name("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    // verify user is on register page

    public void verifyUserIsOnRegisterPage()
    {
        //confirm if user is on correct url
        Assert.assertTrue(driver.getCurrentUrl().contains(("register")));
    }

    //enter registratin details

    public void enterRegistrationInfo()
    {
        // wait for button to appear
        waitForClickable(_registerButton, 10);
        // enter first name
        typeText(_firstName, loadProp.getProperty("firstName"));
        // enter last name
        typeText(_lastName, loadProp.getProperty("lastName"));
        //select birthday
        selectByText(_birthDay,loadProp.getProperty("birthDay"));
        //select birth month
        selectByText(_birthMonth,loadProp.getProperty("birthMonth"));
        // select birth year
        selectByText(_birthYear,loadProp.getProperty("birthYear"));
        //print email
        System.out.println(email);
        // type email
        typeText(_email,email );
        // company name
        typeText(_company, loadProp.getProperty("companyName"));
        // enter password
        typeText(_password, loadProp.getProperty("password"));
        // enter confirm password
        typeText(_confirmPassword, loadProp.getProperty("password"));
        // click on register button
        clickOnElement(_registerButton);
    }

}
