package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/KALELI/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");


        WebElement bestSeller = driver.findElement(By.xpath("//*[contains(@data-csa-c-content-id,'best')]"));
        bestSeller.click();

        WebElement todaysDeals = driver.findElement(By.xpath("//*[contains(@data-csa-c-content-id,'nav_cs_gb')]"));
        todaysDeals.click();

        WebElement customerService = driver.findElement(By.xpath("//*[contains(@data-csa-c-content-id,'customerservice')]"));
        customerService.click();

        WebElement amazonBasics = driver.findElement(By.xpath("//*[contains(@data-csa-c-content-id,'azonbasics')]"));
        amazonBasics.click();

        WebElement newReleases = driver.findElement(By.xpath("//*[contains(@data-csa-c-content-id,'newreleases')]"));
        newReleases.click();




    }
}
