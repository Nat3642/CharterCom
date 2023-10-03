package com.test.pages;

import com.test.ulility.BrowserUtil;
import com.test.ulility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    @FindBy(xpath = "//div[@aria-label='Home']")
    public WebElement Home;


    public static void clickMenuByName(String menuName){
        WebElement element = Driver.getDriver()
                .findElement(By.xpath("//span[normalize-space()='" + menuName + "']"));
        BrowserUtil.waitForVisibility(element,15);
        element.click();
    }

}
