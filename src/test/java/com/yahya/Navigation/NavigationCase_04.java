package com.yahya.Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCase_04 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        /**
         * Test Case 4: Navigate Forward
         *
         * Objective: Verify navigate().forward() works correctly
         *
         *
         * Navigate to https://www.tesla.com
         * Navigate to https://www.google.com
         * Call navigate().back()
         * Call navigate().forward()
         * Verify you're on Google URL (contains "google")
         */

        driver.get("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();

        Assertions.assertTrue(driver.getTitle().contains("Google"));

        driver.quit();
    }
}
