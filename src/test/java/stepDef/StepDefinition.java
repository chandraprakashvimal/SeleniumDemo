package stepDef;

import io.cucumber.java.en.*;
import pages.PlaceOrder;

public class StepDefinition {

    private PlaceOrder po = new PlaceOrder();

    @Given("open the url and click on login link")
    public void open_the_url_and_click_on_login_link() {
        po.setUp();
        po.clickLogin();
    }

    @When("login to the application with valid username {string} and password {string}")
    public void login_to_the_application_with_valid_username_and_password(String string, String string2) {
        po.loginToApp(string, string2);
    }

    @When("select Samsung galaxy S6")
    public void select_samsung_galaxy_s6() {
        po.selectSGalaxy();
    }

    @When("add the phone to the cart")
    public void add_the_phone_to_the_cart() {
        po.addPhoneToCart();
    }

    @Then("go to cart and place order")
    public void goToCart_and_place_order() {
        po.goToCartAndPlaceOrder();
    }

    @Then("enter details and purchase")
    public void enter_details_and_purchase() {
        po.enterDetails();
        po.clickOnPurchase();
    }

    @Then("print the purchase id")
    public void print_the_purchase_id() {
        po.printPurchaseId();

    }
}
