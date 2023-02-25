package webdriverExamples;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class TC_Drag_Drop {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
        driver.switchTo().frame(0);
        Actions ac = new Actions(driver);
        ac.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")),driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).perform();
        System.out.println("Drag&Drop completed");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.close();
		
	}

}
