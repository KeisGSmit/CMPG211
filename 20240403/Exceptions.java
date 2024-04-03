import java.util.Scanner;

public class Exceptions {
    
    public static void main(String[] args){
        Scanner scanner;
        try{
            scanner = new Scanner(System.in);

            System.out.println("Enter a integer: ");
            int num = Integer.parseInt(scanner.nextLine());


            System.err.println("The number you entered: " + num);
        
            scanner.close();
            // Trickle down Exceptioncatching
        }catch(NumberFormatException e){
            System.err.println("There was an error: " + e);
        }catch(Exception ex){
            System.err.println("There was an error: " + ex);

        }finally{       // Executes after exceptions were thrown

            // You can close db connections or scanners here
            System.err.println("The code is done executing");
        }
        

        try {
            scanner = new Scanner(System.in);

            System.err.println("Enter a divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            int results = 1/divisor;

            System.err.println("This is the result: " + results);

            scanner.close();
            
        }
        catch (ArithmeticException e) {
            System.err.println("go back to Grade 1: " + e);
        }
        catch(NumberFormatException e){
            System.err.println("There was an error: " + e);
        }
        finally{
            System.err.println("Code completed");
        }
    }
}
