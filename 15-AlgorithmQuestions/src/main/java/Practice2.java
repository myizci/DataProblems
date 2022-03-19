
/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list.
The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
 */

import java.util.Arrays;
import java.util.List;

public class Practice2 {

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

    private static ListNode mergeTwoLinkedList(ListNode l1, ListNode l2) {
        // brute force solution
        ListNode head;
        ListNode current;
        // 1,3,5,7,2,4,6,8 is it sorted, NO, sorting id O(nlogn)
        return new ListNode(1);
    }

    private static ListNode mergeTwoLinkedList2(ListNode l1, ListNode l2) {

        ListNode current=null;
        ListNode head=null;

        // Edge Cases l1 is null and l2 is not

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        // L1 and l2 are both not null


            if (l1.val < l2.val) {
                current = head = l1;
                current.next=new ListNode(l1.val);
                l1 = l1.next;
            } else {
                current = head = l2;
                current.next=new ListNode(l2.val);
                l2 = l2.next;
            }



        return current;
    }

    static void print(ListNode head){

        while(head!=null){
            System.out.print(head.val+", ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 5, 7);
        List<Integer> list2 = Arrays.asList(4, 6, 8);
        ListNode head1;
        ListNode head2;
        ListNode l1 = head1 = new ListNode(1);
        ListNode l2 = head2 = new ListNode(2);

        for (Integer integer : list1) {
            l1.next = new ListNode(integer);
            l1 = l1.next;
        }

        for (Integer integer : list2) {
            l2.next = new ListNode(integer);
            l2 = l2.next;
        }

        print(mergeTwoLinkedList2(l1,l2));

    }

}
