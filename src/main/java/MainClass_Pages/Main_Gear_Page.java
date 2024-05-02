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
    Gear_Page gp;
    @BeforeTest
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
        gp = new Gear_Page(driver);
        gp.login_with_valid_inputs();
    }
    @Test(priority = 1)
    public void verify_bags_page(){
        gp.select_gear();
        gp.select_bags();
        gp.Verify_bags_page_title("Bags - Gear");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(300,320)");
    }
    @Test(priority = 2)
    public void verify_fitness_page(){
        gp.select_gear();
        gp.select_fitness();
        gp.Verify_fitness_page_title("Fitness Equipment - Gear");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(250,300)");
    }
    @Test(priority = 3)
    public void verify_watches_page(){
        gp.select_gear();
        gp.click_watches();
        gp.Verify_watches_page_title("Watches - Gear");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(250,300)");
    }
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
