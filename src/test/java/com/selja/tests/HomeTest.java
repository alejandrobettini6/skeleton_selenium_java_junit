package com.selja.tests;

import com.selja.base.Driver;
import com.selja.pages.Home;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HomeTest extends BaseTest {

    private static WebDriver driver;
    Home home;

    @Test
    public void testHome(){
        driver = Driver.getDriver();
        home = new Home(driver);
        home.open();
    }

}