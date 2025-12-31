package com.ui.utils.DataLoader;
import com.ui.models.pojo.KYC.KycPagePojo;
import com.ui.models.pojo.KYC.WrapperClasses.kycQuestionsNestedPojo;
import com.ui.utils.TestDataLoader;

public class KycLoadData {


    public static KycPagePojo getKYCPageData() {
       // D:\New architecture\Selenium_Framework\SAAF_UI_Selenium_Automation\src\test\resources\testdata\KYC\pages\KYCPage.json

        return  TestDataLoader.loadSingleTestData("KYC/pages/KYCPage.json", KycPagePojo.class);
    }

    //D:\New architecture\Selenium_Framework\SAAF_UI_Selenium_Automation\src\test\resources\testdata\KYC\questions\KYCQuestion.json

    public static kycQuestionsNestedPojo getKYCQuestionData() {

        return TestDataLoader.loadSingleTestData("KYC/questions/KYCQuestion.json", kycQuestionsNestedPojo.class);
    }
}