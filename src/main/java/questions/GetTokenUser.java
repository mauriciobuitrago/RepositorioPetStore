package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetTokenUser implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().getString("token");
    }

    public static Question<String> was() {
        return new GetTokenUser();
    }
    
public class GetTokenUser implements Question {
    @Override
   

    public static Question<String> was() {
        return new GetTokenUser();
    }
}
}
