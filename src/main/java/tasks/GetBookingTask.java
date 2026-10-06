package tasks;

import interactions.Get;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import utils.Constanst;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetBookingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/booking" + "/" + PostCreateBookingTask.BookingId())
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .auth()
                                .oauth2(Constanst.Token))
        );
    }

    public static GetBookingTask getBookingTask() {
        return instrumented(GetBookingTask.class);
    }
}
