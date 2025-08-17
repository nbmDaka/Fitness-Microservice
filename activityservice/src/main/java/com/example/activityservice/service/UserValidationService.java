package com.example.activityservice.service;

import lombok.RequiredArgsConstructor;
import org.apache.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
@RequiredArgsConstructor
public class UserValidationService {
    private final WebClient userServiceWebClient;

    public boolean isValidUser(String userId) {
        try {
            return userServiceWebClient.get()
                    .uri("/api/users/{userId}/validate", userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block();

        } catch (WebClientResponseException e) {

            if (e.getStatusCode() == HttpStatusCode.valueOf(HttpStatus.SC_NOT_FOUND)) {
                throw new RuntimeException("User not found with id: " + userId);
            } else if (e.getStatusCode() == HttpStatusCode.valueOf(HttpStatus.SC_BAD_REQUEST)) {
                throw new RuntimeException("Invalid Request: " + userId);
            } else {

                throw e;
            }

        }
    }
}
