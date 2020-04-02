package ru.iCRM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestSetting extends WebDriverSettings {
    @Test
    public void settingcreateclinic() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Создание Locations
        driver.findElementByLinkText("Locations").click();
        driver.findElementByCssSelector(".btn.btn-success.btn-sm.pull-right").click();
        driver.findElementByCssSelector(".form-control").sendKeys("autotest" + n);
        driver.findElementByCssSelector(".btn.btn-primary.pull-right").click();
        System.out.println("Создана Клиника с Id" + n);
        driver.quit();

    }

    @Test
    public void settingcreateprocedure() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Создание Procedures
        driver.findElementByLinkText("Procedures").click();
        driver.findElementByCssSelector(".btn.btn-success.btn-sm.pull-right").click();
        driver.findElementByCssSelector(".form-control").sendKeys("autotest" + n);
        driver.findElementByCssSelector(".btn.btn-primary.pull-right").click();
        System.out.println("Создана Процедура с Id" + n);
        driver.quit();
    }

    @Test
    public void settingcreateAnaesthetist() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Создание Staff/Anaesthetist
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Anaesthetist").click();
        driver.findElementByCssSelector(".btn.btn-success.btn-sm.pull-right").click();
        driver.findElementByCssSelector(".form-control").sendKeys("autotest" + n);
        driver.findElementByCssSelector(".btn.btn-primary.pull-right").click();
        System.out.println("Создана Anaesthetist с Id" + n);
        driver.quit();
    }

    @Test
    public void settingcreateDoctors() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Создание Staff/Anaesthetist
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Doctors").click();
        driver.findElementByCssSelector(".btn.btn-success.btn-sm.pull-right").click();
        driver.findElementByCssSelector(".form-control").sendKeys("autotest" + n);
        driver.findElementByCssSelector(".btn.btn-primary.pull-right").click();
        System.out.println("Создана Doctors с Id" + n);
        driver.quit();
    }

    @Test
    public void settingcreatePatientcoordinators() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Создание Staff/Patient coordinators
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Patient coordinators").click();
        driver.findElementByCssSelector(".btn.btn-success.btn-sm.pull-right").click();
        driver.findElementByCssSelector(".form-control").sendKeys("autotest" + n);
        driver.findElementByCssSelector(".btn.btn-primary.pull-right").click();
        System.out.println("Создана Patient coordinators с Id" + n);
        driver.quit();
    }

    @Test
    public void settingcreateChaperone() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Создание Staff/Chaperone
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Chaperone").click();
        driver.findElementByCssSelector(".btn.btn-success.btn-sm.pull-right").click();
        driver.findElementByCssSelector(".form-control").sendKeys("autotest" + n);
        driver.findElementByCssSelector(".btn.btn-primary.pull-right").click();
        System.out.println("Создана Chaperone с Id" + n);
        driver.quit();
    }

    @Test
    public void settingcreateAgenda() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Создание Agenda/Agenda type
        driver.findElementByLinkText("Agenda").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Agenda type").click();
        driver.findElementByCssSelector(".btn.btn-success.btn-sm.pull-right").click();
        driver.findElementByCssSelector(".form-control").sendKeys("autotest" + n);
        driver.findElementByCssSelector(".btn.btn-primary.pull-right").click();
        System.out.println("Создана Agenda type с Id" + n);
        driver.quit();
    }

    @Test
    public void settingeditclinic() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Locations
        driver.findElementByLinkText("Locations").click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2500)");
        driver.findElementByCssSelector("#datatable > tbody > tr:nth-child(19) > td:nth-child(3) > a").click();
        driver.findElementById("editSettingsValue").clear();
        driver.findElementById("editSettingsValue").sendKeys("autotest+edit" + n);
        driver.findElementByCssSelector("#fieldEdit > div > form > div > div > div.row > div > input").click();
        System.out.println("Клиника изменена на Id" + n);

        driver.quit();
    }

    @Test
    public void settingediprocedure() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Procedures
        driver.findElementByLinkText("Procedures").click();
        driver.findElementByCssSelector("#datatable > tbody > tr:nth-child(114) > td:nth-child(4) > a").click();
        driver.findElementById("editSettingsValue").clear();
        driver.findElementById("editSettingsValue").sendKeys("autotest+edit" + n);
        driver.findElementByName("price").sendKeys("100" + n);
        driver.findElementByCssSelector("#fieldEdit > div > form > div > div > div.row > div > input").click();
        System.out.println("Процедура изменена и добавлена цена 100" + n);
        driver.quit();
    }

    @Test
    public void settingediLeadsource() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Procedures
        driver.findElementByLinkText("Lead source").click();
        driver.findElementByCssSelector("#datatable > tbody > tr:nth-child(17) > td:nth-child(3) > a").click();
        driver.findElementById("editSettingsValue").clear();
        driver.findElementById("editSettingsValue").sendKeys("autotest+edit" + n);
        driver.findElementByCssSelector("#fieldEdit > div > form > div > div > div.row > div > input").click();
        System.out.println("Lead source изменен на autotest+edit" + n);
        driver.quit();
    }

    @Test
    public void settingediAnaesthetist() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Staff/Anaesthetist
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Anaesthetist").click();
        driver.findElementByCssSelector("#datatable > tbody > tr:nth-child(4) > td:nth-child(3) > a").click();
        driver.findElementById("editSettingsValue").clear();
        driver.findElementById("editSettingsValue").sendKeys("autotest+edit" + n);
        driver.findElementByCssSelector("#fieldEdit > div > form > div > div > div.row > div > input").click();
        System.out.println("Anaesthetist изменен на autotest+edit " + n);
        driver.quit();
    }

    @Test
    public void settingeditdoctors() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Staff/Doctor
        Thread.sleep(2000);
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Doctors").click();
        driver.findElementByCssSelector("#datatable > tbody > tr:last-child  > td:nth-child(5) > a").click();
        Thread.sleep(2000);
        driver.findElementByName("name").clear();
        driver.findElementByName("name").sendKeys("doctor+edit" + n);
        Thread.sleep(1000);
        WebElement location = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/form/div[1]/div/div[2]/div/div"));
        location.click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div[2]/div/div/form/div[1]/div/div[2]/div/div/div/ul/li[1]").click();
        driver.findElementByCssSelector("#app > div > div > div.panel-body > div > div > form > div:nth-child(2) > div > div:nth-child(3) > label").click();
        driver.findElementByCssSelector("#app > div > div > div.panel-body > div > div > form > div:nth-child(2) > div > div:nth-child(3) > div > div > ul > li").click();
        driver.findElementByXPath("//*[@id=\"app\"]/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div/ul/li[2]").click();
        driver.findElementByCssSelector("#app > div > div > div.panel-body > div > div > form > div:nth-child(3) > div > input").click();
        System.out.println("Doctor изменен на doctor+edit" + n);
        driver.quit();
    }

    @Test
    public void settingeditpatientcoordinator() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Staff/Patient coordinator
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Patient coordinators").click();
        driver.findElementByCssSelector("#datatable > tbody > tr:nth-child(11) > td:nth-child(3) > a").click();
        driver.findElementById("editSettingsValue").clear();
        driver.findElementById("editSettingsValue").sendKeys("autotest+edit" + n);
        driver.findElementByCssSelector("#fieldEdit > div > form > div > div > div.row > div > input").click();
        System.out.println("Patient coordinator изменен на autotest+edit " + n);
        driver.quit();
    }

    @Test
    public void settingeditChaperone() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Staff/Chaperone
        driver.findElementByLinkText("Staff").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Chaperone").click();
        driver.findElementByCssSelector("#datatable > tbody > tr:nth-child(9) > td:nth-child(3) > a").click();
        driver.findElementById("editSettingsValue").clear();
        driver.findElementById("editSettingsValue").sendKeys("autotest+edit" + n);
        driver.findElementByCssSelector("#fieldEdit > div > form > div > div > div.row > div > input").click();
        System.out.println("Chaperone изменен на autotest+edit " + n);
        driver.quit();
    }

    @Test
    public void settingeditagendatype() throws InterruptedException {
        driver.get("https://icrm.connected-home.io/client/login");
        driver.findElementById("email").sendKeys("niraj.manglam@nucosmeticclinic.co.uk");
        driver.findElementById("password").sendKeys("rikku007");
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация прошла успешно");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/a").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"myNavbar\"]/ul[2]/li[3]/ul/li[2]/a").click();
        System.out.println("Открыта страница Setting");
        //Изменение Agenda/Agenda type
        driver.findElementByLinkText("Agenda").click();
        Thread.sleep(2000);
        driver.findElementByLinkText("Agenda type").click();
        driver.findElementByCssSelector("#datatable > tbody > tr:nth-child(6) > td:nth-child(3) > a").click();
        driver.findElementById("editSettingsValue").clear();
        driver.findElementById("editSettingsValue").sendKeys("autotest+edit" + n);
        driver.findElementByCssSelector("#fieldEdit > div > form > div > div > div.row > div > input").click();
        System.out.println("Agenda type изменен на autotest+edit " + n);
        driver.quit();
    }
}
