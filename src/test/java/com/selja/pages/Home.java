package com.selja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

    private WebDriver driver;

    public Home(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("https://www.automationexercise.com/");
    }
}