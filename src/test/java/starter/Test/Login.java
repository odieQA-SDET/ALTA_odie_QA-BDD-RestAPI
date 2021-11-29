package starter.Test;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Login {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReqEmpty() {
        requestParams = new JSONObject();
        requestParams.put("userName", "");
        requestParams.put("password", "");
    }

    @Step
    public void setBodyReqEmptyPass() {
        requestParams = new JSONObject();
        requestParams.put("userName", "odieQA" + endpoint.Username + endpoint.Pass);
        requestParams.put("password", "");
    }

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("userName", "odieQA" + endpoint.Username + endpoint.Pass);
        requestParams.put("password", "P@5sword" + endpoint.Username + endpoint.Pass);
    }

    @Step
    public void hitEndPointLoginEmpty() {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.LOGIN)
                .then()
                    .statusCode(400);
    }

    @Step
    public void hitEndPointLoginEmptyPass() {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.LOGIN)
                .then()
                    .statusCode(400);
    }

    @Step
    public void hitEndpointLogin() {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.LOGIN)
                .then()
                    .statusCode(201);
    }

    @Step
    public void valDateEndpointLoginEmpty() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/loginEmpty.json"));
    }

    @Step
    public void valDateEndpointLoginEmptyPass() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/loginEmpty.json"));
    }

    @Step
    public void valDateEndpointLogin() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/login.json"));
    }
}