package webdriverExamples;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Screenshots {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try
		{
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.linkText("PIM"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add employee ")).click();
		Thread.sleep(3000);
		System.out.println("click on submenu");

		}
	catch (Exception e) {
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File ("D:\\screenshot img.png"));
		
		}
	driver.quit();

}
}


