package com.chaitrachidananda11.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args) {

        // Full URL - https://api.zippopotam.us/IN/560016
        // base URI - https://api.zippopotam.us

        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016").
                when()
                .get()
                .then().log().all().statusCode(200);
    }
}
