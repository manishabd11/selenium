package webdriverExamples;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TC_WindHand {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver window = new ChromeDriver();
		window.get("D:\\selenium driver,jar\\windhand\\multiplewindows.html");
		Thread.sleep(3000);
		window.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		window.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String>windinfo = new ArrayList<String>(window.getWindowHandles());
		window.switchTo().window(windinfo.get(0));
		Thread.sleep(3000);
		window.quit();
		
	}

}
