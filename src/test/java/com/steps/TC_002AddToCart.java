package com.steps;

import com.global.BaseTest;
import com.pagefactory.AddToCartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_002AddToCart extends BaseTest{
	
	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
		addtocartpage=new AddToCartPage(driver);
		addtocartpage.clickOnAddTOCart();
	}

	@Then("I validate the product price and cart price")
	public void i_validate_the_product_price_and_cart_price() {
		addtocartpage.validatingProductPrice();  
	}

	@Then("I click on the cart button")
	public void i_click_on_the_cart_button() {
		addtocartpage.clickOnCartButton();
	}

	@Then("I Click on the delete button")
	public void i_click_on_the_delete_button() {
		addtocartpage.clickOnDeleteButton();
	}

  }


