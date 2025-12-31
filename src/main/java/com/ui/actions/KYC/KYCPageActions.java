package com.ui.actions.KYC;



import org.openqa.selenium.WebDriver;

import com.ui.models.pojo.KYC.KycPagePojo;
import com.ui.pages.KYC.ListPages.KYCPagesPage;
import com.ui.pages.KYC.NewPage.KYCAddNewPage;

public class KYCPageActions {

    private KYCAddNewPage kycAddNewPage;
    private KYCPagesPage kycPagesPage;

    public KYCPageActions(KYCAddNewPage Page, WebDriver driver) {
        this.kycAddNewPage = Page;
        this.kycAddNewPage = new KYCAddNewPage(driver);
        this.kycPagesPage = new KYCPagesPage(driver);
    }


    public void AddNewKYCPage(KycPagePojo kycPagePojo) {

        kycPagesPage.
                clickAddNewPageButton();

        kycAddNewPage
                .getPageId(kycPagePojo.getId())
                .selectPageType(kycPagePojo.getType())
                .fillEnglishName(kycPagePojo.getTitle())
                .fillArabicName(kycPagePojo.getTitle())
                .fillEnglishDescription(kycPagePojo.getDescription())
                .fillArabicDescription(kycPagePojo.getDescription());

    }
}
