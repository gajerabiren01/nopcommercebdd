package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils

{

    private By _actualRegistrationMessage = By.className("result");

    //verify is user is registered successfully
    public void verifyUserRegisteredSuccessFully()
    {
        //expected registration message saved in a variable
        String expectedRegistrationMessage = "Your registration completed !!!";
        //storing actual registration message in variable
        String actualRegistrationMessage = getTextFromElement(_actualRegistrationMessage);
        //comparing actual registration message with expected registration method
        Assert.assertEquals(actualRegistrationMessage, expectedRegistrationMessage, "Your registration is not completed");
    }

}
