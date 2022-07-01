package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC001_Login_logout {
	public static void main(String args[]) {
		General object = new General();
		object.openApplication();
	object.login();
	object.logout();
	object.closeApplication();
		
	}

}
