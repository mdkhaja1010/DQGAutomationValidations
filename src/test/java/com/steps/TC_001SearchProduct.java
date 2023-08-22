package com.steps;

import com.global.BaseTest;
import com.pagefactory.HomePage;
import com.pagefactory.SearchProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_001SearchProduct extends BaseTest {

	@Given("I am on the Amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		homepage = new HomePage(driver);
		utilities.url(url);
	}

	@When("I search for {string}")
	public void i_search_for(String product_name) {
		homepage.searchProductInSearchBar(product_name);

	}

	@When("I click on searchbar icon")
	public void i_click_on_searchbar_icon() {
		homepage.clickOnSearchBar();

	}

	@When("I click on the product")
	public void i_click_on_the_product() {
		searchproductpage = new SearchProductPage(driver);
		searchproductpage.clickOnImage();

	}

	@Then("I validate the Visibility and Invisibility of the product")
	public void i_validate_the_visibility_and_invisibility_of_the_product() {
		searchproductpage.mousehoverOnImage();
		searchproductpage.validatingImageVisibilityAndInvisibility();
	}


}
