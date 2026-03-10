package Question2;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression you want : ");
        String inputString = sc.nextLine();  

        if (inputString.isEmpty()) {
            System.out.println("Input is empty");
        } else {
            String[] tokens = inputString.split("\\s+"); 
            calculateRPN(tokens);
        }
        sc.close();
    }
    
    public static  void calculateRPN (String[] tokens){
        Stack<Integer> rpnStack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                if (rpnStack.size() < 2) {
                    System.out.println("Not enough operands for the operator");
                    return;
                }
                int b = rpnStack.pop();
                int a = rpnStack.pop();
       
                int result = switch (token) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> {
                        if (b == 0) {
                            System.out.println("Division by zero is not allowed");
                            yield 0;    
                        }
                        yield a / b;
                    }
                    default -> 0; 
                };
                rpnStack.push((int) result);
            }
                else {
                try {
                    rpnStack.push(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid token" );
                    return;
                }
            }
        }
        if (rpnStack.size() == 1) {
            int finalResult = rpnStack.pop();
            System.out.println("Final Result : " + finalResult);
        } else {
            System.out.println("Invalid RPN structure");
        }
    }
}

