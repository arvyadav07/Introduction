package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/");

		driver.navigate().to("https://selenium.dev/");
		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
}
