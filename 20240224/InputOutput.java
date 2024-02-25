import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){

        // Scanner used to read input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        
        // nextLine() used to read the input
        String name = input.nextLine();

        // Input must be closed
        input.close();

        System.out.println("Welcome to CMPG211 " + name);

        System.out.printf("I hope you survive, %s\n ", name);
    }
}
