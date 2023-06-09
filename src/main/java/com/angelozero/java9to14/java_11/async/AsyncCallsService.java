package com.angelozero.java9to14.java_11.async;

import com.angelozero.java9to14.java_11.async.dao.Product;
import com.angelozero.java9to14.java_11.async.service.InterestCalculator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.SubmissionPublisher;

@Slf4j
@Service
@AllArgsConstructor
public class AsyncCallsService {

    private InterestCalculator interestCalculator;

    public String execute() throws JsonProcessingException {
        Product mobile = Product.builder()
                .name("iDroid")
                .price(1000.00)
                .build();

        SubmissionPublisher<Product> publisher = new SubmissionPublisher<>();
        publisher.consume(interestCalculator::execute);
        publisher.submit(mobile);
        log.info("Your product is being processed...");
        publisher.close();

        return new ObjectMapper().writeValueAsString(mobile);
    }
}
