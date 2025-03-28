package com.selja.tests;

import com.selja.base.Driver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        driver = Driver.getDriver();
    }

    @AfterAll
    public void tearDown(){
        Driver.closeDriver();
    }

}