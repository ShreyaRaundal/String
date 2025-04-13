import java.util.LinkedHashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
