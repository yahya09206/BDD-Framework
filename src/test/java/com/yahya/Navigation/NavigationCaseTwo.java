package com.yahya.Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCaseTwo {

    public static void main(String[] args) {

        /*
         * Test Case 2: Get Current URL
         * Objective: Verify getCurrentUrl() returns the correct URL
         * Navigate to https://www.tesla.com
         * Store the current URL
         * Verify the stored URL matches the navigated URL
         * Verify the URL is not null and not empty
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        String currentUrl = "https://www.saucedemo.com/";

        Assertions.assertEquals(currentUrl, driver.getCurrentUrl());

        driver.quit();

    }
}
