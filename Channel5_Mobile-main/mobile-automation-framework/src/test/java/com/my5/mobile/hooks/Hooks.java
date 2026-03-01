package com.my5.mobile.hooks;

import com.my5.mobile.base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        DriverManager.initializeDriver();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}