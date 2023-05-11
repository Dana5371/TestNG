package com.automation.testcases;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(groups = {"SmokeTest", "ChiragTest"})
    @Parameters("browser")
    public void verifyUserCanLogin(String browser) {
        System.out.println("verify login successful");
        System.out.println("Opening browser" + browser  );
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
