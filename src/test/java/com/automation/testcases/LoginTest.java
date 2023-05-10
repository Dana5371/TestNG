package com.automation.testcases;


import org.testng.annotations.Test;

public class LoginTest  extends  BaseTest{

    @Test(groups = {"SmokeTest", "ChiragTest"})
    public void verifyUserCanLogin() {
        System.out.println("verify login successful");
    }

    @Test(groups = "ChiragTest")
    public void verifyUserCanNotWithInvalidCredetionalsLogin() {
        System.out.println("verify login unsuccessful");
    }

    @Test(groups = "SmokeTest")
    public void verifyUserCanResetLogin() {
        System.out.println("verify login can reset successful");
    }

}
