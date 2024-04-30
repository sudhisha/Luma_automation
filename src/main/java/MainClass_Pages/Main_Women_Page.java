package MainClass_Pages;

import Pages.Women_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Main_Women_Page {
    WebDriver driver = null;
    Women_Page wp;
    @BeforeTest
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
        wp = new Women_Page(driver);
        wp.login_with_valid_inputs();
    }
    @Test(priority = 1)
    public void verify_Hoodies_Sweatshirts_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_hoodies();
        wp.Verify_hoodies_page_title("Hoodies & Sweatshirts - Tops - Women");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 2)
    public void verify_Jackets_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_jackets();
        wp.Verify_jackets_page_title("Jackets - Tops - Women");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 3)
    public void verify_Tees_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_tees();
        wp.Verify_tees_page_title("Tees - Tops - Women");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 4)
    public void verify_Bras_Tanks_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_bt();
        wp.Verify_br_tanks_page_title("Bras & Tanks - Tops - Women");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(150,200)");
    }


    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
