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
        sc.close();
    }
    public static void is_balanced(String inputString) {
           if (inputString.length() % 2 != 0) {
            System.out.println("The string is not balanced.");
        }
        
            else {
                char[] brackets = inputString.toCharArray();
                Stack<Character> inputStack = new Stack<>();
                boolean isBalanced = true;

                for (char bracket : brackets) {
                    if (bracket == '(' || bracket == '{' || bracket == '[') {
                        inputStack.push(bracket);
                    }
                    else if (bracket == ')' || bracket == '}' || bracket == ']') {
                        if (inputStack.isEmpty()) {
                            isBalanced = false;
                            break;
                        }
                        char top = inputStack.pop();
                        if ((bracket == ')' && top != '(') ||
                            (bracket == '}' && top != '{') ||
                            (bracket == ']' && top != '[')) {
                            isBalanced = false;
                            break;
                        }
                    }

                    if (isBalanced && inputStack.isEmpty()) {
                        System.out.println("The string is balanced.");
                    } else {
                        System.out.println("The string is not balanced.");
                    }
                }
            }
            }

        

} 