package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    WebDriver driver;
    public Logout(WebDriver driver){
        this.driver = driver;
    }

    By customer_dpdown = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    By signout_link = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");
    public void click_customer_dpdown(){
        driver.findElement(customer_dpdown).click();
    }
    public void signout(){
        driver.findElement(signout_link).click();
    }

}
