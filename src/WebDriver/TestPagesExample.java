package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPagesExample {

	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.findElement(By.name("username")).sendKeys("Arvind");
		driver.findElement(By.name("password")).sendKeys("Wipro@123");
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("I am learning Selenium");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)","");
		
		boolean ch1 = driver.findElement(By.xpath("//*[@value='cb3']")).isSelected();
		
		if(ch1==false) {
			driver.findElement(By.xpath("//*[@value='cb3']")).click();
			System.out.println("Checkbox 3 is clicked");
			
		}
		
boolean rd3 = driver.findElement(By.xpath("//*[@value='rd3']")).isSelected();
		
		if(rd3==false) {
			driver.findElement(By.xpath("//*[@value='rd3']")).click();
			System.out.println("Radio 3 is clicked");
			
		}
		
		Select multi = new Select(driver.findElement(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[7]/td/select")));
		
		multi.deselectAll();
		multi.selectByIndex(0);
		multi.selectByVisibleText("Selection Item 2");
		
		Select DropD = new Select(driver.findElement(By.name("dropdown")));
		DropD.selectByIndex(3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='submit' or @value='submit']")).click();
		
		String username = driver.findElement(By.id("_valueusername")).getText();
		System.out.println("Name displayed is "+username);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,450)","");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Go back to the form")).click();
		
	}
}
