//package com.qa.stepdef;
//
//import com.qa.pages.LoginPage;
//import com.qa.pages.ProductsPage;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//
//public class LoginStepDef {
//
//    @When("I enter username as {string}")
//    public void iEnterUsernameAs(String username) throws InterruptedException {
//        new LoginPage().enterUserName(username);
//    }
//
//    @When("I enter password as {string}")
//    public void iEnterPasswordAs(String password) {
//        new LoginPage().enterPassword(password);
//    }
//
//    @When("I login")
//    public void iLogin() {
//        new LoginPage().pressLoginBtn();
//    }
//
//    @Then("login should fail with an error {string}")
//    public void loginShouldFailWithAnError(String err) {
//        Assert.assertEquals(new LoginPage().getErrTxt(), err);
//    }
//
//    @Then("I should see Products page with title {string}")
//    public void iShouldSeeProductsPageWithTitle(String title) {
//        Assert.assertEquals(new ProductsPage().getTitle(), title);
//    }
//}

package com.qa.stepdef;


import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    TestUtils utils = new TestUtils();
    LoginPage loginpage = new LoginPage();
    @When("click on Allow")
    public void click_on_allow() {

        loginpage.clickAllowBtn();
    }
    @When("enter username as {string}")
    public void EnterUsernameAs(String username) throws InterruptedException {
        loginpage.enterUserName(username);
        utils.log().info("user name entered");

    }

    @When("enter password as {string}")
    public void EnterPasswordAs(String password) {
        loginpage.enterPassword(password);
        utils.log().info("User Password Entered");
    }

    @When("Click On login")
    public void Login() {
        loginpage.pressLoginBtn();
        utils.log().info("clicked on login");
    }

    @Then("login should fail with an error message {string}")
    public void loginShouldFailWithAnError(String err) {
        System.out.println(loginpage.getErrTxt());
        Assert.assertEquals(loginpage.getErrTxt(), err);
        utils.log().info("");

    }


    @Then("user should click on close button of update popup")
    public void user_should_click_on_close_button_of_update_popup() {
        loginpage.clickOnUpdateClose();
    }



    @Then("user should be loggedIn with profile name {string}")
    public void user_should_be_logged_in_with_profile_name(String profileName) {
        loginpage.CheckProfileName(profileName);
    }

    @Then("user should be able to logout")
    public void user_should_be_able_to_logout() {
        System.out.println("user successfully logged out");

    }

}
