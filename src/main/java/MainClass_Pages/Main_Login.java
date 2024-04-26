package MainClass_Pages;

import Pages.Login;
import Pages.TestNGListeners;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(TestNGListeners.class)
public class Main_Login {
    WebDriver driver = null;

    @BeforeMethod
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
    }
    @Test(priority = 1)
    public void login_with_valid_inputs(){
        Login obj = new Login(driver);
        obj.signin();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,300)");
        obj.enter_username("meeran1996@gmail.com");
        obj.enter_password("Meeran@1996");
        obj.clickOnlogin();
    }
    @Test(priority = 2)
    public void login_with_Invalid_inputs(){
        Login obj = new Login(driver);
        obj.signin();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,300)");
        obj.enter_username("abcdefg@gmail.com");
        obj.enter_password("asdfrgt126");
        obj.clickOnlogin();
    }
    @Test(priority = 3)
    public void login_with_empty_inputs(){
        Login obj = new Login(driver);
        obj.signin();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,300)");
        obj.clickOnlogin();
    }

    @AfterMethod
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
