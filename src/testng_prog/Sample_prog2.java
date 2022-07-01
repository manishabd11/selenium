package testng_prog;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample_prog2 {
	@BeforeClass
	public void login() {
		System.out.println("login completed");
		}
	@AfterClass
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
