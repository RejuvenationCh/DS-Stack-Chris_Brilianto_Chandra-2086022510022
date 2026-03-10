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

        while (!outputStack.isEmpty()) {
            System.out.print(outputStack.pop());
        }
        System.out.println();
    }

    public static String buildInstructions(long inputTargetValue){
        if (inputTargetValue == 1) return "1";
        StringBuilder sb = new StringBuilder("1");
        String bin = Long.toBinaryString(inputTargetValue);
        for (int i = 1; i < bin.length(); i++) {
            sb.append("d+");
            if (bin.charAt(i) == '1') {
                sb.append("1+");
            }
        }
        return sb.toString();
    }

    public static int countEvent(String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
        }
        return count;
    }
}