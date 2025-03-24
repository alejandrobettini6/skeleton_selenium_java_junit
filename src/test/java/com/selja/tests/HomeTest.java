package com.selja.tests;

import com.selja.base.Driver;
import com.selja.pages.Home;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.*;

public class HomeTest extends BaseTest {

    private static WebDriver driver;
    Home home;

    @Test
    @Epic("Búsqueda en Google")
    @Feature("Página de búsqueda")
    @Story("Usuario busca 'Selenium'")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifica que la búsqueda de 'Selenium' en Google devuelve resultados relevantes")
    public void testHome(){
        driver = Driver.getDriver();
        home = new Home(driver);
        home.open();
    }

}