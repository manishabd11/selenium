package webdriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_LINK_Check {
	public static void main (String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver link = new ChromeDriver();
		link.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		List<WebElement>links=link.findElements(By.tagName("a"));
		for(WebElement val:links) {
			System.out.println(val.getText());
			Thread.sleep(3000);
		}
		link.close();
		}

}
