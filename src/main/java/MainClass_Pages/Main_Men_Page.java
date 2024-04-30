package MainClass_Pages;

import Pages.Men_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Main_Men_Page {
    WebDriver driver = null;
    Men_Page mp;
    @BeforeTest
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
        mp = new Men_Page(driver);
        mp.login_with_valid_inputs();
    }
    @Test(priority = 1)
    public void verify_Hoodies_Sweatshirts_page(){
        mp.select_men();
        mp.select_tops();
        mp.click_hoodies();
        mp.Verify_hoodies_page_title("Hoodies & Sweatshirts - Tops - Men");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(250,290)");
    }
    @Test(priority = 2)
    public void verify_Jackets_page(){
        mp.select_men();
        mp.select_tops();
        mp.click_jackets();
        mp.Verify_jackets_page_title("Jackets - Tops - Men");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(250,300)");
    }
    @Test(priority = 3)
    public void verify_Tees_page(){
        mp.select_men();
        mp.select_tops();
        mp.click_tees();
        mp.Verify_tees_page_title("Tees - Tops - Men");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(250,300)");
    }
    @Test(priority = 4)
    public void verify_Tanks_page(){
        mp.select_men();
        mp.select_tops();
        mp.click_tanks();
        mp.Verify_tanks_page_title("Tanks - Tops - Men");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(250,300)");
    }


    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
