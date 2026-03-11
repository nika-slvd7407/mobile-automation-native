package com.solvd.tests;

import com.solvd.carinanative.page.common.BasePage;
import com.solvd.carinanative.page.common.LoginPage;
import com.solvd.carinanative.page.common.ProductsPage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

    @Test(description = "Test for correct login functionality")
    public void testLogin() {
        BasePage basePage = basePage = initPage(getDriver(), BasePage.class);
        LoginPage loginPage = basePage.openApp();
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(productsPage.isPageOpened(), "Products page is not opened after login");
    }

}
