package com.hrms.testscripts;
import com.hrms.lib.*;
public class TC001 {
	public static void main(String[] args) throws Exception{
		General ob = new General();
		ob.openApplication();
		 Thread.sleep(5000);
	    ob.login();
	    Thread.sleep(5000);
	    ob.logout();
	    Thread.sleep(5000);	
	 	ob.closeApplication();
	}

}
