package tasks;

import interactions.Post;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PostCreateUserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("/auth")
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body("{\n" +
                                        "    \"username\" : \"admin\",\n" +
                                        "    \"password\" : \"password123\"\n" +
                                        "}"))
        );
    }

    public static String Token2() {
        return  SerenityRest.lastResponse().jsonPath().getString("token");
    }

    public static PostCreateUserTask postCreateUserTask() {
        return instrumented(PostCreateUserTask.class);
    }

}
