package com.ui.pages.KYC.ListPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.base.BasePage;
import com.ui.utils.ClickAction;

public class KYCPagesPage extends BasePage {



    public KYCPagesPage(WebDriver driver) {
        super(driver);
    }



     // KYC Pages List Locators
    private By addNewPageButton = By.xpath("//a[@href='/dashboard/create-kyc-pages']");



    public KYCPagesPage clickAddNewPageButton() {
        ClickAction.click(driver,addNewPageButton);
        return this;
    }
}
