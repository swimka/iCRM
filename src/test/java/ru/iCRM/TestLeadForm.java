package ru.iCRM;

import org.junit.Test;

public class TestLeadForm extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void TestLeadForm() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/lead/create");
        driver.findElementByName("first_name").sendKeys("AutoTestFirst" + n);
        driver.findElementById("lead_phone_custom").sendKeys("4012333333" + n);
        driver.findElementByXPath("//*[@id=\"leadClinic_chosen\"]/a/span").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"leadClinic_chosen\"]/div/ul/li[8]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[1]/div[1]/div/div/a/span").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[1]/div[1]/div/div/div/ul/li[6]").click();
        driver.findElementByName("last_name").sendKeys("AutoTestLast" + n);
        String Email = n + "autotestemail" + n + "@gmail.com";
        driver.findElementByName("email").sendKeys(Email);
        driver.findElementByXPath("//*[@id=\"leadProcedures_chosen\"]/ul/li/input").click();
        driver.findElementByXPath("//*[@id=\"leadProcedures_chosen\"]/div/ul/li[6]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[2]/div[2]/div/div/a/span").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[2]/div[2]/div/div/div/ul/li[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[5]/div/input").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"top-bar-btn-lead\"]/button[6]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"sendOnlineFormsPopup\"]/div/div[2]/a").click();
        Thread.sleep(4000);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[1]/div/div/input").sendKeys("Test" + n);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/div/input").sendKeys("Test" + n);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[3]/div/div/input").sendKeys("Test" + n);
    }


    }