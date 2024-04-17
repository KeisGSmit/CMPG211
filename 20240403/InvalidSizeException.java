public class InvalidSizeException extends Exception{

    InvalidSizeException(){
        this("Standard Exception. No issues found");
    }

    InvalidSizeException(String message){
        super(message);
    }
}