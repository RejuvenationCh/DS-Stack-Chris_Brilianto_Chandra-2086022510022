package Question3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression you want : ");
        String inputTarget = sc.nextLine();  

        if (inputTarget.isEmpty()) {
            System.out.println("Input is empty");
        } else {
            String[] tokens = inputTarget.split("\\s+"); 
            processChrono(tokens);
        }
        sc.close();
    }
    
    public static void processChrono(String[] tokens) {
        if (tokens.length == 0) return;
        int targetChar = Integer.parseInt(tokens[0]);
        Stack<Long> targetStack = new Stack<>();

        for (int i = 1; i <= targetChar && i < tokens.length; i++){
            targetStack.push(Long.parseLong(tokens[i]));
        }

        generateInstructions(targetStack);
    }

    public static void generateInstructions(Stack<Long> targets){
        Stack<String> outputStack = new Stack<>();
        int totalSuffixPlus = 0;

        while (!targets.isEmpty()) {
            long totalValue = targets.pop() + totalSuffixPlus;


            String instructions = buildInstructions(totalValue);
            outputStack.push(instructions);
            
        
            totalSuffixPlus += countEvent(instructions, '+');
        }

    }
}