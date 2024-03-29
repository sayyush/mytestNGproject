package com.myapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

 public class Day18_Assertions {

    @Test
    public void hardAssertion(){
        /*
        Assert.assertTrue()   <== Junit den gelen  Hard assertion
        SoftAssert



        Hard assertion will stop if the assertion fails. This is used A LOT
         */
        System.out.println("Starting the test case");
        Assert.assertTrue(true);//PASS SO CONTINUE
        System.out.println("Line 15 codes");
        Assert.assertEquals(3,5);//FAILS SO STOP AND GET OUT OF THE TEST METHOD
        System.out.println("Line 17 codes");//WILL NOW EXECUTE
    }

    @Test
    public void softAssertions(){
        /*
        Test case will continue to execute EVEN IF A TEST ASSERTION FAILS
        We must use SoftAssert object to do soft assertion.

        assertAll must be used to do actual assertion. it makes the test case as FAILED if assertion fails
         */
        System.out.println("Starting the test case");
        //1. yol softAssert objesi olusturma.
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(true);//PASS SO CONTINUE
        System.out.println("Line 32 codes");
        softAssert.assertEquals(3,4);//FAILS BUT CONTINUE WITHOUT PROBLEM UNTIL END OF THE METHOD
        System.out.println("Line 34 codes");
        softAssert.assertFalse(true);//FAILS BUT CONTINUE WITHOUT PROBLEM UNTIL END OF THE METHOD
        System.out.println("Line 36 codes");
        softAssert.assertAll("TEST CASE COMPLETED");//assertAll MUST BE USED AT THE END TO MARK THE TEST CASE AS FAIL. THIS MUST BE AT THE VERY END.
        System.out.println("Line 38 codes");
    }

    @Test
    public void javaAssertion(){
        /*
       java assert is like Hard Assertion. This is not used a lot. We should use TestNG assertion in a testNG framework
         */
        System.out.println("Starting the test case");
//        if (3 <= 4) throw new AssertionError("MESSAGE");
        assert 5<4;// if the statement is TRUE THEN CONTINUE. if the statement is FALSE THEN THROW java.lang.AssertionError
        assert "apple".contains("a");
        assert "Apple".toLowerCase().equals("apple");
        assert 8==10;
        System.out.println("line 48");
    }

}