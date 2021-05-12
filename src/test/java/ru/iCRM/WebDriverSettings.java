package ru.iCRM;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Random;


public class WebDriverSettings {

    public ChromeDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);


    }
    Random random = new Random();
    int n = random.nextInt(100) +3;

    Random randoms = new Random();
    int r = randoms.nextInt(100) +2;
    public static final String URL = "https://icrm.connected-home.io/client/login";
    public static final String USER_admin = "niraj.manglam@nucosmeticclinic.co.uk";
    public static final String PASSWORD_admin = "rikku007";
    // Функции тестов
    public void login() { // логин
        driver.get(URL);
        driver.findElementById("email").sendKeys(USER_admin);
        driver.findElementById("password").sendKeys(PASSWORD_admin);
        driver.findElementByCssSelector("#main-container > div > div.row > div > div > div.panel-body > form > div:nth-child(5) > div > button").click();
        driver.findElementByCssSelector("#wizard > div:nth-child(2) > div > div:nth-child(2) > button:nth-child(5)").click();
        System.out.println("Авторизация успешна");
    }
    public void leadpage() { // главная страница лидов (New Leads)
        driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/lead/overview#/");
        System.out.println("Открыта главная страница лидов (New Leads)");
    }
    public void PostLoginNewLead() throws InterruptedException { // Дейстивия после открытия лида
        login();
        leadpage();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"leadOverviewTable\"]/tbody/tr[1]").click();
        Thread.sleep(2000);
        System.out.println("Открыт новый лид vladislavqatest@gmail.com");
    }
    public void leadpage2() { // главная страница лидов (Opportunity)
        driver.get("https://icrm.connected-home.io/v2.1/manchester-private-hospital/lead/overview#/");
        driver.findElementByXPath("//*[@id=\"my_tabs\"]/li[2]/a").click();
        System.out.println("Открыта главная страница лидов (Opportunity)");
    }
    public void PostLoginOpportunity() throws InterruptedException { // Дейстивия после открытия лида Opportunity
        login();
        leadpage2();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@id=\"leadOverviewTable\"]/tbody/tr[1]").click();
        Thread.sleep(2000);
        System.out.println("Открыт новый лид vladislavqatest@gmail.com");
        String leademail = driver.findElement(By.id("lead-email")).getText();
        Assert.assertTrue(leademail.contains("vladislavqatest@gmail.com")); //проверка почты - 3
        System.out.println("Соответствует = vladislavqatest@gmail.com");
    }

    @After
    public void close() {
        driver.quit();
    }

}