package mypackage;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

/*import com.qa.hubspot.Base.BasePage;
import com.qa.hubspot.constants.Constants;
import com.qa.hubspot.listeners.TestAllureListener;
import com.qa.hubspot.pages.LoginPage;*/


public class myTest {
    WebDriver driver;
    @BeforeTest
            public void setup(){

        System.out.println("set up headless browser..");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);}
  @Step("getting Title")
    public String gettitle(){
         String title=driver.getTitle();
        return title;

    }

    @Test(priority=1,description="open google and get tile")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 1")
    @Story("Story Name: check google")
    public void opengoogle(){
        System.out.println("starting Test...");
        driver.get("https://www.google.com");
        String title=gettitle();
        System.out.println("Page title is :"+title);
        System.out.println("End Test...");}

    @AfterTest
    public void teardown() {
        driver.quit();
    System.out.println("closing the browser...");}
}

