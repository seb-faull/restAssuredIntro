package com.spartaglobal.restAssuredIntro.getRequest;

import com.spartaglobal.restAssuredIntro.BaseClass;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class GetData extends BaseClass {

    @Test
    public void testResponseCode() {
        Response resp = get(BASE_ENDPOINT);
        int code = resp.getStatusCode();

        Assert.assertEquals(code, 200);
    }

    @Test
    public void testBody() {
        Response resp = get(BASE_ENDPOINT);
        String data = resp.asString();

        System.out.println("Data is " + data);
    }

}
