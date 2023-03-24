package com.angelozero.java9to14.java_9;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InferenceOfVariables {

    @Deprecated
    public String oldTypeOfVariable() {

        Map<Integer, String> listOfMapStrings = new HashMap<>();
        listOfMapStrings.put(1, "angelo zero");

        return "You don't need to use it like this anymore";
    }

    public Map<Integer, String> newTypeOfVariable() {

        var listOfMapStrings = new HashMap<Integer, String>();
        listOfMapStrings.put(1, "angelo zero");

        return listOfMapStrings;
    }
}
