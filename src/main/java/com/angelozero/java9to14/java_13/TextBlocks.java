package com.angelozero.java9to14.java_13;

public class TextBlocks {

    @Deprecated
    public String oldTypeOfTextBlocks() {

        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam magna neque, elementum nec "    +
                "porttitor a, egestas a lorem. Vivamus malesuada nunc at risus sollicitudin ullamcorper. Duis vulputate"    +
                " tempus ipsum, a luctus ante facilisis vel. Quisque eu quam sed leo elementum condimentum eget id "        +
                "velit. Mauris at egestas diam. Class aptent taciti sociosqu ad litora torquent per conubia nostra, "       +
                "per inceptos himenaeos. Phasellus nec pellentesque ipsum. Fusce imperdiet leo ipsum, a placerat "          +
                "sapien lobortis ut.";

        return "You don't need to use it like this anymore";
    }

    public String newTypeOfTextBlocks() {

        String loremIpsum = """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam magna neque, elementum nec porttitor a,
                    egestas a lorem. Vivamus malesuada nunc at risus sollicitudin ullamcorper. Duis vulputate tempus ipsum,
                    a luctus ante facilisis vel. Quisque eu quam sed leo elementum condimentum eget id velit. Mauris at
                    egestas diam. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos
                    himenaeos. Phasellus nec pellentesque ipsum. Fusce imperdiet leo ipsum, a placerat sapien lobortis ut.
                """;

        return loremIpsum;
    }

}
