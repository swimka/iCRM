package ru.iCRM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestFormMedses extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void TestFormMedses() throws InterruptedException {
        driver.get(URL);
        driver.findElementById("email").sendKeys(USER_admin);
        driver.findElementById("password").sendKeys(PASSWORD_admin);
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        //Create Pre Operative Assessment Form
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
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[14]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[15]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[16]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[17]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[18]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[19]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[20]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[21]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[22]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[23]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[24]/div/div/textarea").sendKeys("24. Medical History Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[25]/div/div/input").sendKeys("Blood Disorder / Heart Murmur Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[26]/div/div/input").sendKeys("Surgical History Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[27]/div/div/input").sendKeys("Any Past Surgical Complications Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[28]/div/div/input").sendKeys("Medication Dosages and Frequency Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[29]/div/div/textarea").sendKeys("Advised to bring own medication ie asthma inhalers/ insulin to be administered after surgery and units to be given Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[4]/button[2]").click();
        System.out.println("Нажата Next");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[1]/td[2]/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[2]/td[2]/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[3]/td[2]/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[4]/td[2]/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[5]/td[2]/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[6]/td[2]/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[7]/td[2]/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[8]/td[2]/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[2]/div/table/tr[9]/td[2]/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[3]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[4]/div/div/input").sendKeys("Have you had a throat and nasal swab? Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[5]/div/div/input").sendKeys("Did you test Positive or Negative? Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[6]/div/div/div/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[6]/div/div/div/ul/li/div/div/div/button[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[7]/div/div/input").sendKeys("Have you had an antibody blood test? Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[8]/div/div/input").sendKeys("Was it Positive or Negative? Test");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/div/div/div/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[9]/div/div/div/ul/li/div/div/div/button[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[10]/ol/li[1]/ol/li[1]/div/div/div/label[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[10]/ol/li[1]/ol/li[2]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[10]/ol/li[2]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[11]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[13]/div/div/div/label[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[16]/div[1]/div/div/input").sendKeys("Nurse Signature Test"+n);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[16]/div[2]/div/div/div/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div[16]/div[2]/div/div/div/ul/li/div/div/div/button[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[4]/button[2]").click();
        System.out.println("Открыть превью");
        String preview_title = driver.getTitle();
        System.out.println("Страница соответствует превью странице:" + preview_title);
        Assert.assertTrue(preview_title.contains("iCRM Online"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div/div[2]/div[4]/button[2]").click();
        System.out.println("Форма Pre Operative Assessment Form сохранена.");
        driver.quit();









    }
}