package MainClass_Pages;


import Pages.MyAccount;
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
    }
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
