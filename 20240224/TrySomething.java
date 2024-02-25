public class TrySomething {

    static int myVal = 20; 
    public int myDifferentVal = 15;
    
    public static void main(String[] args){
        // myVal is static to the class
        System.out.println(TrySomething.myVal);

        TrySomething t = new TrySomething();
        // myDifferentVal is not static and needs to be intialised
        System.out.println(t.myDifferentVal);
    }
}