package com.ui.utils.DataLoader;

import com.ui.models.pojo.Login.LoginPojo;
import com.ui.utils.TestDataLoader;

public class LoginLoadData {

    public static LoginPojo getLoginData() {
        return TestDataLoader.loadSingleTestData("/login_testcases.json", LoginPojo.class);
    }
}
