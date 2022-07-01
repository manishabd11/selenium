package webdriverExamples;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByValue("0");
		Thread.sleep(3000);
		driver.findElement(By.name("loc_name")).sendKeys("0005");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println("emp id deleted");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("logout completed");
		driver.close();
		}
	}
