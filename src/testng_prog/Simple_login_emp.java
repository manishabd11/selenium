package testng_prog;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Simple_login_emp {
@BeforeClass
public void login() {
	System.out.println("login completed");
	}
@AfterClass
public void logout () {
	System.out.println("logout completed");
	}
@Test
 public void addnewemp () {
	System.out.println("adding new emp");
	 }
@Test
public void delemp() {
	System.out.println("delete emp");
}


}
