package acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import acti.driver.DriverManager;

public class Taskpage extends DriverManager {
	@FindBy(xpath="//div[text()='Add New']")WebElement buttonaddnew;
	@FindBy(xpath="//div[@class='item createNewCustomer']")WebElement buttonaddnewcustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")WebElement textboxcustomername;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement textareacustomerdescription;
	@FindBy(xpath="//div[@class='components_button withPlusIcon']")WebElement buttoncreatecustomer;
	@FindBy(xpath=" //span[@class='innerHtml']")WebElement textsuccessmessage;
	
	public Taskpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickAddnew() {
		buttonaddnew.click();	
}
	
		public void clicknewcustomer() {
			buttonaddnewcustomer.click();
	}
		public void entercustomername(String customername) {
			textboxcustomername.sendKeys(customername);
		}
		public void entercustomerdescription(String customerdescription) {
			textareacustomerdescription.sendKeys(customerdescription);	
		}
		public void clickcreatecustomer() {
			buttoncreatecustomer.click();
		}
		public String getsuccessmessage() {
			return textsuccessmessage.getText();	
		}
	}
	