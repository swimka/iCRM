package ru.iCRM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSchedule extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void Schedule() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
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
            driver.get("https://icrm.connected-home.io/client/login");
            driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
            driver.findElementById("password").sendKeys("rikku007");
            driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
            driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
            WebElement wait2 = new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.elementToBeClickable(By.linkText("New schedule")));
            var newschedule = driver.findElementByLinkText("New schedule");
            newschedule.click();
            driver.findElementByName("clinic_type_id").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > select > option:nth-child(2)").click();
            driver.findElementByLinkText("Select an Option").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > div > div > ul > li:nth-child(1)").click();
            Thread.sleep(2000);
            driver.findElementByName("date").click();
            Thread.sleep(1000);
            driver.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(3) > td.ui-datepicker-days-cell-over.ui-datepicker-today").click();
            driver.findElementByName("start_time").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div > select > option:nth-child(2)").click();
            driver.findElementByName("stop_time").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(5) > div > select > option:nth-child(10)").click();
            driver.findElementByName("anaesthetists").click();
            driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(2) > div.form-group.col-lg-12 > div > select > option:nth-child(2)").click();
            driver.findElementByCssSelector("#doctor_chosen > a").click();
            driver.findElementByXPath("//*[@id=\"doctor_chosen\"]/div/ul/li[9]").click();

            driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/div/ul/li[1]").click();
//            driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/select/option[2]").click();
//            driver.findElementByName("description").sendKeys("autoSchedulecreate" +n);


    }



    }
