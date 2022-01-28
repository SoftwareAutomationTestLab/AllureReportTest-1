package mypackage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class myTest1 {
    WebDriver driver;
    @BeforeTest
            public void setup(){

        System.out.println("set up headless browser..");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);}
    @Test(priority=1,description="open google and get tile in 2")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 1")
    @Story("Story Name: check google")

    public void opengoogle(){
        System.out.println("starting Test...");
        driver.get("https://www.google.com");
        String title=driver.getTitle();
        System.out.println("Page title is :"+title);
        System.out.println("End Test...");}

    @AfterTest
    public void teardown() {
        driver.quit();
    System.out.println("closing the browser...");}
}

