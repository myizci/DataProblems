package linkedList;

public class MyLinkedList {

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void insert(int value) { // O(1)
        Node node = new Node(value);

        if (isEmpty()) {
            head = node;
            tail = head;
        } else {

            tail.next = node;
            tail = node;
            size++;
        }
    }


    public void print() { //O(n)

        Node current = head;

        while (current != null) {
            System.out.print(current.value + ", ");
            current = current.next;
        }

    }


    public void delete(int value) {
        Node current = head;
        Node previous = head;
        while (current != null) {
            if (current.value == value) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                }
                if (current == tail) {
                    tail = previous;
                }
                previous.next = current.next;
                current.next = null;
            }
            previous = current;
            current = current.next;
        }
        size--;

    }

    public void deleteKthFromLast(int k) {

        Node prt1 = head;
        Node prt2 = head;

        for (int i = 0; i < k - 1; i++) {

            prt2 = prt2.next;

            if (prt2 == null) {
                System.out.println("No such value");
            }
        }

        while (prt2.next != null) {

            prt1 = prt1.next;
            prt2 = prt2.next;

        }

        delete(prt1.value);

        size--;

    }

    public void removeKthFromLast(int k) {
        Node prevDelete = null;  // this is tracking what comes before the to be deleted Node
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
            if (ptr2 == null) System.out.println("No such value");
            ;
        }
        while (ptr2.next != null) {
            prevDelete = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == head) {  //1 2 3 4 5p2 , erase the fifth from
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else {
            prevDelete.next = ptr1.next; // this is delete method
            ptr1.next = null;
            size--;
        }
    }

    public void updateNodeValue(int valueOld, int valueNew) {

        // iterate through list
        // if value== valueOld
        // assign new value for old value

        Node current = head;

        while (current != null) {
            if (current.value == valueOld) {
                current.value = valueNew;
                break;
            }
            current = current.next;
        }

    }

    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
