package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prime {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/gp/video/storefront/ref=atv_hm_hom_legacy_redirect?contentId=IncludedwithPrime&contentType=merch&merchId=IncludedwithPrime");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='nav-signin-tooltip']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ap_email_login")).sendKeys("msd27738@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.className("a-button-input")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ap_password")).sendKeys("Arv@123");
	Thread.sleep(3000);
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"pv-nav-container\"]/div/div[1]/div[2]/ul/li[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Panchayat");
	Thread.sleep(1000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(1000);
	WebElement movie = driver.findElement(By.linkText("Panchayat"));
	if(movie.isDisplayed()) {
		System.out.println("Movie is visible");
		movie.click();
	}
	else {
		System.out.println("Movie is not visible");
	}
	//WebElement rating = driver.findElement(By.className("fbl-star-rating _1xF4ds _1uvlQr"));
	//System.out.println(rating);
   // driver.close();
	//Arvind Yadav
}
}