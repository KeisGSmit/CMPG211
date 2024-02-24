public class DoSomething {
    public static void main(String args[]) {
        byte i1;

        /*
         * Bytes have a value up until 125
         * exceeding that will result in a infinte loop
         *              |
         *              |
         *              |
         *              |
         *              \/
         */
        
        for (i1 = 1; i1 <= 255; i1++) 
            System.out.println(i1);
    }
}