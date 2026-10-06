package stepsdefinitions;

import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matcher;
import questions.PostCreateBookingQuestion;
import questions.PostCreateUserQuestion;
import tasks.GetBookingTask;
import tasks.PostCreateBookingTask;
import tasks.PostCreateUserTask;
import tasks.PutBookingTask;
import utils.Constanst;

import static com.github.fge.jsonschema.SchemaVersion.DRAFTV3;
import static com.github.fge.jsonschema.SchemaVersion.DRAFTV4;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.module.jsv.JsonSchemaValidatorSettings.settings;
import static org.hamcrest.Matchers.equalTo;

public class RestfulBookerStepDefinition {

    private static final String restApiUrl = "https://restful-booker.herokuapp.com";
    Actor park =Actor.named("Park");

    //Create user
    @Given("Park need connect to website")
    public void parkNeedConnectToWebsite() {
        park.whoCan(CallAnApi.at(restApiUrl));
    }

    @When("enter to info new user")
    public void enterToInfoNewUser() {
        park.attemptsTo(PostCreateUserTask.postCreateUserTask());
    }

    @Then("validation status OK")
    public void validationStatusOK() {
        park.should(GivenWhenThen.seeThat("Compare statuscode", PostCreateUserQuestion.was(), equalTo(200)));
        System.out.println("Token " + PostCreateUserTask.Token2() + "   Token guardado " + Constanst.Token) ;
    }



    
    @Then("validation status OK")
    public void validationStatusOK() {
        park.should(GivenWhenThen.seeThat("Compare statuscode", PostCreateUserQuestion.was(), equalTo(200)));
        System.out.println("Token " + PostCreateUserTask.Token2() + "   Token guardado " + Constanst.Token) ;
    }
    
    @Then("validation status OK")
    public void validationStatusOK() {
        park.should(GivenWhenThen.seeThat("Compare statuscode", PostCreateUserQuestion.was(), equalTo(200)));
        System.out.println("Token " + PostCreateUserTask.Token2() + "   Token guardado " + Constanst.Token) ;
    }
    
    @Then("validation status OK")
    public void validationStatusOK() {
        park.should(GivenWhenThen.seeThat("Compare statuscode", PostCreateUserQuestion.was(), equalTo(200)));
        System.out.println("Token " + PostCreateUserTask.Token2() + "   Token guardado " + Constanst.Token) ;
    }
    
    @Then("validation status OK")
    public void validationStatusOK() {
        park.should(GivenWhenThen.seeThat("Compare statuscode", PostCreateUserQuestion.was(), equalTo(200)));
        System.out.println("Token " + PostCreateUserTask.Token2() + "   Token guardado " + Constanst.Token) ;
    }
    //Create Booking
    @When("Create booking")
    public void createBooking() {
        park.attemptsTo(PostCreateBookingTask.postCreateBookingTask());
    }

    @Then("Validation schema response")
    public void validationSchemaResponse() {
        JsonSchemaValidator.settings = settings().with().jsonSchemaFactory(
                        JsonSchemaFactory.newBuilder().setValidationConfiguration(ValidationConfiguration.newBuilder().setDefaultVersion(DRAFTV3).freeze()).freeze()).
                and().with().checkedValidation(false);

        //JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder().setValidationConfiguration(ValidationConfiguration.newBuilder().setDefaultVersion(DRAFTV4).freeze()).freeze();

      //  park.should(GivenWhenThen.seeThat("Compare schema", PostCreateBookingQuestion.was(), equalTo(matchesJsonSchemaInClasspath("utils/SchemaPostCreateBooking.json"))));
        System.out.println("BookingID " + PostCreateBookingTask.BookingId());
        System.out.println("Schema 0  " + PostCreateBookingTask.Schema().asString());
    }


    //Get Booking
    @When("Get Booking")
    public void getBooking() {
    
    }

  


  

    @Then("Validation in additionalneeds {string}")
    public void validationInAdditionalneeds(String update) {
       //park.should(GivenWhenThen.seeThat("Compare update ", PutBookingQuestion.was(), equalTo(update)));
    }



}
