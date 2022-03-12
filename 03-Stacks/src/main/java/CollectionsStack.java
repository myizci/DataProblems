import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class CollectionsStack {
    public static void main(String[] args) {

        Stack<Integer> sStack = new Stack<>(); // extending the vector class , so synchronised , so slow in nature
        Deque<Integer> stack = new LinkedList<>(); //

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println("top of the stack: " + stack.peek());
        System.out.println("stack elements are = ");
        stack.forEach(System.out::print);
        stack.pop();
        stack.pop();
        System.out.println("\nUpdated stack");
        stack.forEach(System.out::print);
    }
}
