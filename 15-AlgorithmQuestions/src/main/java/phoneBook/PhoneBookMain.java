package phoneBook;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneRecord record1 = new PhoneRecord("Omer", "Toksoz", "otoksoz@gmail.com", 1234567788L);
        PhoneRecord record2 = new PhoneRecord("Halid", "Toksoz", "htoksoz@gmail.com", 345213344L);
        PhoneRecord record3 = new PhoneRecord("Nukhet", "Toksoz", "nutoksoz@gmail.com", 6785439988L);
        PhoneRecord record4 = new PhoneRecord("Nimet", "Kilinc", "nitoksoz@gmail.com", 4321235566L);
        PhoneRecord record5 = new PhoneRecord("Omer", "Hamza", "nitoksoz@gmail.com", 4321235566L);
        PhoneRecord record6 = new PhoneRecord("Omer", "Firat", "nitoksoz@gmail.com", 4321235566L);

        PhoneBookList list = new PhoneBookList();
        list.addRecord(record1);
        list.addRecord(record2);
        list.addRecord(record3);
        list.addRecord(record4);
        list.addRecord(record5);
        list.addRecord(record6);

        list.printRecords();
        System.out.println("--");
        list.deleteAll("toksoz");
        list.printRecords();



    }
}
