package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyAccount {
    WebDriver driver;
    public MyAccount(WebDriver driver){
        this.driver = driver;
    }
    By customer_dropdown = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    By myaccount = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a");
    By edit = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div/div[2]/a[1]/span");
    By first_name = By.id("firstname");
    By last_name = By.id("lastname");
    By email_ckbox = By.name("change_email");
    By email_value = By.name("email");
    By cur_pswd = By.name("current_password");
    By save_button = By.xpath(".//button[@title=\"Save\"]");
    By successMsg = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");
    By password_ckbox = By.name("change_password");
    By new_password = By.name("password");
    By conf_password = By.name("password_confirmation");
    By address_book = By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[6]/a");
    By company = By.name("company");
    By phnum = By.name("telephone");
    By street1 = By.id("street_1");
    By street2 = By.id("street_2");
    By street3 = By.id("street_3");
    By city = By.id("city");
    By state1 = By.name("region_id");
    By zip = By.name("postcode");
    By country = By.id("country");
    By save_address_button = By.xpath(".//button[@title=\"Save Address\"]");
    By add_new_address_button = By.xpath(".//button[@title=\"Add New Address\"]");
    By billing_chkbox =By.id("primary_billing");
    By shipping_chkbox =By.id("primary_shipping");
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
    public void click_Myaccount(){
        driver.findElement(myaccount).click();
    }
    public void click_edit_link(){
        driver.findElement(edit).click();
    }
    public void verify_firstname(String fname){
        String f_name = driver.findElement(first_name).getText();
        if(f_name.equals(fname)){
            System.out.println("First name is verified");
        }
    }
    public void verify_lastname(String lname){
        String l_name = driver.findElement(last_name).getText();
        if(l_name.equals(lname)){
            System.out.println("Last name is verified");
        }
    }
    public void click_change_email(){
        driver.findElement(email_ckbox).click();
    }
    public void verify_email(String email){
        String email_id = driver.findElement(email_value).getText();
        if(email_id.equals(email)){
            System.out.println("Email address is verified");
        }
    }
    public void change_email(String newEmail){
        driver.findElement(email_value).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
        driver.findElement(email_value).sendKeys(newEmail);
    }
    public void enter_current_password(String password){
        driver.findElement(cur_pswd).sendKeys(password);
    }
    public void Click_save(){
        driver.findElement(save_button).click();
    }
    public void verify_login_page_title(String title){
        if(driver.getTitle().equals(title)){
            System.out.println("Successfully landed on the login page");
        }
    }
    public void verify_success_message(String msg){
        String message = driver.findElement(successMsg).getText();
        if(message.equals(msg)){
            System.out.println("Email address was changed successfully");
        }
    }
    public void Click_change_password(){
        driver.findElement(password_ckbox).click();
    }
    public void enter_new_password(String password){
        driver.findElement(new_password).sendKeys(password);
    }
    public void enter_confirm_password(String password){
        driver.findElement(conf_password).sendKeys(password);
    }
    public void verify_pswd_success_message(String msg){
        String message = driver.findElement(successMsg).getText();
        if(message.equals(msg)){
            System.out.println("Password was changed successfully");
        }
    }
    public void Click_addressBook(){
        driver.findElement(address_book).click();
    }
    public void enter_company(String cmpny){
        driver.findElement(company).sendKeys(cmpny);
    }
    public void enter_phone_number(String ph_num){
        driver.findElement(phnum).sendKeys(ph_num);
    }
    public void enter_street_address(String st1,String st2,String st3){
        driver.findElement(street1).sendKeys(st1);
        driver.findElement(street2).sendKeys(st2);
        driver.findElement(street3).sendKeys(st3);
    }
    public void enter_city(String cty){
        driver.findElement(city).sendKeys(cty);
    }
    public void enter_state(String ste){
        WebElement state = driver.findElement(state1);
        Select s = new Select(state);
        s.selectByVisibleText(ste);
//        s.selectByValue(ste);
    }
    public void enter_zip(String pin){
        driver.findElement(zip).sendKeys(pin);
    }
    public void enter_country(String ctry){
        WebElement cty = driver.findElement(country);
        Select s = new Select(cty);
//        s.selectByValue(ctry);
        s.selectByVisibleText(ctry);
    }
    public void click_save_address() {
        driver.findElement(save_address_button).click();
    }
    public void click_add_new_address() {
        driver.findElement(add_new_address_button).click();
    }
    public void def_billing() {
        driver.findElement(billing_chkbox).click();
    }
    public void def_shipping() {
        driver.findElement(shipping_chkbox).click();
    }

}
