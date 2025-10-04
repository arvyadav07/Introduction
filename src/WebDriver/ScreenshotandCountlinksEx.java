package WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotandCountlinksEx {
        public static void main(String[] args) throws IOException {
        	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.mycontactform.com/samples.php");
        int Totallinksonpage = driver.findElements(By.tagName("a")).size();
        System.out.println("Total Links "+Totallinksonpage);
        
        int Totalleftpanellinks = driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a")).size();
        System.out.println("Total Links from Left Panel "+Totalleftpanellinks);
        
        int TotalSublinksLeftPannel= driver.findElements(By.xpath("//*[@id='left_col_top']/ul")).size();
        System.out.println("Total Sub Links from Left Panel "+TotalSublinksLeftPannel);
        
        for (int i=1; i<=TotalSublinksLeftPannel; i++) {
        	int InternalLinks = driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+ i +"]/li")).size();      
             for(int j = 1; j<= InternalLinks;j++) {
            	 driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+ i +"]/li["+ j +"]/a")).click();
            	 String Heading = driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+ i +"]/li["+ j +"]/a")).getText();
            	 System.out.println(Heading);
            	 
            	 File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            	 Files.copy(f1, new File("C:\\Java\\MyProject\\New folder6 " + Heading + ".jpg"));
             }
        }
        
        
	}

}
