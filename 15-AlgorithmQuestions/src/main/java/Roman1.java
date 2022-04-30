import java.util.*;

/*
Symbol Value
I 1
V 5
X 10  XIXVII
L 50
C 100
D 500
M 1000
• I can be placed before V (5) and X (10) to make 4 and 9.
• X can be placed before L (50) and C (100) to make 40 and 90.
• C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class Roman1 {
    public static void main(String[] args) {

        String str = "MCMMCMXVI";
        System.out.println(romanToNumber2(str));
    }

    public static int romanToNumber(String str) {
        int sum = 0;
        char[] nums = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {


            if (converter(nums[i + 1]) > converter(nums[i])) {
                sum += (converter(nums[i + 1]) - converter(nums[i]));
                i = i + 2;
            }

            if (converter(nums[str.length() - 1]) > converter(nums[str.length() - 2])) {
                sum += converter(nums[str.length() - 1]) - 2 * converter(nums[str.length() - 2]);
            } else {
                sum += converter(nums[str.length() - 1]);
            }

            sum += converter(nums[i]);


        }


        return sum;

    }

    public static int romanToNumber2(String str) {
        char[] nums = str.toCharArray();
        int sum = 0;
        Node head = new Node(converter(nums[0]));
        Node current = head;
        for (int i = 1; i < str.length(); i++) {
            current.next = new Node(converter(nums[i]));
            current = current.next;
        } // creates a linked list
        while (head != null) { // head is iterating

            if (head.next != null && (head.next.value > head.value)) {
                sum += head.next.value - head.value;
                head = head.next.next;
            } else {
                sum += head.value;
                head = head.next;
            }
        }
        return sum;
    }

    class MyNode {
        int value;
        Node next;
        public MyNode(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static int converter(char c) {

        switch (c) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }
}
