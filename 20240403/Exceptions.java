import java.util.Scanner;

public class Exceptions {
    
    public static void main(String[] args){

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a integer: ");
            int num = Integer.parseInt(scanner.nextLine());

            scanner.close(); // Add this KEIS!!!!!

            System.err.println("The number you entered: " + num);
        

            // Trickle down Exception catching
        }catch(NumberFormatException e){
            System.err.println("There was an error: " + e);
        }catch(Exception ex){
            System.err.println("There was an error: " + ex);

        }finally{       // Executes after exceptions were thrown

            System.err.println("The code is done executing");
        }
        
    }
}
