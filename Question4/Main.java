package Question4;

import java.util.Scanner;

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
        
    }
}
