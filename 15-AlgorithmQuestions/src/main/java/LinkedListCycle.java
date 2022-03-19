import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle {
    /*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.
    There is a cycle in a linked list if there is some node in the list that can be reached
    again by continuously following the next pointer.
    Return true if there is a cycle in the linked list. Otherwise, return false.

     */

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next=null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {


    }

    private static  boolean hasCycle(ListNode head) {

        // return false id head is null

        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null && fast.next != null) {

            if (slow == fast) return true;

            fast = fast.next;
            slow = slow.next;
        }

        return false;
    }

    private static  boolean hasCycleBruteForce(ListNode head) {

        Set<ListNode> nodesSeen = new HashSet<>();

        while(head!=null){
            if(nodesSeen.contains(head)) return true;
            else nodesSeen.add(head);

            head=head.next;
        }

        return false;
    }

    /*
    The time complexities of both the methods remain the same that is O(n).
     However, the space complexities of the two solutions vary
     the brute force solution will be O(n), the optimal solution returns
     a space complexity of O(1) which is the space consumed by the list itself.
     */

    }
