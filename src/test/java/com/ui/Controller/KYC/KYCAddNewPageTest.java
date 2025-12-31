package com.ui.Controller.KYC;


import org.testng.annotations.Test;


import com.ui.actions.KYC.KYCPageActions;
import com.ui.actions.KYC.KYCQuestionActions;
import com.ui.base.BaseTest;
import com.ui.flows.Dashboard.DashboardFlow;
import com.ui.flows.KYC.KycAddNewPageFlow;

import com.ui.pages.KYC.NewPage.KYCAddNewPage;
import com.ui.utils.DataLoader.KycLoadData;

public class KYCAddNewPageTest extends BaseTest {


           
    
    
    
           @Test
           public void addNewKYCPageTest() throws InterruptedException {

            // Initialize page and action classes
           KYCAddNewPage kycAddNewPage = new KYCAddNewPage(driver);
           // Initialize action classes
           KYCPageActions kycPageActions = new KYCPageActions(kycAddNewPage, driver);
           KYCQuestionActions kycQuestionActions = new KYCQuestionActions(kycAddNewPage);
           // Initialize flow classes
           DashboardFlow dashboardFlow = new DashboardFlow(driver);
           KycAddNewPageFlow kycAddNewPageFlow = new KycAddNewPageFlow(kycPageActions, kycQuestionActions);



           dashboardFlow.navigateToKYCSectionFlow();
           kycAddNewPageFlow.addNewKYCPageFlow(KycLoadData.getKYCPageData(), KycLoadData.getKYCQuestionData());

        }

}
