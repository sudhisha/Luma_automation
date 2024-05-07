package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

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
    By prd_hoodie = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/a");
    By size_med = By.id("option-label-size-143-item-168");
    By color_green = By.id("option-label-color-93-item-53");
    By qty = By.id("qty");
    By add_to_cart = By.xpath(".//button[@title=\"Add to Cart\"]");
    By product_name = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[1]/h1/span");
    By product_name_wsh = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[1]/h1/span");
    By added_confn = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    By add_to_wishlist = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[1]");
    By added_wsh_confn = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    By add_to_comparelist = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[2]");
    By added_cmp_confn = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    By cmpare_list_link = By.xpath("/html/body/div[2]/header/div[2]/ul/li/a");
    By customer_dpdown = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    By wish_list_link = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a");
    By mh_prod = By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li");
    By rm_prod = By.xpath(".//a[@title=\"Remove Item\"]");
    By added_rem_confn = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    String pname = " ";
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
    }
    public void click_shorts(){
        driver.findElement(shorts).click();
    }
    public void Verify_shorts_page_title(String title){
        if(driver.getTitle().contains(title)){
            System.out.println("Landed on the Shorts - Bottoms - Women Page successfully");
        }
    }
    public void click_on_product_hoodie(){
        driver.findElement(prd_hoodie).click();
    }
    public void click_on_size_medium(){
        driver.findElement(size_med).click();
    }
    public void select_color_green(){
        driver.findElement(color_green).click();
    }
    public void enter_qty(){
        driver.findElement(qty).sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        driver.findElement(qty).sendKeys("2");
    }
    public void click_add_to_cart_button(){
        driver.findElement(add_to_cart).click();
    }
    public void verify_the_added_cart_message(){
        String pname = driver.findElement(product_name).getText();
        String added_conf = driver.findElement(added_confn).getText();
        if(added_conf.contains(pname)){
            System.out.println("Product "+pname+" added to cart successfully ");
        }
    }
    public void click_add_to_wishlist(){
        pname = driver.findElement(product_name_wsh).getText();
        driver.findElement(add_to_wishlist).click();
    }
    public void verify_the_added_wishlist_message(){
        String added_wsh_conf = driver.findElement(added_wsh_confn).getText();
        if(added_wsh_conf.contains(pname)){
            System.out.println("Product "+pname+" has been added to wishlist successfully ");
        }
        if(driver.getTitle().contains("My Wish List")){
            System.out.println("Landed on wishlist page successfully ");
        }
    }
    public void click_add_to_compare_list(){
        driver.findElement(add_to_comparelist).click();
    }
    public void verify_the_added_comparelist_message(){
        String pname = driver.findElement(product_name).getText();
        String added_cmp_conf = driver.findElement(added_cmp_confn).getText();
        if(added_cmp_conf.contains(pname)){
            System.out.println("Product "+pname+" added to compare list successfully ");
        }
    }
    public void click_comparelist_link(){
        driver.findElement(cmpare_list_link).click();
    }
    public void verify_comparelist_page(){
        if(driver.getTitle().contains("Comparison")){
            System.out.println("Landed on the Products Comparison List - Magento Commerce page successfully");
        }
    }
    public void click_customer_dpdown(){
        driver.findElement(customer_dpdown).click();
    }
    public void click_wishlist_link(){
        driver.findElement(wish_list_link).click();
    }
    public void verify_wishlist_page(){
        if(driver.getTitle().contains("My Wish List")){
            System.out.println("Landed on wishlist page successfully ");
        }
    }
    public void mousehover_on_product(){
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(mh_prod)).perform();
    }
    public void remove_product(){
        pname = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li[1]/div/strong/a")).getText();
        driver.findElement(rm_prod).click();
    }
    public void verify_remove_product(){
        String added_rem_conf = driver.findElement(added_rem_confn).getText();
        if(added_rem_conf.contains(pname)){
            System.out.println("Product "+pname+" has been removed from your wish list successfully ");
        }
    }

}
