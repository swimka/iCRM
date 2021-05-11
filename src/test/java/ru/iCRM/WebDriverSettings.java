package ru.iCRM;

import org.junit.Before;
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




//
//    @After
//    public void close() {
//        driver.quit();
//    }

}