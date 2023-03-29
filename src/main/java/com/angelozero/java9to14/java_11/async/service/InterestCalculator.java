package com.angelozero.java9to14.java_11.async.service;

import com.angelozero.java9to14.java_11.async.dao.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InterestCalculator {

    public void execute(Product product) {
        try {
            log.info("Calculating...");
            Thread.sleep(5000);
            product.setPrice(product.getPrice() * 0.3);
            log.info("Product " + product.getName() + " price was recalculated to " + product.getPrice());

        } catch (InterruptedException ex) {
            throw new RuntimeException("JAVA-9-TO-14-ERROR: ", ex);
        }
    }
}
