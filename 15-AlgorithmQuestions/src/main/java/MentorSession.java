public class MentorSession {
    public static void main(String[] args) {


        String str="abc"; // object 1 in stringPool

       str.concat("def"); // why nothing is happening?  // object 2 in stringPool
        // destined to be garbage on runtime


        System.out.println(str);

    }
}
