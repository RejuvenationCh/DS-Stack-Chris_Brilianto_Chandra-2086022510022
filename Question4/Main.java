package Question4;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input secret code : ");
        String inputString = sc.nextLine();  

        if (inputString.isEmpty()) {
            System.out.println("Input is empty");
        } else {
            String[] secretCodeInput = inputString.split("\\s+"); 
            stackingFormationInjection(secretCodeInput);
        }
        sc.close();
    }
    
    public static void stackingFormationInjection(String[] secretCodeInput) {
        Stack <Integer> codeStack = new Stack<>();

        for (String num : secretCodeInput) {
            codeStack.push(Integer.parseInt(num));
        }

        Stack<Integer> sortedStack = new Stack<>();

        while (!codeStack.isEmpty()) {
            int currentNum = codeStack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > currentNum) {
            codeStack.push(sortedStack.pop());
        }
        sortedStack.push(currentNum);
        }
        for (int i = 0; i < sortedStack.size(); i++) {
            System.out.print(sortedStack.get(i) + (i == sortedStack.size() - 1 ? "" : " "));
            }
            System.out.println();
     }
}
