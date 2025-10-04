package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main (String[]args) {
    	ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    }
}
