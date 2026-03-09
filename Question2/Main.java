package Question2;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression you want : ");
        String inputString = sc.nextLine();
        String[] tokens = inputString.split("\\s+");   
        sc.close();
        if (inputString.isEmpty()) {
            System.out.println("Input is empty.");
        } else {
            calculateRPN(tokens);
        }
        sc.close();
    }
    
    public static  void calculateRPN (String[] tokens){
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                if (stack.size() < 2) {
                    System.out.println("Invalid expression.");
                    return;
                }
                double b = stack.pop();
                double a = stack.pop();
       
                double result = switch (token) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> {
                        if (b == 0) {
                            System.out.println("Division by zero is not allowed.");
                        }
                        yield a / b;
                    }
                    default -> 0; 
                };
                stack.push(result);
            }
        }

    }
    
}

