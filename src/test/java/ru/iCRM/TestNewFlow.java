package ru.iCRM;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestNewFlow extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void TestNewFlow1() throws InterruptedException { //создание лида
        login();
        driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/lead/create");
        driver.findElementByName("first_name").sendKeys("AutoTestStatus" + n);
        driver.findElementById("lead_phone_custom").sendKeys("44133456724" + n);
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
        String leademail = driver.findElement(By.id("lead-email")).getText();
        Assert.assertTrue(leademail.contains("vladislavqatest@gmail.com")); //проверка почты - 3
        System.out.println("Соответствует = vladislavqatest@gmail.com");
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
        String leadstatus = driver.findElement(By.id("lead-status")).getText();
        Assert.assertTrue(leadstatus.contains("MHF Not Completed")); //проверка карточки - 3
        System.out.println("Статус соответствует = MHF Not Completed");
        driver.quit();
    }

    @Test
    public void TestNewFlow5() throws InterruptedException { //создание расписания - Консультация
        login();
        leadpage();
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul/li[4]/a").click();
        Thread.sleep(1000);
        Select type_id_shedule = new Select(driver.findElementByName("clinic_type_id"));
        type_id_shedule.selectByVisibleText("Face 2 Face Clinic");
        driver.findElementByLinkText("Select an Option").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div/div/div/ul/li[2]").click();
        WebElement calendar_shedule_cons = driver.findElementByName("date");
        calendar_shedule_cons.click();
        Thread.sleep(1000);
        driver.findElementByLinkText("26").click();
        driver.findElementByName("start_time").click();
        driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div > select > option:nth-child(2)").click();
        driver.findElementByName("stop_time").click();
        driver.findElementByCssSelector("#app > div > div.panel-body > div > div > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(5) > div > select > option:nth-child(134)").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[2]/label").click();
        Thread.sleep(1000);
        WebElement id_doctor = driver.findElementByXPath("//*[@id=\"doctor_chosen\"]/a/span");
        id_doctor.click();
        driver.findElementByXPath("//*[@id=\"doctor_chosen\"]/div/div/input").sendKeys("TestDoctor\n");
        WebElement id_coordinator = driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/a/span");
        id_coordinator.click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/div/div/input").sendKeys("Not Applicable\n");
        Select id_chaperone = new Select(driver.findElementByName("chaperone_id"));
        id_chaperone.selectByVisibleText("Not Applicable");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/div/div/input").sendKeys("Not Applicable\n");
        driver.findElementByXPath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[4]/div/input").click();
        System.out.println("Создано расписание Face 2 Face на 26 число текущего месяца с 6:00 до 17:05");
    }

    @Test
    public void TestNewFlow6() throws InterruptedException { //создание консультации
        PostLoginOpportunity(); //открыт лид vladislavqatest@gmail.com во вкладке Opportunity
        driver.findElementByXPath("//*[@id=\"top-bar-btn-lead\"]/button[3]").click();
        Thread.sleep(3000);
        Select type_id = new Select(driver.findElementById("appointment_agenda_type_id"));
        type_id.selectByVisibleText("New Consultations");
        Thread.sleep(1000);
        Select name_doctor = new Select(driver.findElementById("appointment_doctor_id"));
        name_doctor.selectByVisibleText("TestDoctor");
        driver.findElementById("appointment_clinic_id").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"appointment_clinic_id\"]/option[3]").click();
        WebElement appointment_date = driver.findElementById("appointment_date");
        appointment_date.click();
        Thread.sleep(2000);
        driver.findElementByLinkText("26").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"appointment_timeslots\"]/div[80]/input").click();
        driver.findElementByXPath("//*[@id=\"jBox3\"]/div/div[1]/div[1]").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"form-ajax-create-new-appointment\"]/div[2]/div/input").click();
        Thread.sleep(2000);
        String leadstatus = driver.findElement(By.id("lead-status")).getText();
        Assert.assertTrue(leadstatus.contains("Awaiting Initial Consultation")); //проверка карточки - 3
        System.out.println("Статус соответствует = Awaiting Initial Consultation");
        driver.quit();

    }

    @Test
    public void TestNewFlow7() throws InterruptedException { //Attended консультации
        login();
        driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/lead/detail/17326#/");
        driver.findElementByXPath("//*[@id=\"lead-appointment-open\"]/div/table/tbody/tr/td[8]/i").click();
        Thread.sleep(4000);
        driver.findElementByXPath("//label[normalize-space()='Attended']").click();
        driver.findElementById("agenda_status_note").sendKeys("AutoTestNotes\n");
        driver.quit();

    }

//    @Test
//    public void TestNewFlow8() throws InterruptedException { //
//
    }
