package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
    LoginFeatures loginFeatures = new LoginFeatures();

    @Test(dataProvider = "InvalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials(String username, String password){
        boolean result = loginFeatures.doLogin(username, password);
        Assert.assertEquals(result, false);
    }
    @DataProvider(name = "InvalidData")
    public Object[][] getInvalidData(){
        String[][] credentials = {
            {"admin", "admin123"},
                {"admin", "admin123"},
                {"admin123", "admin123"},
                {"Chirag", "admin123"},
                {"admin", "@123"},
                {"devx", "devx@123"},
                {"", ""},
                {"", "admin123"}
        };return credentials;
    }

    @Test
    public void verifyLoginSuccessfulWithValidCredentials(){

    }
}
