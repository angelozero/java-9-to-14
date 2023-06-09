package com.angelozero.java9to14.java_11;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

import static java.net.http.HttpResponse.BodyHandlers;

@Service
@Slf4j
public class Http2ClientAsyncApi {

    public String newHttpClientConnection() throws URISyntaxException, InterruptedException, ExecutionException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest
                .newBuilder(new URI("http://www.brainjar.com/java/host/test.html"))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.sendAsync(httpRequest, BodyHandlers.ofString())
                .whenComplete((success, error) -> log.info("Success http2 client async api call!"))
                .get();

        return response.body();
    }
}
