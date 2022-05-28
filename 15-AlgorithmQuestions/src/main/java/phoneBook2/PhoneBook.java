package phoneBook2;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    PhoneRecord head;
    PhoneRecord tail;
    int size;

    public void printPhoneBook(){
        PhoneRecord iterator=head;
        while(iterator!=null){
            System.out.println(iterator);
            iterator=iterator.next;
        }
    }


    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();

        PhoneRecord record = new PhoneRecord("John", "Doe", "jd@mail.com", "1111");
        phoneBook.head=record;
        for(int i=0;i<10;i++){
            record.next=new PhoneRecord("John"+i,"Doe"+i,"jd@mail.com","1111"+i);
            record=record.next;
            phoneBook.size++;
        }
        phoneBook.printPhoneBook();

        System.out.println(phoneBook.findByName("John6"));
    }

    public String findByName(String name){
        PhoneRecord current=head;
        while(current!=null){
            if(current.name.equals(name)){
                return current.phoneNumber;
            }
            current=current.next;
        }
        return "No record!!!";
    }

    public String findByLastName(String lastName){
        PhoneRecord current=head;
        while(current!=null){
            if(current.lastName.equals(lastName)){
                return current.phoneNumber+" "+current.lastName;
            }
            current=current.next;
        }
        return "No Record is found!";
    }

    public List<PhoneRecord> findAllByLastName(String lastName){
        PhoneRecord current=head;
        List<PhoneRecord> recordList=new ArrayList<>();
        while(current!=null){
            if(current.lastName.equals(lastName)){
                recordList.add(current);
            }
            current=current.next;
        }
        return recordList;
    }

    public List<PhoneRecord> findAll(){
        PhoneRecord current=head;
        List<PhoneRecord> recordList=new ArrayList<>();

        while(current!=null){
            recordList.add(current);
            current=current.next;
        }
        return recordList;
    }
}
