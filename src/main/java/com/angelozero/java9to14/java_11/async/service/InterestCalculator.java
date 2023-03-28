package com.angelozero.java9to14.java_11.async.service;

import com.angelozero.java9to14.java_11.async.dao.Product;
import org.springframework.stereotype.Service;

@Service
public class InterestCalculator {

    public void execute(Product product) {
        try {
            System.out.println("Calculating...");
            Thread.sleep(5000);
            product.setPrice(product.getPrice() * 0.3);
            System.out.println("\nProduct " + product.getName() + " price was recalculated to " + product.getPrice() + "\n");

        } catch (InterruptedException ex) {
            throw new RuntimeException("JAVA-9TO-14-ERROR: ", ex);
        }
    }
}
