package com.chaitrachidananda11.ex02.RA_TestNG_Allure;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting005_TC_TestNGFix {

    @Test
    @Description("Positive test case-TC1")
    public void test_Get_Positive_TC1()
    {
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016").
                when()
                .get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description("Negative test case-TC2")
    public void test_Get_Negative_TC2()
    {
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/-1").
                when()
                .get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description("Negative special char test case-TC3")
    public void test_Get_Negative_TC3()
    {
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/&").
                when()
                .get()
                .then().log().all().statusCode(200);
    }
}
