import java.util.*;

public class KeepMRemoveN {


    public static void main(String[] args) {



        Node head = new Node(1);
        Node current = head;

        for (int i = 2; i < 38; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        printList(head);
        System.out.println();
        printList(keepMRemoveN2(head, 2, 2));
        System.out.println();



    }


    public static Node keepMRemoveN2(Node headGiven, int m, int n) {
        Node current= headGiven;
        Node newHead=  current;
        int counter = 1;
        int k =m+n;
        while (current != null) {
            counter++;
            current = current.next;
            int mode = counter%k;
            if (mode <= m && mode != 0) {
                newHead.next = current;
                newHead=newHead.next;
            }
        }
        if(newHead!=null) newHead.next=null;


        return headGiven;

    }

    public static void printList(Node node) {

        while (node!= null) {
            System.out.print(node.value + ", ");
            node = node.next;

        }

    }

}
