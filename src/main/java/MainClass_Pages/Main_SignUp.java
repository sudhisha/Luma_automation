package MainClass_Pages;

import Pages.SignUp;
import Pages.TestNGListeners;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(TestNGListeners.class)
public class Main_SignUp {
    WebDriver driver = null;

    @BeforeMethod
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
    }
    @Test(priority = 1)
    public void SignUp_with_valid_inputs(){
        SignUp obj = new SignUp(driver);
        obj.sign_up();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(350,500)");
        obj.enter_firstName("Deepika");
        obj.enter_lastName("K");
        obj.enter_email("deepikak1996@gmail.com");
        obj.enter_password("Deepikak@1996");
        obj.enter_confirmPassword("Deepikak@1996");
        obj.enter_signup_button();
    }
    @Test(priority = 3)
    public void SignUp_with_Invalid_email(){
        SignUp obj = new SignUp(driver);
        obj.sign_up();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(350,500)");
        obj.enter_firstName("Deepika");
        obj.enter_lastName("K");
        obj.enter_email("avgcfrbhy");
        obj.enter_password("Deepikak@1996");
        obj.enter_confirmPassword("Deepikak@1996");
        obj.enter_signup_button();
    }
    @Test(priority = 2)
    public void SignUp_with_empty_inputs(){
        SignUp obj = new SignUp(driver);
        obj.sign_up();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(350,500)");
        obj.enter_signup_button();
    }
    @Test(priority = 4)
    public void SignUp_with_invalid_password_with_length(){
        SignUp obj = new SignUp(driver);
        obj.sign_up();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(350,500)");
        obj.enter_firstName("Deepika");
        obj.enter_lastName("K");
        obj.enter_email("deepikak1996@gmail.com");
        obj.enter_password("1234ab");
        obj.enter_confirmPassword("Deepikak@1996");
        obj.enter_signup_button();
    }
    @Test(priority = 5)
    public void SignUp_with_invalid_password_with_numbers(){
        SignUp obj = new SignUp(driver);
        obj.sign_up();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(350,500)");
        obj.enter_firstName("Deepika");
        obj.enter_lastName("K");
        obj.enter_email("deepikak1996@gmail.com");
        obj.enter_password("12345678");
        obj.enter_confirmPassword("Deepikak@1996");
        obj.enter_signup_button();
    }
    @Test(priority = 6)
    public void SignUp_with_invalid_password_with_alphabets(){
        SignUp obj = new SignUp(driver);
        obj.sign_up();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(350,500)");
        obj.enter_firstName("Deepika");
        obj.enter_lastName("K");
        obj.enter_email("deepikak1996@gmail.com");
        obj.enter_password("abcdefgh");
        obj.enter_confirmPassword("Deepikak@1996");
        obj.enter_signup_button();
    }
    @Test(priority = 7)
    public void SignUp_with_password_and_confirmPswd(){
        SignUp obj = new SignUp(driver);
        obj.sign_up();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(350,500)");
        obj.enter_firstName("Deepika");
        obj.enter_lastName("K");
        obj.enter_email("deepikak1996@gmail.com");
        obj.enter_password("Deepikak@91");
        obj.enter_confirmPassword("Deepikak@1996");
        obj.enter_signup_button();
    }
    @AfterMethod
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
