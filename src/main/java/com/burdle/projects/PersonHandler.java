package com.burdle.projects;

import static org.springframework.util.StringUtils.*;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

//import static String

import reactor.core.publisher.Mono;

public class PersonHandler {

    // ...

    public Mono<ServerResponse> listPeople(ServerRequest request) {
    	containsWhitespace("");
        return null;
    	// ...
    }

    public Mono<ServerResponse> createPerson(ServerRequest request) {
        return null;
        // ...
    }

    public Mono<ServerResponse> getPerson(ServerRequest request) {
        return null;
        // ...
    }
}
