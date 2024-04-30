package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Women_Page {
    WebDriver driver;
    public Women_Page(WebDriver driver){
        this.driver=driver;
    }
    By women = By.id("ui-id-4");
    By tops = By.id("ui-id-9");
    By bottoms = By.id("ui-id-10");
    By hoodie = By.id("ui-id-12");
    By jacket = By.id("ui-id-11");
    By tees = By.id("ui-id-13");
    By bs = By.id("ui-id-14");
    By pants = By.id("ui-id-15");
    By shorts = By.id("ui-id-16");

    public void login_with_valid_inputs(){
        Login obj = new Login(driver);
        obj.signin();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,300)");
        obj.enter_username("deepikak1996@gmail.com");
        obj.enter_password("Deepikak@1996");
        obj.clickOnlogin();
    }
    public void select_women(){
        WebElement wn = driver.findElement(women);
        Actions act = new Actions(driver);
        act.moveToElement(wn).perform();
    }
    public void select_tops(){
        WebElement tp = driver.findElement(tops);
        Actions act = new Actions(driver);
        act.moveToElement(tp).perform();
    }
    public void click_hoodies(){
        driver.findElement(hoodie).click();
    }
    public void Verify_hoodies_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Hoodies & Sweatshirts - Tops - Women Page successfully");
        }
    }
    public void click_jackets(){
        driver.findElement(jacket).click();
    }
    public void Verify_jackets_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Jackets - Tops - Women Page successfully");
        }
    }
    public void click_tees(){
        driver.findElement(tees).click();
    }
    public void Verify_tees_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Tees - Tops - Women Page successfully");
        }
    }
    public void click_bt(){
        driver.findElement(bs).click();
    }
    public void Verify_br_tanks_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Bras & Tanks - Tops - Women Page successfully");
        }
    }
    public void select_bottom(){
        WebElement btm = driver.findElement(bottoms);
        Actions ac = new Actions(driver);
        ac.moveToElement(btm).perform();
    }
    public void click_pants(){
        driver.findElement(pants).click();
    }
    public void Verify_pants_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Pants - Bottoms - Women Page successfully");
        }
    }public void click_shorts(){
        driver.findElement(shorts).click();
    }
    public void Verify_shorts_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Shorts - Bottoms - Women Page successfully");
        }
    }


}
