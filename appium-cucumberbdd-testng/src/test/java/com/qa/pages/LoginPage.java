//package com.qa.pages;
//
//import com.qa.utils.TestUtils;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
//import org.openqa.selenium.WebElement;
//
//public class LoginPage extends BasePage {
//	TestUtils utils = new TestUtils();
//
//	@AndroidFindBy (accessibility = "test-Username")
//	@iOSXCUITFindBy (id = "test-Username")
//	private WebElement usernameTxtFld;
//
//	@AndroidFindBy (accessibility = "test-Password")
//	@iOSXCUITFindBy (id = "test-Password")
//	private WebElement passwordTxtFld;
//
//	@AndroidFindBy (accessibility = "test-LOGIN")
//	@iOSXCUITFindBy (id = "test-LOGIN")
//	private WebElement loginBtn;
//
//	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
//	@iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
//	private WebElement errTxt;
//
//	public LoginPage(){
//	}
//
//public LoginPage enterUserName(String username) throws InterruptedException {
//	clear(usernameTxtFld);
//	sendKeys(usernameTxtFld, username, "login with " + username);
//	return this;
//}
//
//public LoginPage enterPassword(String password) {
//	clear(passwordTxtFld);
//	sendKeys(passwordTxtFld, password, "password is " + password);
//	return this;
//}
//
//public ProductsPage pressLoginBtn()  {
//	click(loginBtn, "press login button");
//	return new ProductsPage();
//}
//
//public ProductsPage login(String username, String password) throws InterruptedException {
//	enterUserName(username);
//	enterPassword(password);
//	return pressLoginBtn();
//}
//
//public String getErrTxt() {
//	String err = getText(errTxt, "error text is - ");
//	return err;
//}
//
//}

package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	TestUtils utils = new TestUtils();


	@AndroidFindBy (accessibility = "test-ALLOW")
	@iOSXCUITFindBy (id = "test-ALLOW")
	private WebElement allowBtn2;


	@AndroidFindBy (accessibility = "test-LOGIN")
	@iOSXCUITFindBy (id = "test-LOGIN")
	private WebElement loginBtn;

	@AndroidFindBy (xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")
	private WebElement allowBtn;


	@AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Username\"]/../android.widget.EditText")
	private WebElement usernameTxtFld;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Password\"]/../android.view.ViewGroup/android.widget.EditText")
	private WebElement passwordTxtFld;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text=\" Submit\"]")
	private WebElement submitBtn;


	@AndroidFindBy (xpath = "//android.widget.TextView[@text=' Invalid Username or Password']")
	private WebElement errTxt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Insignia Pvet3']")
	private WebElement profileName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Close\"]")
	private WebElement UpdatePopUpCloseButton;

	public LoginPage(){
	}

	public LoginPage clickAllowBtn(){
		click(allowBtn, "click allow button");
		utils.log().info("Allow button clicked");
		return new LoginPage();
	}

	public LoginPage enterUserName(String username) throws InterruptedException {
		clear(usernameTxtFld);
		sendKeys(usernameTxtFld, username, "login with " + username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		clear(passwordTxtFld);
		sendKeys(passwordTxtFld, password, "password is " + password);
		return this;
	}


	public ProductsPage pressLoginBtn() {
		click(submitBtn, "press login button");
		return new ProductsPage();
	}

	public ProductsPage login(String username, String password) throws InterruptedException {
		enterUserName(username);
		enterPassword(password);
		return pressLoginBtn();
	}

	public String getErrTxt() {
		return getText(errTxt, "error text is - ");
	}

	public void CheckProfileName(String userProfileName){
		String ProfileName=  profileName.getText();
		if (userProfileName.equalsIgnoreCase(ProfileName)){
			System.out.println("user logged in successfully");
		}
		else {
			System.out.println("user logged in Failed");
		}
	}

	public void clickOnUpdateClose(){
		UpdatePopUpCloseButton.click();
	}

}

