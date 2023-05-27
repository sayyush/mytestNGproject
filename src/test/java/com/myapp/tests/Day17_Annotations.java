package com.myapp.tests;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertTrue;

public class Day17_Annotations {
    /*
    @Test: @Test annotation creates test cases. It marks methods as test case. We have 6 test methods in this class.
    @Before and @After: These two are JUnit annotations but we have 5 @Before and @After annotation types in Test NG.
    @BeforeSuite: Runs before suite just once
    @AfterSuite: Runs after suite just once
    @BeforeClass: Runs before each class just once
    @AfterClass: Runs after each class just once
    @BeforeTest: Runs before each test class just once
    @AfterTest: Runs after each test class just once
    @BeforeGroups: Runs before declared groups
    @AfterGroups: Runs after declared groups
    @BeforeMethod: Runs before each @Test methods
    @AfterMethod: Runs after each @Test methods

    Hierarchy--> @BeforeSuite, @BeforeTest, @BeforeClass, @BeforeGroups, @BeforeMethod

    @Test(priority = 1) --> Test NG runs test methods in alphabetical order. We will use priority keyword to prioritize the test cases.
    By default, all test cases' priority is 0. Test NG runs less priority number first.

    @Ignore: Ignores/Skips test cases

    @Test( enabled = false) --> Disable the test case. It is not going to be unable.

    class name method names they cannot start with NUMBERS.

     */


    @BeforeSuite
    public void beforeSuit() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("@AfterSuite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @BeforeGroups(groups = "Regression")
    public void beforeGroups() {
        System.out.println("@BeforeGroups");
    }

    @AfterGroups(groups = "Regression")
    public void afterGroups() {
        System.out.println("@AfterGroups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }



    @Test(priority = 5, enabled = true)
    public void test1() {

        System.out.println("Test 1");

    }

    @Ignore
    @Test(priority = -1)
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(groups = "Regression")
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 1)
    public void test4() {
        System.out.println("Test 4");
    }

    @Test(groups = "Regression")
    public void test5() {
        System.out.println("Test 5");

    }

    @Test//(priority = 0) --> Default
    public void test6() {
        System.out.println("Test 6");
    }


}