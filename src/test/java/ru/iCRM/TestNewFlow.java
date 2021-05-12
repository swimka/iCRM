package ru.iCRM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TestNewFlow extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void TestNewFlow1() throws InterruptedException { //создание лида
        login();
        driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/lead/create");
        driver.findElementByName("first_name").sendKeys("AutoTestStatus" + n);
        driver.findElementById("lead_phone_custom").sendKeys("4412345672" + n);
        driver.findElementByXPath("//*[@id=\"leadClinic_chosen\"]/a/span").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"leadClinic_chosen\"]/div/ul/li[2]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[1]/div[1]/div/div/a/span").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[1]/div[1]/div/div/div/ul/li[6]").click();
        driver.findElementByName("last_name").sendKeys("AutoTestLast" + n);
        driver.findElementByName("email").sendKeys("vladislavqatest@gmail.com");
        driver.findElementByXPath("//*[@id=\"leadProcedures_chosen\"]/ul/li/input").click();
        driver.findElementByXPath("//*[@id=\"leadProcedures_chosen\"]/div/ul/li[6]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[2]/div[2]/div/div/a/span").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div[2]/div[2]/div/div/div/ul/li[1]").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[5]/div/input").click();
        Thread.sleep(5000);
        System.out.println("Создан лид с почтой vladislavqatest@gmail.com");
        driver.quit();
    }

    @Test
    public void TestNewFlow2() throws InterruptedException { // открытие созданного лида
        PostLoginNewLead();
        Thread.sleep(2000);
        System.out.println("Открыт новый лид vladislavqatest@gmail.com");
        driver.quit();
    }

    @Test
    public void TestNewFlow3() throws InterruptedException { // отправка шаблона на почту
        PostLoginNewLead();
        driver.findElementByXPath("//*[@id=\"top-bar-btn-lead\"]/button[5]").click();
        Thread.sleep(1000);
        driver.findElementById("email_template").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"email_template\"]/option[2]").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"btn-send-email-template\"]").click();
        Thread.sleep(1000);
        System.out.println("Отправлен шаблон Complaint Notify");
        driver.quit();
    }

    @Test
    public void TestNewFlow4() throws InterruptedException { // Отправка формы MHF
        PostLoginNewLead();
        driver.findElementByXPath("//*[@id=\"top-bar-btn-lead\"]/button[6]").click();
        driver.findElementByXPath("//*[@id=\"sendOnlineFormsPopup\"]/div/div[1]/a").click();
        Thread.sleep(3000);
        System.out.println("Отправлена форма MHF на vladislavqatest@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1200)");
        String leadstatus1 = driver.findElement(By.xpath("//*[@id=\"lead-forms-online\"]/div/table/tbody/tr[1]/td[4]/text()")).getText();
        Assert.assertTrue(leadstatus1.contains("Submitted")); //проверка карточки - 3
        System.out.println("Соответствует = Submitted");
//        close();
    }
    @Test
    public void TestNewFlow5() throws InterruptedException { //создание консультации
        PostLoginOpportunity(); //открыт лид vladislavqatest@gmail.com во вкладке Opportunity
        


    }
}
