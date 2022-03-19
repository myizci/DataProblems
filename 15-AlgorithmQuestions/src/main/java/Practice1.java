import java.util.Arrays;
import java.util.List;

public class Practice1 {


    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode head;

        ListNode current;

        // if one list is empty, return the other one

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            head = current = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            head = current = new ListNode(l2.val);
            l2 = l2.next;
        }

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            current = current.next;
        }

        while (l1 != null) {
            current.next = new ListNode(l1.val);
            l1 = l1.next;
            current = current.next;
        }

        while (l2 != null) {
            current.next = new ListNode(l2.val);
            l2 = l2.next;
            current = current.next;
        }
        return head;
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + ", ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode head1;
        ListNode head2;
        ListNode temp;

        List<Integer> list1 = Arrays.asList(3, 5);
        List<Integer> list2 = Arrays.asList(4, 6, 7,8,9,10,11);

        ListNode l1 = head1 = new ListNode(1);
        ListNode l2 = head2 = new ListNode(1);


        for (Integer integer : list1) {
            l1.next = new ListNode(integer);
            l1 = l1.next;
        }



        for (Integer integer : list2) {
            l2.next = new ListNode(integer);
            l2 = l2.next;
        }


        print(mergeTwoSortedLists(head1,head2));


    }
}
