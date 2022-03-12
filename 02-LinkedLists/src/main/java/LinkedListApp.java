public class LinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList list1=new MySinglyLinkedList();
        //int[] numbers={1,1,2,2,2,3,4,4,4,4,5,6,6};
        for(int i=0;i<10;i++) list1.add(i);
        //System.out.println("With duplicates");
        //list1.printNodes();
        //System.out.println("Without duplicates");
        //list1.removeDuplicatesFromLinkedList();
        list1.printNodes();
       System.out.println("After reverse in one pass");
       list1.reverse();
       list1.printNodes();

    }
}
