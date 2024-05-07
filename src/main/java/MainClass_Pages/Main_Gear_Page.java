package MainClass_Pages;

import Pages.Gear_Page;
import Pages.Men_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Main_Gear_Page {
    WebDriver driver = null;
    JavascriptExecutor js;
    Gear_Page gp;
    @BeforeTest
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
        js =(JavascriptExecutor) driver;
        gp = new Gear_Page(driver);
        gp.login_with_valid_inputs();
    }
    @Test(priority = 1)
    public void verify_bags_page(){
        gp.select_gear();
        gp.select_bags();
        gp.Verify_bags_page_title("Bags - Gear");
        js.executeScript("window.scrollBy(300,320)");
    }
    @Test(priority = 2)
    public void verify_fitness_page(){
        gp.select_gear();
        gp.select_fitness();
        gp.Verify_fitness_page_title("Fitness Equipment - Gear");
        js.executeScript("window.scrollBy(250,300)");
    }
    @Test(priority = 3)
    public void verify_watches_page(){
        gp.select_gear();
        gp.click_watches();
        gp.Verify_watches_page_title("Watches - Gear");
        js.executeScript("window.scrollBy(250,300)");
    }
    @Test(priority = 4)
    public void add_reviews(){
        gp.select_gear();
        gp.select_bags();
        gp.Verify_bags_page_title("Bags - Gear");
        js.executeScript("window.scrollBy(550,450)");
        gp.click_on_prod_bag();
        js.executeScript("window.scrollBy(550,450)");
        gp.click_on_add_review_link();
        gp.click_on_rating1();
        gp.enter_summary("Good");
        gp.enter_review("Very nice product! Great quality & affordable price");
        gp.click_on_submit_review();
        gp.verify_submit_review_msg();
    }
    @Test(priority = 5)
    public void view_my_reviews(){
        gp.click_on_username();
        gp.click_on_myAccount();
        gp.verify_Account_page_title();
        js.executeScript("window.scrollBy(550,450)");
        gp.click_on_my_prd_reviews();
        js.executeScript("window.scrollBy(550,450)");
        gp.verify_review_page_title();
        js.executeScript("window.scrollBy(550,450)");
        gp.click_on_see_details_link();
        gp.verify_review_details_page_title();
        js.executeScript("window.scrollBy(550,450)");
        gp.verify_rating();
        gp.verify_summary();
        gp.verify_review();
    }
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
