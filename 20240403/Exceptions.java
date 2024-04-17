import java.util.Scanner;

public class Exceptions {

    public void setNumberOfStudents(int num) throws InvalidSizeException {
        if(num <= 0 || num > 50){
            throw new InvalidSizeException();
        }
    }
    public static void main(String[] args){
        Scanner scanner;
        try{
            scanner = new Scanner(System.in);

            Exceptions e1 = new Exceptions();

            e1.setNumberOfStudents(scanner.nextInt());

            // System.out.println("Enter a integer: ");
            // int num = Integer.parseInt(scanner.nextLine());


            // System.err.println("The number you entered: " + num);
        
            scanner.close();
            // // Trickle down Exceptioncatching
        }catch(InvalidSizeException e){
            System.err.println("There was a InvalidSizeException: " + e);
        }
        catch(NumberFormatException e){
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
