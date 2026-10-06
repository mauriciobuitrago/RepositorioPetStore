package utils;

import net.serenitybdd.rest.SerenityRest;
import questions.GetTokenUser;
import tasks.PostCreateUserTask;

public class Constanst {

    public static final String Token = PostCreateUserTask.Token2();

    public static final String SchemaJson = "{\n" +
                                            "  \"type\": \"object\",\n" +
                                            "  \"properties\": {\n" +
                                            "    \"bookingid\": {\n" +
                                            "      \"type\": \"integer\"\n" +
                                            "    },\n" +
                                            "    \"booking\": {\n" +
                                            "      \"type\": \"object\",\n" +
                                            "      \"properties\": {\n" +
                                            "        \"firstname\": {\n" +
                                            "          \"type\": \"string\"\n" +
                                            "        },\n" +
                                            "        \"lastname\": {\n" +
                                            "          \"type\": \"string\"\n" +
                                            "        },\n" +
                                            "        \"totalprice\": {\n" +
                                            "          \"type\": \"integer\"\n" +
                                            "        },\n" +
                                            "        \"depositpaid\": {\n" +
                                            "          \"type\": \"boolean\"\n" +
                                            "        },\n" +
                                            "        \"bookingdates\": {\n" +
                                            "          \"type\": \"object\",\n" +
                                            "          \"properties\": {\n" +
                                            "            \"checkin\": {\n" +
                                            "              \"type\": \"string\"\n" +
                                            "            },\n" +
                                            "            \"checkout\": {\n" +
                                            "              \"type\": \"string\"\n" +
                                            "            }\n" +
                                            "          },\n" +
                                            "          \"required\": [\n" +
                                            "            \"checkin\",\n" +
                                            "            \"checkout\"\n" +
                                            "          ]\n" +
                                            "        },\n" +
                                            "        \"additionalneeds\": {\n" +
                                            "          \"type\": \"string\"\n" +
                                            "        }\n" +
                                            "      },\n" +
                                            "      \"required\": [\n" +
                                            "        \"firstname\",\n" +
                                            "        \"lastname\",\n" +
                                            "        \"totalprice\",\n" +
                                            "        \"depositpaid\",\n" +
                                            "        \"bookingdates\",\n" +
                                            "        \"additionalneeds\"\n" +
                                            "      ]\n" +
                                            "    }\n" +
                                            "  },\n" +
                                            "  \"required\": [\n" +
                                            "    \"bookingid\",\n" +
                                            "    \"booking\"\n" +
                                            "  ]\n" +
                                            "}";

}
