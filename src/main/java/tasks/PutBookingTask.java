package tasks;

import interactions.Put;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import utils.Constanst;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutBookingTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to("/booking/" + PostCreateBookingTask.BookingId())
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .accept(ContentType.JSON)
                                .cookie(Constanst.Token)
                                .auth()
                                .oauth2(Constanst.Token)
                                .body("{\n" +
                                        "    \"firstname\" : \"Park Son\",\n" +
                                        "    \"lastname\" : \"Jeon Can\",\n" +
                                        "    \"totalprice\" : 200,\n" +
                                        "    \"depositpaid\" : true,\n" +
                                        "    
                                        "        \"checkin\" : \"2019-01-01\",\n" +
                                        "        \"checkout\" : \"2020-01-01\"\n" +
                                        "    },\n" +
                                        "    \"additionalneeds\" : \"lunch\"\n" +
                                        "}"))

        );
    }

        @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to("/booking/" + PostCreateBookingTask.BookingId())
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .accept(ContentType.JSON)
                                .cookie(Constanst.Token)
                                .auth()
                                .oauth2(Constanst.Token)
                                .body("{\n" +
                                        "    \"firstname\" : \"Park Son\",\n" +
                                        "    \"lastname\" : \"Jeon Can\",\n" +
                                        "    \"totalprice\" : 200,\n" +
                                        "    \"depositpaid\" : true,\n" +
                                        "    \"bookingdates\" : {\n" +
                                        "        \"checkin\" : \"2019-01-01\",\n" +
                                        "        \"checkout\" : \"2020-01-01\"\n" +
                                        "    },\n" +
                                        "    \"additionalneeds\" : \"lunch\"\n" +
                                        "}"))

        );
    }
    public static PutBookingTask putBookingTask() {
        return instrumented(PutBookingTask.class);
    }

}
