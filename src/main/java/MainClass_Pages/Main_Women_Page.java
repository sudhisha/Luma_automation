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
    JavascriptExecutor js;

    @BeforeTest
    public void LaunchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/");
        wp = new Women_Page(driver);
        wp.login_with_valid_inputs();
        js =(JavascriptExecutor) driver;
    }
    @Test(priority = 1)
    public void verify_Hoodies_Sweatshirts_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_hoodies();
        wp.Verify_hoodies_page_title("Hoodies & Sweatshirts - Tops - Women");
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 2)
    public void verify_Jackets_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_jackets();
        wp.Verify_jackets_page_title("Jackets - Tops - Women");
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 3)
    public void verify_Tees_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_tees();
        wp.Verify_tees_page_title("Tees - Tops - Women");
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 4)
    public void verify_Bras_Tanks_page(){
        wp.select_women();
        wp.select_tops();
        wp.click_bt();
        wp.Verify_br_tanks_page_title("Bras & Tanks - Tops - Women");
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 5)
    public void verify_pants_page(){
        wp.select_women();
        wp.select_bottom();
        wp.click_pants();
        wp.Verify_pants_page_title("Pants - Bottoms - Women");
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 6)
    public void verify_shorts_page(){
        wp.select_women();
        wp.select_bottom();
        wp.click_shorts();
        wp.Verify_shorts_page_title("Shorts - Bottoms - Women");
        js.executeScript("window.scrollBy(150,200)");
    }
    @Test(priority = 7)
    public void add_to_cart() {
        wp.select_women();
        wp.select_tops();
        wp.click_hoodies();
        wp.Verify_hoodies_page_title("Hoodies & Sweatshirts - Tops - Women");
        js.executeScript("window.scrollBy(400,370)");
        wp.click_on_product_hoodie();
        js.executeScript("window.scrollBy(150,200)");
        wp.click_on_size_medium();
        wp.select_color_green();
        wp.enter_qty();
        wp.click_add_to_cart_button();
        js.executeScript("window.scrollTo(0,0)","");
        wp.verify_the_added_cart_message();
    }
    @Test(priority = 8)
    public void add_to_wishlist() {
        wp.select_women();
        wp.select_tops();
        wp.click_hoodies();
        wp.Verify_hoodies_page_title("Hoodies & Sweatshirts - Tops - Women");
        js.executeScript("window.scrollBy(400,370)");
        wp.click_on_product_hoodie();
        js.executeScript("window.scrollBy(150,200)");
        wp.click_on_size_medium();
        wp.select_color_green();
        wp.enter_qty();
        wp.click_add_to_wishlist();
        js.executeScript("window.scrollTo(0,0)","");
        wp.verify_the_added_wishlist_message();
    }
    @Test(priority = 9)
    public void add_to_compare_list() {
        wp.select_women();
        wp.select_tops();
        wp.click_hoodies();
        wp.Verify_hoodies_page_title("Hoodies & Sweatshirts - Tops - Women");
        js.executeScript("window.scrollBy(400,370)");
        wp.click_on_product_hoodie();
        js.executeScript("window.scrollBy(150,200)");
        wp.click_on_size_medium();
        wp.select_color_green();
        wp.enter_qty();
        wp.click_add_to_compare_list();
        js.executeScript("window.scrollTo(0,0)","");
        wp.verify_the_added_comparelist_message();
    }
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
