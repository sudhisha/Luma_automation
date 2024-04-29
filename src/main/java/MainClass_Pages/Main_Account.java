package MainClass_Pages;


import Pages.MyAccount;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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
        try {
            myacc.verify_firstname("Deepika");
            myacc.verify_lastname("K");
            myacc.enter_company("TCS");
            myacc.enter_phone_number("9898989898");
            myacc.enter_street_address("Deepika Nivas", "Irinjalakuda", "Thrissur");
            myacc.enter_city("Irinjalakuda");
            myacc.enter_country("India");
            myacc.enter_zip("678765");
            myacc.enter_state("Kerala");
            js.executeScript("window.scrollBy(450,530)");
            myacc.click_save_address();
        }
        catch(Exception e){
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            myacc.click_add_new_address();
            myacc.verify_firstname("Deepika");
            myacc.verify_lastname("K");
            myacc.enter_company("TCS");
            myacc.enter_phone_number("9898989898");
            myacc.enter_street_address("Deepika Nivas", "Irinjalakuda", "Thrissur");
            myacc.enter_city("Irinjalakuda");
            myacc.enter_country("India");
            myacc.enter_zip("678765");
            myacc.enter_state("Kerala");
            js.executeScript("window.scrollBy(450,530)");
            myacc.def_billing();
            myacc.def_shipping();
            myacc.click_save_address();
        }
    }
//    @AfterTest
//    public void CloseDriver() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.close();
//    }
}
