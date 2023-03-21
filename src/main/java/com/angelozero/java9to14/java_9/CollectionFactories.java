package com.angelozero.java9to14.java_9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactories {

    public List<String> generateListOfStrings() {
        return List.of("angelo", "zero", "this is an immutable string list");
    }

    public Set<String> generateSetListOfObjects() {
        return Set.of("angelo", "zero", "this is an immutable set string list");
    }

    public Map<Integer, String> generateMapListOfObjects() {
        return Map.of(1, "angelo", 2, "zero", 3, "this is an immutable map string list");
    }
}
