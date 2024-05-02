package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Men_Page {
    WebDriver driver;
    public Men_Page(WebDriver driver){
        this.driver=driver;
    }
    By men = By.id("ui-id-5");
    By tops = By.id("ui-id-17");
    By bottoms = By.id("ui-id-18");
    By hoodie = By.id("ui-id-20");
    By jacket = By.id("ui-id-19");
    By tees = By.id("ui-id-21");
    By tanks = By.id("ui-id-22");
    By pants = By.id("ui-id-23");
    By shorts = By.id("ui-id-24");
    public void login_with_valid_inputs(){
        Login obj = new Login(driver);
        obj.signin();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,300)");
        obj.enter_username("deepikak1996@gmail.com");
        obj.enter_password("Deepikak@1996");
        obj.clickOnlogin();
    }
    public void select_men(){
        WebElement mn = driver.findElement(men);
        Actions act = new Actions(driver);
        act.moveToElement(mn).perform();
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
            System.out.println("Landed on the Hoodies & Sweatshirts - Tops - Men Page successfully");
        }
    }
    public void click_jackets(){
        driver.findElement(jacket).click();
    }
    public void Verify_jackets_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Jackets - Tops - Men Page successfully");
        }
    }
    public void click_tees(){
        driver.findElement(tees).click();
    }
    public void Verify_tees_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Tees - Tops - Men Page successfully");
        }
    }
    public void click_tanks(){
        driver.findElement(tanks).click();
    }
    public void Verify_tanks_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Tanks - Tops - Men Page successfully");
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
            System.out.println("Landed on the Pants - Bottoms - Men Page successfully");
        }
    }
    public void click_shorts(){
        driver.findElement(shorts).click();
    }
    public void Verify_shorts_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Shorts - Bottoms - Men Page successfully");
        }
    }


}
