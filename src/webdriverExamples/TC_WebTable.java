package webdriverExamples;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TC_WebTable {
	private static PrintStream out;

	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver,jar\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver webtable = new ChromeDriver();
		webtable.get("D:\\selenium driver,jar\\windhand\\WebTable.html");
		int row =   webtable.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		int col = webtable.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col = webtable.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		String celldata = webtable.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(celldata);
		for(int i=1;i<=row;i++) {
			String data = webtable.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"")).getText();
			System.out.println(data);
			Thread.sleep(3000);
		}
		
		webtable.close();
		
	}

}
