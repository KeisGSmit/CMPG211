public class DoSomethingElse {
    public static void main(String args[]) {
        int i1 = 32;
        int i2 = 11;
        int i3 = 7;
       
        double fp1 = i1 / 10.0;  // 32 / 10
        
        double fp2 = i2 / 10.0;  // 11 / 10
        
        double fp3 = i3 / 10.0;  // 7 / 10

        double sum = fp1 + fp2 + fp3;  // = 3.2 + 1.1 + 0.7 => 5(?)

        if ((5 - sum) != 0.0) {
            System.out.println("Something is wonky...");
            System.out.println("i1=" + i1 + ", i2=" + i2 + ", i3=" + i3 + ", fp1=" + fp1 + ", fp2=" + fp2 + ", fp3=" + fp3 + ", sum=" + sum);
        } else {
            System.out.println("All is fine!");
        }

        // Out put:
        /*  Something is wonky...
            i1=32, i2=11, i3=7, fp1=3.2, fp2=1.1, fp3=0.7, sum=5.000000000000001 <- This is the problem
        */
    }
}