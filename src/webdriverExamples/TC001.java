package webdriverExamples;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver,jar\\driver2\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		driver.close();
		
	}

}
