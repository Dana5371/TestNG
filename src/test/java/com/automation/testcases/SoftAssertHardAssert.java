package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssert {
    @Test
    public void testHardAssert(){
        Assert.assertEquals(2, 2);
        Assert.assertEquals("Chirag", "Chriag");
        Assert.assertEquals(10, 10);
        Assert.assertEquals("Test", "Test");
        Assert.assertEquals("DevX", "DevX");
        Assert.assertEquals(true, true);
        System.out.println("Hard Assert Test Ends");

    }
    @Test
    public void testSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2, 2);
        softAssert.assertEquals("Chirag", "Chriag");
        softAssert.assertEquals(10, 10);
        softAssert.assertEquals("Test", "Tes");
        softAssert.assertEquals("DeX", "DevX");
        softAssert.assertEquals(true, true);
        softAssert.assertAll();
        System.out.println("Soft Assert Test Ends");
    }

}
