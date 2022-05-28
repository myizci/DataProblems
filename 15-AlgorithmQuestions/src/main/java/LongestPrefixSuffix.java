public class LongestPrefixSuffix {
    // Java program to find length of the longest
// prefix which is also suffix


        // Function to find largest prefix
// which is also a suffix

    /*
Input : aabcdaabc   //prefixes a, aa,aab,aabc   , suffixes c, bc, abc, aabc
Output : 4
The string "aabc" is the longest
prefix which is also suffix.

Input : abcab
Output : 2

Input : aaaa
Output : 2


     */
        public static int longestPrefixSuffix(String s)
        {
            int n = s.length();

            // If n is less than 2
            if(n < 2) {
                return 0;
            }

            int len = 0;
            int i = (n + 1)/2; // the char index after the middle term
            // 1234567  7+1/2=4 index 4 is right after middle
            //123456    6+1/2=3

            // Iterate i till n
            while(i < n)
            {

                // If s.charAt(i) is equal to
                // s.charAt(len)
                if(s.charAt(i) == s.charAt(len))
                {
                    ++len; // 1 2
                    ++i; // 5 6
                }
                else
                {
                    i = i - len + 1;
                    len = 0;
                }
            }

            // Return len
            return len;

        }

        // Driver code
        public static void main (String[] args)
        {
            String s = "abfhgyuabf";

            /*
            i= index 8
            len=1

            charAt(8)== charat(1) a==a


             */
            System.out.println(longestPrefixSuffix(s));
        }
    }



