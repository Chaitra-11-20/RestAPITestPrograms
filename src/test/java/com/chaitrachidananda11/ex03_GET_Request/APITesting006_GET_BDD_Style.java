package com.chaitrachidananda11.ex03_GET_Request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting006_GET_BDD_Style {
    @Test
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
    public void test_Get_Positive_TC2()
    {
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/%").
                when()
                .get()
                .then().log().all().statusCode(200);
    }
}
