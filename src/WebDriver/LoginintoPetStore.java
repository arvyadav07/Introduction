package WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginintoPetStore {

	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='password']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("signon")).click();
		Thread.sleep(3000);
		
		Alert pop = driver.switchTo().alert();
		System.out.println(pop.getText());
		pop.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
