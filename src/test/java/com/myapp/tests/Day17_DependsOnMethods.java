package com.myapp.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Day17_DependsOnMethods {

    /*
    TestNg de tum methodlar birbirlerinden bagimsiz olarak calisirlar,
    Eger methodlari bagimli hale getirmek istersem, dependsOnMethods parametresi kullanilir.

    dependsOnMethods   (2 method icin gecerlidir) bu method cok yaygin degil.
    ==> Bu yontem, bir methodun diger bir methoda bagli olmasini saglamak icin kullanilir.
        Mesela : homePage method'u searchPage methoduna bagildir. O basarili olursa searchPage'de calisacaktir,
        o fail olursa searchPage IGNORE edilir calismayacak.

        Mumkun oldugunca methodlari bir birine bagli etmemek gerekir, cunku bir gun requirement degisir falan filan sorun cikarir.

     */
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