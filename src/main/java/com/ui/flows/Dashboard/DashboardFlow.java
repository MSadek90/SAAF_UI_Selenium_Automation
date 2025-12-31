package com.ui.flows.Dashboard;
import org.openqa.selenium.WebDriver;
import com.ui.actions.Dashboard.DashboardActions;

public class DashboardFlow {

    private DashboardActions dashboardActions;

    public DashboardFlow(WebDriver driver) {
        this.dashboardActions = new DashboardActions(driver);
    }


    public void navigateToKYCSectionFlow() {
        dashboardActions.NavigateToKYCSection();
    }

}