package ru.iCRM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSchedule extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void Schedule() throws InterruptedException {
        driver.get(URL);
        driver.findElementById("email").sendKeys(USER_admin);
        driver.findElementById("password").sendKeys(PASSWORD_admin);
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        WebElement wait = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.linkText("New schedule")));
        var newschedule = driver.findElementByLinkText("New schedule");
        newschedule.click();
        System.out.println("Открыта страница создания расписания");
        driver.quit();
    }
        @Test
        public void Schedulecreate() throws InterruptedException {
            driver.get(URL);
            driver.findElementById("email").sendKeys(USER_admin);
            driver.findElementById("password").sendKeys(PASSWORD_admin);
            driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
            driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
            driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/calendar/schedule/create#/");
            driver.findElementByName("clinic_type_id").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > select > option:nth-child(2)").click();
            driver.findElementByLinkText("Select an Option").click();
            driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div/div/div/ul/li[2]").click();
            Thread.sleep(2000);
            driver.findElementByName("date").click();
            Thread.sleep(1000);
            WebElement datetoday = driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a");
            datetoday.click();
            driver.findElementByName("start_time").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div > select > option:nth-child(2)").click();
            driver.findElementByName("stop_time").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(5) > div > select > option:nth-child(10)").click();
            driver.findElementByName("anaesthetists").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(2) > div.form-group.col-lg-12 > div > select > option:nth-child(2)").click();
            driver.findElementByXPath("//*[@id=\"doctor_chosen\"]/a/span").click();
            driver.findElementByXPath("//*[@id=\"doctor_chosen\"]/div/ul/li[17]").click();
            driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/a/span").click();
            Thread.sleep(1000);
            driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/div/ul/li[1]").click();
            WebElement Chaperone_drop = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[4]/div/select"));
            Select Chaperone_dd = new Select(Chaperone_drop);
            Chaperone_dd.selectByValue("1");
            driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[3]/div/div/div/textarea").sendKeys("Test Description");
            driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[4]/div/input").click();
            System.out.println("Создано расписание на сегодня");


    }



    }
