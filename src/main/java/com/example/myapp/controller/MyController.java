package com.example.myapp.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/greeting")
        @Operation(summary = "Get Greeting", description = "Returns a greeting message.")
        @ApiResponses( value = {
                @ApiResponse(responseCode = "200", description = "Greeting message successfully returned.",
                        content = @Content(mediaType = "application/json",
                                schema = @Schema(type = "string", example = "Hello World!"))),
        })
        public ResponseEntity<String> getGreeting() {
            return ResponseEntity.ok("Hello, World!");
        }

    @PostMapping("/submit")
        @Operation(summary = "Submit Data", description = "Receives data and returns a confirmation message.")
        @ApiResponses( value = {
                    @ApiResponse(responseCode = "200", description = "Data successfully received.",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(type = "string", example = "Data received: { 'data': 'Hello'}"))),
                    @ApiResponse(responseCode = "400", description = "Bad request, invalid data.")
        })
        public ResponseEntity<String> submitData(@RequestBody String data) {
            return ResponseEntity.ok("Data received: " + data);
        }

    @GetMapping("/user/{id}")
        @Operation( summary = "Get User by ID", description = "Fetches a user by their unique identifier.",
                parameters = {
                        @Parameter(
                                name = "id",
                                description = "The ID of the user to retrieve",
                                required = true,
                                example = "2"
                        )
                }
        )
        @ApiResponses( value = {
                @ApiResponse(responseCode = "200", description = "User successfully retrieved.",
                        content = @Content(mediaType = "application/json",
                                schema = @Schema(type = "string", example = "User ID: 1"))),
        })
        public ResponseEntity<String> getUserById(@PathVariable("id") Long id) {
            return ResponseEntity.ok("User ID: " + id);
        }

    @GetMapping("/search")
        @Operation(summary = "Search", description = "Searches for items based on a query parameter.")
        @ApiResponses( value = {
                @ApiResponse(responseCode = "200", description = "Search successful.",
                        content = @Content(mediaType = "application/json",
                                schema = @Schema(type = "string", example = "Search results for: spring"))),
        })
        public ResponseEntity<String> search(
                @RequestParam(name = "query", defaultValue = "")
                @Parameter(description = "Search query") String query) {
            return ResponseEntity.ok("Search results for: " + query);
        }
}
