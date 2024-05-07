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
    By bags_data = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div");
    By review_link = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/a[2]");
    By rating_1 = By.id("Rating_1_label");
    By review_form = By.id("review-form");
    By summary = By.id("summary_field");
    By review = By.name("detail");
    By submit_review = By.xpath(".//button/span[text()=\"Submit Review\"]");
    By submit_review_msg = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");

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
    public void click_on_prod_bag(){
        driver.findElement(bags_data).click();
    }
    public void click_on_add_review_link(){
        driver.findElement(review_link).click();
        WebElement rf = driver.findElement(review_form);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", rf);
    }
    public void click_on_rating1(){
        WebElement ratingElement = driver.findElement(rating_1);
        ratingElement.click();
    }
    public void enter_summary(String summary1){
        driver.findElement(summary).sendKeys(summary1);
    }
    public void enter_review(String review1){
        driver.findElement(review).sendKeys(review1);
    }
    public void click_on_submit_review(){
        driver.findElement(submit_review).click();
    }
    public void verify_submit_review_msg(){
        String msg = driver.findElement(submit_review_msg).getText();
        System.out.println("msg: "+msg);
        if(msg.contains("submitted your review")){
            System.out.println("Your review submitted successfully");
        }
    }
    public void click_on_username(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]")).click();
    }
    public void click_on_myAccount(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
    }
    public void verify_Account_page_title(){
        if(driver.getTitle().contains("My Account")){
            System.out.println("Landed on my account page successfully");
        }
    }
    public void click_on_my_prd_reviews(){
        driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[10]/a")).click();
    }
    public void verify_review_page_title(){
        if(driver.getTitle().contains("My Product Reviews")){
            System.out.println("Landed on My Product Reviews page successfully");
        }
    }
    public void click_on_see_details_link(){
        driver.findElement(By.xpath("//*[@id=\"my-reviews-table\"]/tbody/tr[1]/td[5]/a")).click();
    }
    public void verify_review_details_page_title(){
        if(driver.getTitle().contains("Review Details")){
            System.out.println("Landed on Review Details page successfully");
        }
    }
    public void verify_rating(){
        WebElement rating = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/span/span"));
        if(rating.getText().equals("20%")){
            System.out.println("one star Rating was given, Verified successfully!...");
        }
    }
    public void verify_summary(){
        WebElement summary = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div[3]"));
        if(summary.getText().equals("Good")){
            System.out.println("Summary was given Verified successfully!...");
        }
    }
    public void verify_review(){
        WebElement summary = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div[4]"));
        if(summary.getText().equals("Very nice product! Great quality & affordable price")){
            System.out.println("Review was given Verified successfully!...");
        }
    }

}
