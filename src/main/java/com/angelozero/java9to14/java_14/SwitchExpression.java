package com.angelozero.java9to14.java_14;

import org.springframework.stereotype.Service;

@Service
public class SwitchExpression {

    @Deprecated
    public String oldSwitchCase(String name) {

        switch (name) {
            case "zero":
                return "Almost there !";

            case "angelo":
                return "This is the correct name !";

            default:
                return "You don't need to use it like this anymore";
        }
    }

    public String newSwitchCase(String name) {

        return switch (name) {
            case "zero" -> "Almost there !";
            case "angelo" -> "This is the correct name !";
            default -> "You don't need to use it like this anymore";
        };

    }

}
