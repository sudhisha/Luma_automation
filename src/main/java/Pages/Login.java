package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }

    By signin_link = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    By username = By.name("login[username]");
    By password = By.name("login[password]");
    By login_button = By.name("send");
    public void signin(){
        driver.findElement(signin_link).click();
    }
    public void enter_username(String uname){
        driver.findElement(username).sendKeys(uname);
    }
    public void enter_password(String pswd){
        driver.findElement(password).sendKeys(pswd);
    }
    public void clickOnlogin(){
        driver.findElement(login_button).click();
    }

}
