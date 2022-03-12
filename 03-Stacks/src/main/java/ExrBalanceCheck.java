import java.util.Scanner;

public class ExrBalanceCheck {
    public static void main(String[] args) {
        System.out.println("Enter expression : ");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        System.out.println(balanceCheck(expression));

    }

    public static boolean balanceCheck(String expr){

        MyStack<Character> myStack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {

            Character ch = expr.charAt(i);

            if(ch!='(' && ch!='['&&ch!='{'&&ch!=')'&&ch!=']'&&ch!='}') continue;

            if(ch=='(' ||ch=='['||ch=='{'){
                myStack.push(ch);
                continue;
            }

            if(myStack.isEmpty()) return false;

            char match;
            switch(ch){
                case ')':
                    match= myStack.pop();
                    if(match!='(' ) return false;
                    break;

                case ']':
                    match= myStack.pop();
                    if(match!='[' ) return false;
                    break;

                case '}':
                    match= myStack.pop();
                    if(match!='{' ) return false;
                    break;

            }
        }
        return myStack.isEmpty();
    }
}
