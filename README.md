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