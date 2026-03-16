package com.solvd.carinanative.component.android;

import com.solvd.carinanative.component.common.NavigationSidebarComponent;
import com.solvd.util.MobileContextUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NavigationSidebarComponent.class)
public class NavigationSidebarComponentAndroid extends NavigationSidebarComponent {

    public NavigationSidebarComponentAndroid(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public NavigationSidebarComponentAndroid(WebDriver driver) {
        super(driver);
    }

    public void clickMenuOption(MenuOption option) {
        String value = getMenuValue(option);
        By locator = By.xpath(String.format(".//*[@content-desc=\"%s\"]", value));
        WebElement element = getDriver().findElement(locator);
        element.click();
    }

    private String getMenuValue(MenuOption option) {
        switch (option) {
            case GEO_LOCATION:
                return "test-GEO LOCATION";
            case WEBVIEW:
                return "test-WEBVIEW";
            case ABOUT:
                return "test-ABOUT";
            case LOGOUT:
                return "test-LOGOUT";
            case RESET_APP:
                return "test-RESET APP STATE";
            default:
                throw new IllegalArgumentException("Unsupported menu option: " + option);
        }
    }
}
