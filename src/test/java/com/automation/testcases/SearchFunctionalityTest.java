package com.automation.testcases;


import org.testng.annotations.Test;

public class SearchFunctionalityTest extends BaseTest{
    @Test
    public void verifySearchResultsAreDisplayed() {
        System.out.println("verify search result");
    }

    @Test
    public void verifyMessageWhenTheraAreNoResult() {
        System.out.println("verify no result message");
    }

    @Test
    public void verifySearchResultHasSearchKeyWord() {
        System.out.println("verify search result has search keyword");
    }
}
