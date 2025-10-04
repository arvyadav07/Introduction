package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Youtube_AI {
  
    public static void main(String[] args) throws InterruptedException {
        
        // Setting up Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");        // Disable notification popup
        options.addArguments("--disable-infobars");             // Disable infobars
        options.addArguments("--disable-save-password-bubble"); // Disable save password prompt
        options.addArguments("--disable-extensions");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        
        // Navigate to Google login page
        driver.get("https://accounts.google.com/ServiceLogin");
        
        // Wait for email field and enter email
        Thread.sleep(3000);  // Sleep to ensure the page has loaded
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("arvytest7");

        // Click "Next" button after entering email
        driver.findElement(By.id("identifierNext")).click();
        
        // Wait for password field and enter password
        Thread.sleep(3000);  // Sleep to ensure the password field is loaded
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passwordField.sendKeys("Arv@8858");

        // Click "Next" button after entering password
        driver.findElement(By.id("passwordNext")).click();
        
        // Wait for the page to load and YouTube to open
        Thread.sleep(5000);  // Sleep to ensure YouTube homepage has loaded
        
        // Navigate to YouTube
        driver.get("https://www.youtube.com");

        // Wait for the search box to be visible
        Thread.sleep(3000);  // Sleep to ensure the search box is visible
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("https://youtu.be/aD8WXZsi8e8");

        // Click on the search button
        driver.findElement(By.id("search-icon-legacy")).click();
        
        // Wait for the search results to load
        Thread.sleep(5000);  // Sleep to ensure search results are displayed
        
        // Click on the first video from the search results
        driver.findElement(By.xpath("//a[@id='video-title']")).click();

        // Wait for the video to load and play for a bit (5 seconds)
        Thread.sleep(5000);  // Sleep to ensure the video is playing
        
        // Close the browser
        driver.quit();
    }
}
