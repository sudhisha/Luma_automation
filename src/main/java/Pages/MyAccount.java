package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyAccount {
    WebDriver driver;
    public MyAccount(WebDriver driver){
        this.driver = driver;
    }
    By customer_dropdown = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");


    public void login_with_valid_inputs(){
        Login obj = new Login(driver);
        obj.signin();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,300)");
        obj.enter_username("deepikak1996@gmail.com");
        obj.enter_password("Deepikak@1996");
        obj.clickOnlogin();
    }

    public void click_customer_dropdown(){
        driver.findElement(customer_dropdown).click();
    }
}
