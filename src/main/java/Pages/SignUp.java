package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
    WebDriver driver;
    public SignUp(WebDriver driver){
        this.driver = driver;
    }
    By signup_link = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By first_name = By.id("firstname");
    By last_name = By.id("lastname");
    By email = By.name("email");
    By password = By.name("password");
    By cpassword = By.name("password_confirmation");
    By signup_button = By.xpath(".//button[@title=\"Create an Account\"]");
    public void sign_up(){
        driver.findElement(signup_link).click();
    }
    public void enter_firstName(String fname){
        driver.findElement(first_name).sendKeys(fname);
    }
    public void enter_lastName(String lname){
        driver.findElement(last_name).sendKeys(lname);
    }
    public void enter_email(String emailid){
        driver.findElement(email).sendKeys(emailid);
    }
    public void enter_password(String pswd){
        driver.findElement(password).sendKeys(pswd);
    }
    public void enter_confirmPassword(String cpswd){
        driver.findElement(cpassword).sendKeys(cpswd);
    }
    public void enter_signup_button(){
        driver.findElement(signup_button).click();
    }
}
