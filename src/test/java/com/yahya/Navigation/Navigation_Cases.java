package com.yahya.Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Cases {

    public static void main(String[] args) {

        /*
         * Test Case 1
         * Navigate to https://www.tesla.com
         * Verify the current URL contains "tesla"
         * Assert the URL is exactly "https://www.tesla.com"
         */

        // Set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tesla.com");

        String actualUrl = driver.getCurrentUrl();

        Assertions.assertEquals("https://www.tesla.com", actualUrl);

        driver.close();
    }
}
