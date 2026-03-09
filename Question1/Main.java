package Question1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    String input;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is balanced or not: ");
        String inputString = sc.nextLine();
        is_balanced(inputString);
    }
    public static void is_balanced(String inputString) {
        boolean isBalanced = false;
        for (int i = 0; i < inputString.length(); i++) {
            if (i % 2 != 0) {
                break;
            }
            else {
                char[] brackets = inputString.toCharArray();
                Stack<Character> inputStack = new Stack<>();

                for (char bracket : brackets) {
                    if (bracket == '(' || bracket == '{' || bracket == '[') {
                        inputStack.push(bracket);
                    }
                    else if (bracket == ')' && !inputStack.isEmpty() && inputStack.peek() == '(') {
                        inputStack.pop();
                    }
                    else if (bracket == '}' && !inputStack.isEmpty() && inputStack.peek() == '{') {
                        inputStack.pop();
                    }
                    else if (bracket == ']' && !inputStack.isEmpty() && inputStack.peek() == '[') {
                        inputStack.pop();
                    }
                    else {
                        isBalanced = false;
                        break;
                    }
    
                }
            }

                
            }

          if (isBalanced) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
        

} 
}