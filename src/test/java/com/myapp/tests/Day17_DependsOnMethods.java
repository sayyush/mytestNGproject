package com.myapp.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Day17_DependsOnMethods {

    @Test
    public void homePage() {
        assertTrue(true);//Fails on purpose --> If this method fails searchPage() method will be ignored
        System.out.println("Going to homepage...");
    }


    @Test(dependsOnMethods = "homePage")
    public void searchPage() {
        System.out.println("Searching...");
    }

    @Test
    public void checkoutPage() {
        System.out.println("Checking...");
    }

}