package acti.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import acti.driver.DriverManager;
import acti.pages.Enterpages;
import acti.pages.Loginpage;
import acti.pages.Taskpage;

public class BaseTest extends DriverManager {
	Loginpage lp;
	Enterpages ep;
	Taskpage tp;
	@BeforeTest
	public void setup() {
		init_driver();
		lp = new Loginpage();
		ep = new Enterpages();
	     tp = new Taskpage();
		
	}

	@AfterTest
	public void tearDown() {
		quit_browser();
	}

}
