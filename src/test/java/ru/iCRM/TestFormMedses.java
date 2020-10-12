package ru.iCRM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestFormMedses extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void TestFormMedses() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/lead/detail/17298#/");
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"top-bar-btn-lead\"]/button[6]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"sendOnlineFormsPopup\"]/div/div[2]/a").click();
        Thread.sleep(4000);
        System.out.println("Форма медсестры открыта");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[1]/div/div/input").sendKeys("Test" + r);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/div/input").sendKeys("Test" + r);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[3]/div/div/input").sendKeys("Test" + r);
        Thread.sleep(1000);
        WebElement coming_drop = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[4]/div/div/select"));
        Select coming_dd = new Select(coming_drop);
        coming_dd.selectByValue("1");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[5]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[6]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[7]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[8]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/ol/li[1]/div/div/input").sendKeys("TDLautotest");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/ol/li[2]/div/div/div/div/div/button").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/ol/li[2]/div/div/div/ul/li/div/div/div/button[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/ol/li[3]/div/div/div/div/div/button").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/ol/li[3]/div/div/div/ul/li/div/div/div/button[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/ol/li[4]/div/div/input").sendKeys("Autotest");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[10]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[11]/div/div/input").sendKeys("11. Allergies Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[12]/div/div/input").sendKeys("12. Bloods Required Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[13]/div/div/input").sendKeys("13. MRSA Swabs Needed Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[13]/ol/li/div/div/textarea").sendKeys("Reason Test");




    }
}