package acti.test;

import org.testng.annotations.Test;

import acti.pages.Enterpages;
import acti.pages.Loginpage;

public class LoginpageTest extends BaseTest {

	

	@Test(priority = 1)
	public void testLoginpageTitle() {
		lp = new Loginpage();
		String expected = lp.validateLoginpagetitle();
		System.out.println(expected);

	}
	@Test(priority = 2)
	public void testForgotPasswordLink() {
		boolean flag = lp.validateforgotpasswordlink();
		System.out.println(flag);

	}
	@Test(priority = 3)
	public void testActiLogoIsDisplayed() {
		boolean flag = lp.validateActimg();
		System.out.println(flag);
	}
	@Test(priority = 4)
	public void testLoginFunction() {
		lp.enterusername("admin");
		lp.enterpassword("manager");
		lp.clicklogin();
		ep = new Enterpages();
		String expected = ep.validateUserLoggedin();
		System.out.println(expected);
		ep.clicklogout();
	}
}