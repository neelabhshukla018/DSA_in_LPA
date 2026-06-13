package JCF;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {

        // 1. Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // 2. Add elements (put)
        map.put("IN", "India");
        map.put("US", "United States");
        map.put("JP", "Japan");
        map.put("BR", "Brazil");

        System.out.println("Original Map : " + map);

        // 3. Get value using key
        System.out.println("\nget(IN) : " + map.get("IN"));

        // 4. Check key and value
        System.out.println("containsKey(US) : " + map.containsKey("US"));
        System.out.println("containsValue(Japan) : " + map.containsValue("Japan"));

        // 5. Size of map
        System.out.println("size() : " + map.size());

        // 6. Update value
        map.put("JP", "Japan Updated");
        System.out.println("\nAfter updating JP : " + map);

        // 7. putIfAbsent()
        map.putIfAbsent("FR", "France");
        map.putIfAbsent("IN", "Indonesia"); // Will not update
        System.out.println("After putIfAbsent() : " + map);

        // 8. replace()
        map.replace("BR", "Belgium");
        System.out.println("After replace() : " + map);

        // 9. getOrDefault()
        System.out.println("\ngetOrDefault(IN) : "
                + map.getOrDefault("IN", "Not Found"));
        System.out.println("getOrDefault(RU) : "
                + map.getOrDefault("RU", "Not Found"));

        // 10. Remove element
        map.remove("US");
        System.out.println("\nAfter remove(US) : " + map);

        // 11. Remove key-value pair
        map.remove("FR", "France");
        System.out.println("After remove(FR, France) : " + map);

        // 12. Print all keys
        System.out.println("\nkeySet() : " + map.keySet());

        // 13. Print all values
        System.out.println("values() : " + map.values());

        // 14. Traverse using entrySet()
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        // 15. Traverse using forEach()
        System.out.println("\nUsing forEach():");
        map.forEach((key, value) ->
                System.out.println(key + " = " + value));

        // 16. Create another map
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("AR", "Argentina");
        map2.put("AU", "Australia");

        // 17. putAll()
        map2.putAll(map);
        System.out.println("\nAfter putAll() : " + map2);

        // 18. Clone map
        HashMap<String, String> copy =
                (HashMap<String, String>) map2.clone();
        System.out.println("Cloned Map : " + copy);

        // 19. isEmpty()
        System.out.println("\nisEmpty() : " + map2.isEmpty());

        // 20. Clear map
        map2.clear();
        System.out.println("After clear() : " + map2);
        System.out.println("isEmpty() after clear : " + map2.isEmpty());
    }
}