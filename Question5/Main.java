package Question5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Velocity (n): ");
        int inputMomentum = sc.nextInt();
        calculateMomentum(inputMomentum);
        sc.close();

    }
    public static void calculateMomentum(Integer inputMomentum) {
        Stack<Integer> currentNumber = new Stack<>();
        Integer tempNum = inputMomentum;

        while (tempNum >= 1){
            currentNumber.push(tempNum);
            tempNum = tempNum/2;
        }
        while (!currentNumber.isEmpty()){
            System.out.print(currentNumber.pop() + (currentNumber.size() > 0 ? " ": ""));
        }
        System.out.println();
    
        
    }
}
