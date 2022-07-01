package com.hrms.testscripts;

import org.testng.annotations.Test;


import com.hrms.lib.General;

public class TC001 {
	@Test
	public void tc001() {
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
