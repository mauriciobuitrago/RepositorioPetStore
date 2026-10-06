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
    
    
        );
    }

    public static GetBookingTask getBookingTask() {
        return instrumented(GetBookingTask.class);
    }
}
