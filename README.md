# News about Java versions ( 9 to 14 )

## Java 9

---
 
- ### Collection Factories
- Instead of use like this

```javascript
    @Deprecated
    public String generateAnOldList() {
        List<String> listOfListStrings = new ArrayList<>();
        listOfListStrings.add("angelo");
        listOfListStrings.add("zero");
        listOfListStrings.add("this is an immutable string list");

        Set<String> listOfSetStrings = new HashSet<>();
        listOfSetStrings.add("angelo");
        listOfSetStrings.add("zero");
        listOfSetStrings.add("this is an immutable string list");

        Map<Integer, String> listOfMapStrings = new HashMap<>();
        listOfMapStrings.put(1, "angelo");
        listOfMapStrings.put(2, "zero");
        listOfMapStrings.put(3, "this is an immutable string list");
        
        return " You don't need to use it like this anymore";
    }
```
- Use like this
```javascript
    public List<String> generateListOfStrings() {
        return List.of("angelo", "zero", "this is an immutable string list");
    }

    public Set<String> generateSetListOfObjects() {
        return Set.of("angelo", "zero", "this is an immutable set string list");
    }

    public Map<Integer, String> generateMapListOfObjects() {
        return Map.of(1, "angelo", 2, "zero", 3, "this is an immutable map string list");
    }
```
---

## Java 10

---
- ### Inference of Variables

- Instead of use like this

```javascript
    @Deprecated
    public String oldTypeOfVariable() {
    
        Map<Integer, String> listOfMapStrings = new HashMap<>();
        listOfMapStrings.put(1, "angelo zero");
    
        return "You don't need to use it like this anymore";
    }
```
- Use like this

```javascript
    public Map<Integer, String> newTypeOfVariable() {
    
        var listOfMapStrings = new HashMap<Integer, String>();
        listOfMapStrings.put(1, "angelo zero");
    
        return listOfMapStrings;
    }
```
---

## Java 13

---

- ### Text Blocks

- Instead of use like this

```javascript
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
```
- Use like this

```javascript
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
```
---

## Java 14

---

- ### Switch Expression

- Instead of use like this

```javascript
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
```
- Use like this

```javascript
        public String newSwitchCase(String name) {

        return switch (name) {
            case "zero" -> "Almost there !";
            case "angelo" -> "This is the correct name !";
            default -> "You don't need to use it like this anymore";
        };
        
    }
```