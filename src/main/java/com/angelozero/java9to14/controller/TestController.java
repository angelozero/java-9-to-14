package com.angelozero.java9to14.controller;

import com.angelozero.java9to14.java_09.CollectionFactories;
import com.angelozero.java9to14.java_10.InferenceOfVariables;
import com.angelozero.java9to14.java_11.Http2ClientApi;
import com.angelozero.java9to14.java_11.Http2ClientAsyncApi;
import com.angelozero.java9to14.java_11.async.AsyncCallsService;
import com.angelozero.java9to14.java_13.TextBlocks;
import com.angelozero.java9to14.java_14.SwitchExpression;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@RestController
@AllArgsConstructor
public class TestController {

    private CollectionFactories collectionFactories;
    private InferenceOfVariables inferenceOfVariables;
    private Http2ClientApi http2ClientApi;
    private Http2ClientAsyncApi http2ClientAsyncApi;
    private AsyncCallsService asyncCallsService;
    private TextBlocks textBlocks;
    private SwitchExpression switchExpression;

    @GetMapping(value = "/collection-factories-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> collectionFactoriesListTest() {
        return new ResponseEntity<>(collectionFactories.generateListOfStrings(), HttpStatus.OK);
    }

    @GetMapping(value = "/collection-factories-set", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<String>> collectionFactoriesSetTest() {
        return new ResponseEntity<>(collectionFactories.generateSetListOfObjects(), HttpStatus.OK);
    }

    @GetMapping(value = "/collection-factories-map", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<Integer, String>> collectionFactoriesMapTest() {
        return new ResponseEntity<>(collectionFactories.generateMapListOfObjects(), HttpStatus.OK);
    }

    @GetMapping(value = "/inference-variables", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<Integer, String>> inferenceOfVariablesTest() {
        return new ResponseEntity<>(inferenceOfVariables.newTypeOfVariable(), HttpStatus.OK);
    }

    @GetMapping(value = "/http2-client-api", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> http2ClientApiTest() throws URISyntaxException, IOException, InterruptedException {
        return new ResponseEntity<>(http2ClientApi.newHttpClientConnection(), HttpStatus.OK);
    }

    @GetMapping(value = "/http2-client-api-async", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> http2ClientApiAsyncTest() throws URISyntaxException, InterruptedException, ExecutionException {
        return new ResponseEntity<>(http2ClientAsyncApi.newHttpClientConnection(), HttpStatus.OK);
    }

    @GetMapping(value = "/async-calls", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> asyncCallsServiceTest() throws JsonProcessingException {
        return new ResponseEntity<>(asyncCallsService.execute(), HttpStatus.OK);
    }

    @GetMapping(value = "/text-blocks", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> textBlocksTest() throws JsonProcessingException {
        return new ResponseEntity<>(textBlocks.newTypeOfTextBlocks(), HttpStatus.OK);
    }

    @GetMapping(value = "/switch-expression", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> switchExpressionTest() throws JsonProcessingException {
        var names = List.of("angelo", "zero", "jake");
        return new ResponseEntity<>(switchExpression.newSwitchCase(names.get(new Random().nextInt(3))), HttpStatus.OK);
    }
}
