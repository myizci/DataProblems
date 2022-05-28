package phoneBook;

public class PhoneRecord {
    private static final String DEFAULT_MESSAGE = "No Data Available";

    String firstName;
    String lastName;
    String email;
    Long phoneNumber;
    PhoneRecord next;

    public PhoneRecord() {
    }

    public PhoneRecord(String firstName, String lastName, String email, Long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ']';
    }


}
