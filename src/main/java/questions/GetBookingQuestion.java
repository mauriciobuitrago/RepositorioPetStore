package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class GetBookingQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
       
    }

    public static Question<String> was() {
        return new GetBookingQuestion();
    }
}
