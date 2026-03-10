package Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        
        int stackSize = codeStack.size();
        for (int i = 1; i < stackSize; i++) {
            Stack<Integer> sortedStack = new Stack<>();
            for (int j = 0; j < i; j++) {
               if (!codeStack.isEmpty()) {
                   sortedStack.add(codeStack.pop());

                   while (!sortedStack.isEmpty() && sortedStack.peek()) {
                    
                   }
               }
            }
            
            
        }
        

    }
}