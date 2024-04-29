package MainClass_Pages;


import Pages.MyAccount;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Main_Account {
    WebDriver driver = null;
    @BeforeTest
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
    }
    @Test(priority = 1)
    public void edit_email_of_account() {
        MyAccount myacc = new MyAccount(driver);
        myacc.login_with_valid_inputs();
        myacc.click_customer_dropdown();
        myacc.click_Myaccount();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(150,200)");
        myacc.click_edit_link();
        js.executeScript("window.scrollBy(300,350)");
        myacc.verify_firstname("Deepika");
        myacc.verify_lastname("K");
        myacc.click_change_email();
        myacc.verify_email("deepikak1996@gmail.com");
        myacc.change_email("deepikak96@gmail.com");
        myacc.enter_current_password("Deepikak@1996");
        myacc.Click_save();
        myacc.verify_login_page_title("Customer Login");
        myacc.verify_success_message("You saved the account information.");
    }
    @Test(priority = 2)
    public void change_password_of_account() {
        MyAccount myacc = new MyAccount(driver);
        myacc.login_with_valid_inputs();
        myacc.click_customer_dropdown();
        myacc.click_Myaccount();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(150,200)");
        myacc.click_edit_link();
        js.executeScript("window.scrollBy(300,350)");
        myacc.verify_firstname("Deepika");
        myacc.verify_lastname("K");
        myacc.Click_change_password();
        myacc.enter_current_password("Deepikak@1996");
        myacc.enter_new_password("Deepikak@199");
        myacc.enter_confirm_password("Deepikak@199");
        myacc.Click_save();
        myacc.verify_login_page_title("Customer Login");
        myacc.verify_pswd_success_message("You saved the account information.");
    }
    @Test(priority = 3)
    public void add_address() {
        MyAccount myacc = new MyAccount(driver);
        myacc.login_with_valid_inputs();
        myacc.click_customer_dropdown();
        myacc.click_Myaccount();
        myacc.Click_addressBook();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(400,500)");
        myacc.verify_firstname("Deepika");
        myacc.verify_lastname("K");

    }
//    @AfterTest
//    public void CloseDriver() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.close();
//    }
}
