package com.my5.mobile.base;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.URL;
import java.time.Duration;

public class DriverManager {

    private static IOSDriver driver;

    public static IOSDriver getDriver() {
        return driver;
    }

    public static void initializeDriver() {
        try {
            XCUITestOptions options = new XCUITestOptions();

            options.setDeviceName("iPhone 15");
            // IMPORTANT: Either set the EXACT installed iOS runtime OR remove this line
            // options.setPlatformVersion("17.0");

            options.setBundleId("com.channel5.my5");
            options.setNoReset(true);

            // optional but useful
            options.setNewCommandTimeout(Duration.ofSeconds(120));

            driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);

        } catch (Exception e) {
            throw new RuntimeException("Failed to start iOS driver session", e);
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}