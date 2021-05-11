package ru.iCRM;

import org.junit.Test;

public class TestAuth extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void auth() throws InterruptedException {
        driver.get(URL);
        driver.findElementById("email").sendKeys(USER_admin);
        driver.findElementById("password").sendKeys(PASSWORD_admin);
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        driver.quit();

    }


    }