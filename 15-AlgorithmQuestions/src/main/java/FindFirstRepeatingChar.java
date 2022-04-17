import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingChar {
    public static void main(String[] args) {
        String str = "a green apple";
        System.out.println(findFirstRepeatingChar(str));
    }

    private static char findFirstRepeatingChar(@NotNull String str){
        char[] arr = str.toCharArray();

        Set<Character> set = new HashSet<>();

        for (Character ch : arr) {
            if(!set.contains(ch)) set.add(ch);
            else return ch;

            // if(set.contains(ch)) return ch
            //set.add(ch)   different approach
        }

        return Character.MIN_VALUE;
    }
}
