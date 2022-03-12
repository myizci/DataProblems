import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class reverseFirstFElementsQueue {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i < 6; i++) {
            queue.add(i);
        }
        System.out.println("Original queue" + queue);
        ReverseFirstK(queue, 3);

    }

    public static Deque<Integer> ReverseFirstK(Deque<Integer> queue, int k){
        //0,1,2,3,4
        // create a stack and add first k elements  stack[0 1 2]  => [2,1,0,3,4] dequeue and enqueue last elements to fix the order

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        System.out.println("K elements removed " + queue);
        System.out.println("K elements are pushed to stack "+ stack);


        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println("Stack is emptied and added to queue" + queue);


        for (int i = 0; i < queue.size()-k; i++) {
            queue.add(queue.remove());
        }
        System.out.println("Unchanged elements are removed and re added to queue" + queue);
        return queue;
    }
}
