package webdriverExamples;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class IRCTC {
	public static void main (String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"8378868\"]")).sendKeys("Manishabd91");
		driver.findElement(By.xpath("//*[@id=\"1678857\"]")).sendKeys("Ki3gu3zf6");
		driver.findElement(By.id("loginText")).click();
		Thread.sleep(3000);
       File src =  driver.findElement(By.id("captchaImg")).getScreenshotAs(OutputType.FILE);
       FileHandler.copy(src, new File("D:\\screenshot img.png"));
       
        
        
        
		
		
		
	}

}
