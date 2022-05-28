package phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookList {
    PhoneRecord head;
    PhoneRecord tail;
    int size;

    public PhoneBookList(PhoneRecord head, PhoneRecord tail, int size) {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public PhoneBookList() {
    }

    boolean isEmpty() {
        return head == null;
    }

    void addRecord(PhoneRecord phoneRecord) {

        if (isEmpty()) {
            head = phoneRecord;
            tail = phoneRecord;

        } else {
            tail.next = phoneRecord;
            tail = tail.next;
        }
        size++;
    }

    void printRecords() {
        PhoneRecord current = head;
        int num = 1;

        while (current != null) {
            if (current.next == null) {
                System.out.print(num + ") ");
                System.out.println(current + "\n=> End of Phonebook");

            } else {
                System.out.print(num++ + ") ");
                System.out.println(current);

            }
            current = current.next;
        }
    }

    void addRecord() {
        PhoneRecord newRecord = new PhoneRecord();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first name");
        newRecord.firstName = sc.nextLine();

        System.out.println("Please enter last name");
        newRecord.lastName = sc.nextLine();

        System.out.println("Please enter email");
        newRecord.email = sc.nextLine();

        System.out.println("Please enter phone number");
        newRecord.phoneNumber = sc.nextLong();

       // System.out.println(newRecord);
        sc.close();

        addRecord(newRecord);

    }

    PhoneRecord findByFirstName(String firstName) {

        PhoneRecord current = head;

        while (current != null) {
            if (current.firstName.equalsIgnoreCase(firstName)) {
                return current;
            }
            current = current.next;
        }
        System.out.println("No record is found");
        return null;
    }

    ArrayList<PhoneRecord> findAllByLastName(String lastName) {

        ArrayList<PhoneRecord> list = new ArrayList();
        PhoneRecord current = head;

        while (current != null) {
            if (current.lastName.equalsIgnoreCase(lastName)) {
                list.add(current);

            }
            current = current.next;
        }
        return list;
    }

    void delete(String firstName) {
        final int size2 = size;
        if (isEmpty()) System.out.println("No record is available in the phone book");

        PhoneRecord current = head;
        PhoneRecord prev = head;

        while (current != null) {
            if (current.firstName.equalsIgnoreCase(firstName)) {
                if (current == head) {
                    head = head.next;
                    current.next = null; // you have to say this to finish after one record

                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;

                } else {
                    prev.next = current.next;
                    current.next = null;

                }
                size--;

            }
            prev = current;
            current = current.next; // current is null

        }
        if (size2 == size) {
            System.out.println("No such record is available in the phone book");
        }
    }

    void deleteAll(String lastName){

        if (isEmpty()) System.out.println("No record is available in the phone book");
        final int size2 = size;
        PhoneRecord current = head;
        PhoneRecord prev = head;

        while (current != null) {
            if (current.lastName.equalsIgnoreCase(lastName)) {
                if (current == head) {
                    head = current.next;  // p1 -> h_p2 -> p3

                }
                if (current == tail) {
                    tail = prev;


                }
                    prev.next = current.next;

                size--;
            }
            prev = current;
            current = current.next;
        }
        if (size2 == size) {
            System.out.println("No such record is available in the phone book");
        }
    }

    public void deleteByName(String name){
        PhoneRecord current = head;
        PhoneRecord prev = head;
        while (current!= null){
            if (current.firstName.equals(name)){
                //case for head
                if (current == head){
                    head = current.next;
                    current.next = null;
                }
                //case for tail
                else if (current == tail){
                    tail = prev;
                    prev.next = null;
                }
                //case for middle
                else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }

    public void deleteByLastName(String lastname){
        PhoneRecord current = head;
        PhoneRecord prev = head;
        while (current!= null){
            if (current.lastName.equals(lastname)){
                //case for head
                if (current == head){
                    head = current.next;
                    current.next = null;
                }
                //case for tail
                else if (current == tail){
                    tail = prev;
                    prev.next = null;
                }
                //case for middle
                else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }


    public void deleteAllMatchingLastName(String lastName){
        PhoneRecord current = head;
        PhoneRecord prev = head;
        boolean isDeleted = false;
        while (current!= null){
            if (current.lastName.equals(lastName)){
                //case for head
                if (current == head){
                    if (current == tail){
                        tail = head = null;
                    } else{
                        head = current.next;
                        current.next = null;
                    }
                }
                //case for tail
                else if (current == tail){
                    tail = prev;
                    prev.next = null;
                }
                //case for middle
                else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
                isDeleted = true;
            }
            if (isDeleted){
                current = prev;
                isDeleted = false;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }


    ArrayList<PhoneRecord> findAll(){
        ArrayList<PhoneRecord> list = new ArrayList<>();

        PhoneRecord current = head;

        while(current!=null){
            list.add(current);
            current=current.next;
        }

        return list;
    }
}