package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils

{

    Actions actions = new Actions(driver);

    private By _registerButton = By.className("ico-register");

    private By _computerLink = By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[@href='/computers']");
    // click on register button
    public void clickOnRegisterButton()
    {
        clickOnElement(_registerButton);
    }

    public void hoverComputerCategoriesOption()
    {

        //save computer link in computer element
        WebElement computer = driver.findElement(_computerLink);
        //hover action on computer option
        actions.moveToElement(computer).perform();


    }

    public void colorChangeVerifyOnComputerLink()
    {

        //save computer link in computer element
        WebElement computer = driver.findElement(_computerLink);
        //verify color change on hover action
        String hoverColor = computer.getCssValue("color");
        Assert.assertEquals(hoverColor,"rgba(74, 178, 241, 1)","color does not match");
    }

}
