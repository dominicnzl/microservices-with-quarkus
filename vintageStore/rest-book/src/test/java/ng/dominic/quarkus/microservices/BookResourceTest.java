package ng.dominic.quarkus.microservices;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
class BookResourceTest {

    @Test
    void shouldCreateBook() {
        given()
                .formParam("title", "dingen")
                .formParam("author", "henk")
                .formParam("year", 2021)
                .formParam("genre", "sci-fi")
                .when().post("/api/books")
                .then()
                .statusCode(201)
                .body("isbn_13", startsWith("13-"))
                .body("title", is("dingen"))
                .body("author", is("henk"))
                .body("year_of_publication", is(2021))
                .body("genre", is("sci-fi"))
                .body("creation_date", startsWith("20"));
    }
}