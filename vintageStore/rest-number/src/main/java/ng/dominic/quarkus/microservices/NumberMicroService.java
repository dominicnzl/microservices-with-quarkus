package ng.dominic.quarkus.microservices;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number microservice",
                description = "This microservice generates book numbers",
                version = "0.01",
                contact = @Contact(name = "henk", url = "https://localjoost:8080")),
        externalDocs = @ExternalDocumentation(
                url = "https://github.com/dominicnzl/microservices-with-quarkus",
                description = "All the documentation"),
        tags = { @Tag(name = "API", description = "Public API for all your ISBN needs"),
        @Tag(name = "NUMBERS", description = "For ISBNs")}
)
public class NumberMicroService extends Application {
}
