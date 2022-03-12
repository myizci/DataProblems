public class StackExampleApp {
    public static void main(String[] args) {

        var myStack = new MyStack<Integer>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println("size: "+myStack.size());
        System.out.println(myStack.pop());
        System.out.println("size: "+myStack.size());
        System.out.println(myStack.pop());
        System.out.println("size: "+myStack.size());






    }
}
