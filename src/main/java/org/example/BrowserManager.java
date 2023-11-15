package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class BrowserManager extends Utils{

    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    public void openBrowser()
    {
        //if else block for selecting browser
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("FireFox"))
        {
            System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/chromedriver.exe");
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong browser name entered : " + browserName);
        }

        //for making browser full screen
        driver.manage().window().fullscreen();
        //implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //for opening website
        driver.get("https://demo.nopcommerce.com/");


    }

    public void closeBrowser()
    {
        // closes currently focused window
        driver.close();
    }

}
