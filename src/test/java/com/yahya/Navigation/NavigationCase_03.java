package com.yahya.Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCase_03 {

    public static void main(String[] args) {

        /*
         * Test Case 3: Navigate Back
         * Objective: Verify navigate().back() works correctly
         * Navigate to https://www.tesla.com
         * Navigate to https://www.google.com
         * Call navigate().back()
         * Verify you're back on Tesla URL (contains "tesla")
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        driver.get("https://www.google.com");

        driver.navigate().back();

        Assertions.assertTrue(driver.getTitle().contains("Swag"));

        driver.quit();
    }
}
