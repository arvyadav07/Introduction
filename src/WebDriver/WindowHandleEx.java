 package WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {
 public static void main (String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		
		Set<String> win = driver.getWindowHandles();
		System.out.println(win);
		
		String win1=null;
		String win2=null;
		Iterator<String> it = win.iterator();
		
		while(it.hasNext()) {
			win1=it.next();
			win2=it.next();
		}
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		driver.switchTo().window(win1);
		String Heading = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1")).getText();
		System.out.println("Heading is " +Heading);
 }
}
