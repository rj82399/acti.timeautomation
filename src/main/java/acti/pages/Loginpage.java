package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import acti.driver.DriverManager;

/* to keep track with the project frame work
 * Name: Login page
 * developed by:Shantosh
 * approved by:Shantosh
 * last modified date:7/26/22
 * description:
 * 
 */
//***************************************page element******************************************************//
public class Loginpage extends DriverManager {
	@FindBy(id="username") WebElement textboxusername;
	@FindBy(name="pwd") WebElement textboxpassword;
	@FindBy(xpath = " //div[normalize-space()='Login']")WebElement buttonlogin;
	@FindBy(linkText ="Forgot your password?")WebElement linkForgotpassword;
	@FindBy(xpath = "//div[@class='atLogoImg']")WebElement imgactilogo;
	
	//************************************ page Initialization***********************************************//
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	//************************************ page actions***********************************************//
	
	public void enterusername(String username) {
		textboxusername.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		textboxpassword.sendKeys(password);
	}
	public void clicklogin() {
		buttonlogin.click();
	}
	
	public boolean validateforgotpasswordlink() {
		return linkForgotpassword.isDisplayed();
	}
	public String validateLoginpagetitle() {
		return driver.getTitle();
	}
	public boolean validateActimg() {
		return imgactilogo.isDisplayed();
		
	}
}
