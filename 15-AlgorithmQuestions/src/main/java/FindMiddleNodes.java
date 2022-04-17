public class FindMiddleNodes {
    public static void main(String[] args) {
        MySinglyLinkedList sll = new MySinglyLinkedList();
        for (int i = 0; i < 100; i++) {
            sll.add(i);
        }
        sll.printNodes();
        System.out.println();
        printMiddle2(sll);
    }

//    private static void printMiddle(MySinglyLinkedList sll) {
//        if (sll.isEmpty()) throw new IllegalArgumentException();
//        var sJump = sll.head;
//        var dJump = sll.head;
//
//        while (dJump != sll.tail && dJump.next != sll.tail) {
//            sJump = sJump.next;
//            dJump = dJump.next.next;
//        }
//
//        if (dJump == sll.tail) System.out.println(sJump.value);
//        else System.out.println(sJump.value + "," + sJump.next.value);
//    }



/*
1->2->3->4->5->6->null

Single jump : 2 -- 3
Double jump : 3 -- 5 stop if you end up before tail , condition for even number of elements

1->2->3->4->5->6->7->null

Single jump : 2 -- 3 -- 4
Double jump : 3 -- 5 -- 7 stop if you end up at tail, condition for odd number of elements

 */

    private static void printMiddle2(MySinglyLinkedList sll) {

Node sJump;
Node dJump;

sJump = dJump = sll.head;

while(dJump!=sll.tail && dJump.next!=sll.tail){
    sJump=sJump.next; // single jump
    dJump=dJump.next.next; // double jump
}

if(dJump==sll.tail) System.out.println(sJump.value); // sJump is exactly on the middle term
else System.out.println(sJump.value+","+sJump.next.value); // sJump is the first middle term, sJump.next is the second


    }

}