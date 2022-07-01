package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC002_Add_New_emp {
	public static void main(String args[]) {
		General object = new General();
		object.openApplication();
		object.login();
		object.enterFrame();
		object.addNewEmp();
		object.exitFrame();
		object.logout();
		object.closeApplication();
		}

}
