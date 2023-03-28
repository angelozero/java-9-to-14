package com.angelozero.java9to14.java_11;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpResponse.*;

@Service
public class Http2ClientApi {

    @Deprecated
    public String oldHttpClientConnection() throws IOException {
        URL url = new URL("www.google.com");
        URLConnection connection = url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line = "";

        while (reader.readLine() != null) {
            line = line.concat(reader.readLine()).concat(System.lineSeparator());
        }
        return "You don't need to use it like this anymore";
    }


    public String newHttpClientConnection() throws URISyntaxException, IOException, InterruptedException {

        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest httpRequest = HttpRequest
                    .newBuilder(new URI("http://www.brainjar.com/java/host/test.html"))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, BodyHandlers.ofString());
            return response.body();

        } catch (Exception ex) {
            throw new RuntimeException("JAVA-9TO-14-ERROR: ", ex);
        }
    }
}
