public class LessonNotes {
    public static void main(String[] args){
        boolean A = false;
        boolean B = false;

        if(A && B){
            System.err.println("True");
        }
        if(!A && B){
            System.err.println("True");
        }
        if(A && !B){
            System.err.println("True");
        }
        if(!A && !B){
            System.err.println("True");
        }

    }
    
}
