package ng.dominic.quarkus.microservices;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "number-proxy")
@Path("/api/numbers")
public interface NumberProxy {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Generates book numbers",
            description = "ISBN 13 and ISBN 10 numbers")
    IsbnThirteen generateIsbnNumbers();
}
