package starter.Test;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class token {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReqTokenEmpty() {
        requestParams = new JSONObject();
        requestParams.put("userName", "");
        requestParams.put("password", "");

    }

    @Step
    public void setBodyReqTokenEmptyPass() {
        requestParams = new JSONObject();
        requestParams.put("userName", "odieQA"+endpoint.Username+endpoint.Pass);
        requestParams.put("password", "");

    }

    @Step
    public void setBodyReqToken() {
        requestParams = new JSONObject();
        requestParams.put("userName", "odieQA"+endpoint.Username+endpoint.Pass);
        requestParams.put("password", "P@5sword"+endpoint.Username+endpoint.Pass);

    }


    @Step
    public void hitEndpointTokenEmpty() {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.TOKEN)
                .then()
                    .statusCode(400);
    }


    @Step
    public void hitEndpointTokenEmptyPass() {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.TOKEN)
                .then()
                    .statusCode(400);
    }


    @Step
    public void hitEndpointToken() {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.TOKEN)
                .then()
                    .statusCode(200);
    }


    @Step
    public void valDateEndpointToken() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/token.json"));
    }
}
