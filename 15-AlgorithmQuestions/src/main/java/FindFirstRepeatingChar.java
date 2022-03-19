import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingChar {
    public static void main(String[] args) {
        String str = "green apple";
        System.out.println(findFirstRepeatingChar(str));
    }

    private static char findFirstRepeatingChar(String str){
        char[] arr = str.toCharArray();

        Set<Character> set = new HashSet<>();

        for (Character ch : arr) {
            if(!set.contains(ch)) set.add(ch);
            else return ch;
        }

        return Character.MIN_VALUE;
    }
}
