package Question1;

public class Main {
    String input;
    public static void main(String[] args) {
        String input;
        System.out.print("Enter a string : ");
        input = System.console().readLine();
        System.out.println("Checking if the string is balanced...");
        is_Balanced(input);
    }
    public static void is_Balanced(String str) {
        String notBalanced = "The string is not balanced.";
        String isPerfectlyBalanced = "The string is perfectly balanced.";
        int inputLength = str.length();
        if (inputLength % 2 != 0) {
            System.out.println(notBalanced);
            return;
        }
        System.out.println(isPerfectlyBalanced);
        return;
        
    }

} 