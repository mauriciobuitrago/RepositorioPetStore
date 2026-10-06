package tasks;

import interactions.Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import utils.Constanst;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PostCreateBookingTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("/booking")
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .auth()
                                .oauth2(Constanst.Token)
                                .body("{\n" +
                                        "    \"firstname\" : \"Park\",\n" +
                                        "    \"lastname\" : \"Jeon\",\n" +
                                        "    \"totalprice\" : 200,\n" +
                                        "    \"depositpaid\" : true,\n" +
                                        "    \"bookingdates\" : {\n" +
                                        "        \"checkin\" : \"2019-01-01\",\n" +
                                        "        \"checkout\" : \"2020-01-01\"\n" +
                                        "    },\n" +
                                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                                        "}"))
        );
    }

    public static String BookingId() {
        return SerenityRest.lastResponse().jsonPath().getString("bookingid");
    }

    public static ResponseBody<Response> Schema() {
        return SerenityRest.lastResponse().getBody();
    }

    public static PostCreateBookingTask postCreateBookingTask() {
        return instrumented(PostCreateBookingTask.class);
    }
}
