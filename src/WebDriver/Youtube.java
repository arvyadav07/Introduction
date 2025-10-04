package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-extensions");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div[2]")).click();
        driver.findElement(By.cssSelector("input[aria-label='Email or phone']")).sendKeys("arvytest7");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Arv@8858");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
        Thread.sleep(5000);
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("https://youtu.be/aD8WXZsi8e8");

        driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/button/span/span/div")).click();
       Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='video-title']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/yt-button-view-model/button-view-model/button/yt-touch-feedback-shape/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"target\"]/yt-icon/span/div")).click();
        
         
        /*for (int i = 1; i <= 1000; i++) {
            driver.navigate().refresh();
            System.out.println("Refreshed: " + i + " times");

            // Optional: wait 1 second between refreshes to avoid overload
            Thread.sleep(10000);
        }*/

       // driver.quit();
        
  
        driver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/yt-button-view-model/button-view-model/button/yt-touch-feedback-shape/div[2]")).click();
    }
}
