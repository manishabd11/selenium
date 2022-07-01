package webdriverExamples;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class TC001_Login_Logout {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\selenium driver,jar\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.close();
	}

}
