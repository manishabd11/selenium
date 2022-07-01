package testng_prog;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample_prog_method {
	@BeforeMethod
	public void login() {
		System.out.println("login completed");
		}
	@AfterMethod
	public void logout () {
		System.out.println("logout completed");
		}
	@Test(priority=2)
	 public void addnewemp () {
		System.out.println("adding new emp");
		 }
	@Test(priority=1)
	public void delemp() {
		System.out.println("delete emp");
	}

}
