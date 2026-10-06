package questions;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PostCreateBookingQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getBody();
    }

    public static Question<ResponseBody> was() {
        return new PostCreateBookingQuestion();
    }

}
