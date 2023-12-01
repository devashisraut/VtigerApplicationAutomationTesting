package VtigerObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPager {
	
	@FindBy(name = "user_name")
	private WebElement userNameTextField;
	
	@FindBy(name = "user_password")
	private WebElement PasswordTextField;
	
	@FindBy(id = "submitButton")
	private WebElement submitButton;

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	public LoginPager(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void loginToVtiger(String userName,String Password) {
		userNameTextField.sendKeys(userName);
		PasswordTextField.sendKeys(Password);
		submitButton.click();
	}
	
}
