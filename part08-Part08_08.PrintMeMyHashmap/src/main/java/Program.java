
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    public static void printKeys(HashMap<String, String> hashmap) {
        System.out.println(hashmap.keySet());
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        ArrayList<String> keys = new ArrayList<>();

        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                keys.add(key);
            }
        }

        System.out.println(keys);

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        ArrayList<String> values = new ArrayList<>();

        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                values.add(hashmap.get(key));
            }
        }

        System.out.println(values);
    }

}
