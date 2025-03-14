package com.chaitrachidananda11.ex03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Get_NonBDD_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    @Description("Positive test case")
    public void test_NonBDD_GET() {
            String pincode = "560048";

            r = RestAssured.given();
            r.baseUri("https://api.zippopotam.us");
            r.basePath("/IN/" + pincode);

            response = r.when().log().all().get();


            vr = response.then().log().all().statusCode(200);

        }

    @Test
    @Description("Negative test case")
    public void test_NonBDD_GET2() {
        String pincode = "*";

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();


        vr = response.then().log().all().statusCode(404);

    }

    @Test
    @Description("Negative test case")
    public void test_NonBDD_GET3() {
        String pincode = "*";

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();


        vr = response.then().log().all().statusCode(200);

    }
    }







