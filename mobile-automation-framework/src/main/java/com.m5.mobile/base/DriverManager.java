package com.my5.mobile.base;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverManager {

    private static IOSDriver driver;

    public static IOSDriver getDriver() {
        return driver;
    }

    public static void initializeDriver() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "iOS");
            caps.setCapability("automationName", "XCUITest");
            caps.setCapability("deviceName", "iPhone 15");
            caps.setCapability("platformVersion", "17.0");
            caps.setCapability("bundleId", "com.channel5.my5");
            caps.setCapability("noReset", true);

            driver = new IOSDriver(new URL("http://127.0.0.1:4723"), caps);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}