package com.solvd.tests;

import com.solvd.carinanative.page.common.CartPage;
import com.solvd.carinanative.page.common.CheckoutPage;
import com.solvd.carinanative.page.common.NotificationPage;
import com.solvd.carinanative.page.common.ProductsPage;
import com.solvd.domain.User;
import com.solvd.testUtil.UserService;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    private static final int INDEX = 0;

    @DataProvider(name = "checkoutData")
    public Object[][] checkoutData() {
        return new Object[][]{
                {UserService.getUser(), true},
                {UserService.getIncorrectUser(), false}
        };
    }

    @Test(description = "add item to cart and verify that its present there")
    public void verifyAddingItemToCart() {
        ProductsPage productsPage = login();
        productsPage.addProductByIndex(INDEX);

        String expected = productsPage.getItemTitleByIndex(INDEX);

        CartPage cartPage = productsPage.pressCartButton();
        String actual = cartPage.getCartItemByIndex(0);

        Assert.assertEquals(actual, expected,
                "wrong item in cart. expected: " + expected + " actual: " + actual);
    }

    @Test(dataProvider = "checkoutData",
            description = "place order with different user data")
    public void verifyCheckout(User user, boolean shouldSucceed) {

        ProductsPage productsPage = login();
        productsPage.addProductByIndex(INDEX);

        CartPage cartPage = productsPage.pressCartButton();
        CheckoutPage checkoutPage = cartPage.pressCheckoutButton();

        checkoutPage.fillForm(user);

        if (shouldSucceed) {
            NotificationPage notificationPage =
                    checkoutPage.pressContinue().pressFinishButton();

            Assert.assertTrue(notificationPage.isPageOpened(),
                    "page not opened");
        } else {
            checkoutPage.pressContinue();
            Assert.assertTrue(checkoutPage.isErrorMessagePresent(),
                    "error message not present");
        }
    }
}