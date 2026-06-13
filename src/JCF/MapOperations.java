package JCF;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapOperations {
    public static void main(String[] args) {

        // ==========================
        // 1. Creating a HashMap
        // ==========================
        HashMap<String, String> m1 = new HashMap<>();

        // ==========================
        // 2. Adding Elements (put)
        // ==========================
        m1.put("IN", "India");
        m1.put("BR", "Brazil");
        m1.put("RU", "Russia");
        m1.put("SP", "Spain");

        System.out.println("Original Map: " + m1);

        // ==========================
        // 3. Accessing Value (get)
        // ==========================
        System.out.println("Value for key IN: " + m1.get("IN"));

        // ==========================
        // 4. Checking Key and Value
        // ==========================
        System.out.println("Contains key BR? " + m1.containsKey("BR"));
        System.out.println("Contains value India? " + m1.containsValue("India"));

        // ==========================
        // 5. Size of Map
        // ==========================
        System.out.println("Size of map: " + m1.size());

        // ==========================
        // 6. Updating Value
        // ==========================
        m1.put("SP", "South Africa"); // Replaces old value
        System.out.println("After updating SP: " + m1);

        // ==========================
        // 7. putIfAbsent()
        // ==========================
        m1.putIfAbsent("FR", "France");
        m1.putIfAbsent("IN", "Indonesia"); // Won't replace
        System.out.println("After putIfAbsent(): " + m1);

        // ==========================
        // 8. Removing Elements
        // ==========================
        m1.remove("RU"); // Remove by key
        System.out.println("After remove(RU): " + m1);

        m1.remove("SP", "South Africa"); // Remove key-value pair
        System.out.println("After remove(SP, South Africa): " + m1);

        // ==========================
        // 9. Replace Value
        // ==========================
        m1.replace("BR", "Belgium");
        System.out.println("After replace(BR): " + m1);

        m1.replace("FR", "France", "Finland");
        System.out.println("After conditional replace: " + m1);

        // ==========================
        // 10. Creating Another Map
        // ==========================
        HashMap<String, String> m2 = new HashMap<>();

        m2.put("Arjun", "India");
        m2.put("Burrato", "Brazil");
        m2.put("Daniel", "Russia");
        m2.put("Professor", "Spain");

        System.out.println("\nSecond Map: " + m2);

        // ==========================
        // 11. putAll()
        // ==========================
        m2.putAll(m1);
        System.out.println("After putAll(m1): " + m2);

        // ==========================
        // 12. keySet()
        // ==========================
        Set<String> keys = m2.keySet();
        System.out.println("Keys: " + keys);

        // ==========================
        // 13. values()
        // ==========================
        Collection<String> values = m2.values();
        System.out.println("Values: " + values);

        // ==========================
        // 14. entrySet()
        // ==========================
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, String> entry : m2.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        // ==========================
        // 15. forEach() (Java 8)
        // ==========================
        System.out.println("\nUsing forEach:");
        m2.forEach((key, value) -> System.out.println(key + " = " + value));

        // ==========================
        // 16. getOrDefault()
        // ==========================
        System.out.println("\nExisting key: " +
                m2.getOrDefault("IN", "Not Found"));

        System.out.println("Non-existing key: " +
                m2.getOrDefault("US", "Not Found"));

        // ==========================
        // 17. isEmpty()
        // ==========================
        System.out.println("\nIs map empty? " + m2.isEmpty());

        // ==========================
        // 18. clone()
        // ==========================
        HashMap<String, String> m3 =
                (HashMap<String, String>) m2.clone();

        System.out.println("Cloned Map: " + m3);

        // ==========================
        // 19. clear()
        // ==========================
        m3.clear();
        System.out.println("After clear(), m3 = " + m3);
        System.out.println("Is m3 empty? " + m3.isEmpty());
    }
}