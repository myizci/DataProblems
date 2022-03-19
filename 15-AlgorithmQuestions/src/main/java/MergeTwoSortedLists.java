import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public class MergeTwoSortedLists {


   private  static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    private static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        // l1 is head of the first list, l2 is the head of the second
        // If one of the lists is null, return the other one

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // Variables head and temp

        ListNode head; // we need to return head, since it is enough
        ListNode temp; // temp will always be our tail of our new list

        // Choose the smallest of the heads

        if (l1.val < l2.val) {
            temp = head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            temp = head = new ListNode(l2.val);
            l2 = l2.next;
        }


        // Loop through values to link them as long as nothing is null
        // if one of the values is null, it means that we have to the end of that list
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            temp = temp.next;
        }

        // Add all the elements of one list to our list once we have one list only
        while (l1 != null) {
            temp.next = new ListNode(l1.val);
            l1 = l1.next;
            temp = temp.next;
        }

        while (l2 != null) {
            temp.next = new ListNode(l2.val);
            l2 = l2.next;
            temp = temp.next;

        }

        return head;
    }



    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + ", ");
            head=head.next;
        }


    }

    public static void main(String[] args) {
        ListNode head1;
        ListNode head2;
        ListNode l1 = head1 = new ListNode(1);
        ListNode l2 = head2 = new ListNode(1);
        List<Integer> list1 = Arrays.asList(3, 5, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(4, 6, 7);

        for (Integer integer : list1) {
            l1.next = new ListNode(integer);
            l1 = l1.next;
        }

        for (Integer integer : list2) {
            l2.next = new ListNode(integer);
            l2 = l2.next;
        }


        print(head1);
        System.out.println();
        print(head2);


      //  print(mergeTwoSortedLists(head1,head2));



    }
}
