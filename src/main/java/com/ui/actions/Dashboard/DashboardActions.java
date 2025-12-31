package com.ui.actions.Dashboard;

import org.openqa.selenium.WebDriver;

import com.ui.pages.DashBoardPage;

public class DashboardActions {


    private DashBoardPage dashBoardPage;


    public DashboardActions(WebDriver driver) {
        this.dashBoardPage = new DashBoardPage(driver);
    }

    public void NavigateToKYCSection() {
        dashBoardPage.clickKycManagment();
        dashBoardPage.clickKycPagesLink();       
    }


    
    
}
