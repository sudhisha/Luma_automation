package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Gear_Page {
    WebDriver driver;
    public Gear_Page(WebDriver driver){
        this.driver=driver;
    }
    By gear = By.id("ui-id-6");
    By bags = By.id("ui-id-25");
    By fitness = By.id("ui-id-26");
    By watches = By.id("ui-id-27");

    public void login_with_valid_inputs(){
        Login obj = new Login(driver);
        obj.signin();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,300)");
        obj.enter_username("deepikak1996@gmail.com");
        obj.enter_password("Deepikak@1996");
        obj.clickOnlogin();
    }
    public void select_gear(){
        WebElement mn = driver.findElement(gear);
        Actions act = new Actions(driver);
        act.moveToElement(mn).perform();
    }
    public void select_bags(){
        driver.findElement(bags).click();
    }
    public void select_fitness(){
        driver.findElement(fitness).click();
    }
    public void click_watches(){
        driver.findElement(watches).click();
    }
    public void Verify_bags_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Bags - Gear Page successfully");
        }
    }
    public void Verify_fitness_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Fitness Equipment - Gear Page successfully");
        }
    }
    public void Verify_watches_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Watches - Gear Page successfully");
        }
    }


}
