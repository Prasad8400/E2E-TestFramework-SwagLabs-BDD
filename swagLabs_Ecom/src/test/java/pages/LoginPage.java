package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{


	public LoginPage(WebDriver driver) {		
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name") WebElement userName;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "login-button") WebElement loginButton;
	@FindBy(css = "h3") WebElement errMsg;

	public String getHeaderTitle() {
		return driver.getTitle();
	}

	public void enter_UserName(String uname) {
		userName.clear();
		userName.sendKeys(uname);
	}

	public void enter_Password(String pass) {
		password.clear();
		password.sendKeys(pass);
	}

	public void clickOn_LoginBttn() {
		loginButton.click();
	}
	public String getInvalidCredsMsg() {
		return errMsg.getText();
	}

	public void loginSwagLab(String uname, String pass) {

		enter_UserName(uname);
		enter_Password(pass);
		clickOn_LoginBttn();
	}

}
