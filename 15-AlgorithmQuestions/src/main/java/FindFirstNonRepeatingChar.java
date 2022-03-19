import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {
    // convert String into a charArray
    // put the array in a hashMap key -> char value -> count
    // loop through and return the first key with the value 1

    public static void main(String[] args) {
        String str = "a green apple";
        System.out.println(findFirstNonRepeatingChar(str));
    }

    private static char findFirstNonRepeatingChar(String str) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count+1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : chars) {
            if (map.get(ch) == 1) return ch;
        }

        return Character.MIN_VALUE;
    }
}
