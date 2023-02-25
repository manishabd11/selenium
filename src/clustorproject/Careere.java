package clustorproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Careere {
	public static void main (String args []) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.clustorcomputing.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rs-header\"]/div/div/div/div[2]/div/div[1]/nav/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rs-blog\"]/div/div[2]/div/div[1]/div/div[4]/div/div[1]/ul/li/a")).click();
		Thread.sleep(3000);
		System.out.println("Google form is open ");
	   
        
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
