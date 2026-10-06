package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PutBookingQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().getString("additionalneeds");
    }

    public static Question<String> was() {
        return new PutBookingQuestion();
    }

}
