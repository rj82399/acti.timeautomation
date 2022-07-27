package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

public class Enterpages extends DriverManager {
	@FindBy(id="logoutLink")WebElement Linklogout;
	@FindBy(xpath = "//a[@class='userProfileLink username ']")WebElement textuserlogged;


	public Enterpages() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clicklogout() {
		Linklogout.click();
	}
	public String validateUserLoggedin() {
		return textuserlogged.getText();
		
	}
}









