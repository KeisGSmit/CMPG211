public class DoSomethingElseB {
    public static void main(String args[]) {
        int i1, i2, i3;
        int error = 0;
        int count = 0;
        double fp1, fp2, fp3, sum;
        for (i1 = 1; i1 <= 50; i1++)
            for (i2 = 1;(i1 + i2) <= 50; i2++) {
                count++;
                i3 = 50 - (i1 + i2);
                fp1 = i1 / 10.0;
                fp2 = i2 / 10.0;
                fp3 = i3 / 10.0;
                sum = fp1 + fp2 + fp3;
                sum = Math.round(sum);
                if ((5 - sum) != 0.0) {
                    System.out.println("i1=" + i1 + ", i2=" + i2 + ", i3=" + i3 + ", fp1=" + fp1 + ", fp2=" + fp2 + ", fp3=" + fp3 + ", sum=" + sum);
                    error++;
                }
            }
        if (error == 0)
            System.out.println("There were no errors.");
        else System.out.println("There were " + error + " errors in " + count + " calculations!");
    }
}

/*
 i1=1, i2=41, i3=8, fp1=0.1, fp2=4.1, fp3=0.8, sum=4.999999999999999
i1=1, i2=43, i3=6, fp1=0.1, fp2=4.3, fp3=0.6, sum=4.999999999999999
i1=1, i2=46, i3=3, fp1=0.1, fp2=4.6, fp3=0.3, sum=4.999999999999999
i1=1, i2=48, i3=1, fp1=0.1, fp2=4.8, fp3=0.1, sum=4.999999999999999
i1=2, i2=44, i3=4, fp1=0.2, fp2=4.4, fp3=0.4, sum=5.000000000000001
i1=3, i2=41, i3=6, fp1=0.3, fp2=4.1, fp3=0.6, sum=4.999999999999999
i1=3, i2=46, i3=1, fp1=0.3, fp2=4.6, fp3=0.1, sum=4.999999999999999
i1=4, i2=37, i3=9, fp1=0.4, fp2=3.7, fp3=0.9, sum=5.000000000000001
i1=4, i2=42, i3=4, fp1=0.4, fp2=4.2, fp3=0.4, sum=5.000000000000001
i1=4, i2=44, i3=2, fp1=0.4, fp2=4.4, fp3=0.2, sum=5.000000000000001
i1=6, i2=38, i3=6, fp1=0.6, fp2=3.8, fp3=0.6, sum=4.999999999999999
i1=6, i2=41, i3=3, fp1=0.6, fp2=4.1, fp3=0.3, sum=4.999999999999999
i1=6, i2=43, i3=1, fp1=0.6, fp2=4.3, fp3=0.1, sum=4.999999999999999
i1=8, i2=41, i3=1, fp1=0.8, fp2=4.1, fp3=0.1, sum=4.999999999999999
i1=9, i2=32, i3=9, fp1=0.9, fp2=3.2, fp3=0.9, sum=5.000000000000001
i1=9, i2=37, i3=4, fp1=0.9, fp2=3.7, fp3=0.4, sum=5.000000000000001
i1=11, i2=32, i3=7, fp1=1.1, fp2=3.2, fp3=0.7, sum=5.000000000000001
i1=11, i2=37, i3=2, fp1=1.1, fp2=3.7, fp3=0.2, sum=5.000000000000001
i1=14, i2=28, i3=8, fp1=1.4, fp2=2.8, fp3=0.8, sum=4.999999999999999
i1=14, i2=33, i3=3, fp1=1.4, fp2=3.3, fp3=0.3, sum=4.999999999999999
i1=16, i2=27, i3=7, fp1=1.6, fp2=2.7, fp3=0.7, sum=5.000000000000001
i1=16, i2=32, i3=2, fp1=1.6, fp2=3.2, fp3=0.2, sum=5.000000000000001
i1=19, i2=23, i3=8, fp1=1.9, fp2=2.3, fp3=0.8, sum=4.999999999999999
i1=19, i2=28, i3=3, fp1=1.9, fp2=2.8, fp3=0.3, sum=4.999999999999999
i1=21, i2=22, i3=7, fp1=2.1, fp2=2.2, fp3=0.7, sum=5.000000000000001
i1=21, i2=27, i3=2, fp1=2.1, fp2=2.7, fp3=0.2, sum=5.000000000000001
i1=22, i2=21, i3=7, fp1=2.2, fp2=2.1, fp3=0.7, sum=5.000000000000001
i1=22, i2=26, i3=2, fp1=2.2, fp2=2.6, fp3=0.2, sum=5.000000000000001
i1=23, i2=19, i3=8, fp1=2.3, fp2=1.9, fp3=0.8, sum=4.999999999999999
i1=23, i2=24, i3=3, fp1=2.3, fp2=2.4, fp3=0.3, sum=4.999999999999999
i1=24, i2=23, i3=3, fp1=2.4, fp2=2.3, fp3=0.3, sum=4.999999999999999
i1=26, i2=22, i3=2, fp1=2.6, fp2=2.2, fp3=0.2, sum=5.000000000000001
i1=27, i2=16, i3=7, fp1=2.7, fp2=1.6, fp3=0.7, sum=5.000000000000001
i1=27, i2=21, i3=2, fp1=2.7, fp2=2.1, fp3=0.2, sum=5.000000000000001
i1=28, i2=14, i3=8, fp1=2.8, fp2=1.4, fp3=0.8, sum=4.999999999999999
i1=28, i2=19, i3=3, fp1=2.8, fp2=1.9, fp3=0.3, sum=4.999999999999999
i1=32, i2=9, i3=9, fp1=3.2, fp2=0.9, fp3=0.9, sum=5.000000000000001
i1=32, i2=11, i3=7, fp1=3.2, fp2=1.1, fp3=0.7, sum=5.000000000000001
i1=32, i2=16, i3=2, fp1=3.2, fp2=1.6, fp3=0.2, sum=5.000000000000001
i1=33, i2=14, i3=3, fp1=3.3, fp2=1.4, fp3=0.3, sum=4.999999999999999
i1=37, i2=4, i3=9, fp1=3.7, fp2=0.4, fp3=0.9, sum=5.000000000000001
i1=37, i2=9, i3=4, fp1=3.7, fp2=0.9, fp3=0.4, sum=5.000000000000001
i1=37, i2=11, i3=2, fp1=3.7, fp2=1.1, fp3=0.2, sum=5.000000000000001
i1=38, i2=6, i3=6, fp1=3.8, fp2=0.6, fp3=0.6, sum=4.999999999999999
i1=41, i2=1, i3=8, fp1=4.1, fp2=0.1, fp3=0.8, sum=4.999999999999999
i1=41, i2=3, i3=6, fp1=4.1, fp2=0.3, fp3=0.6, sum=4.999999999999999
i1=41, i2=6, i3=3, fp1=4.1, fp2=0.6, fp3=0.3, sum=4.999999999999999
i1=41, i2=8, i3=1, fp1=4.1, fp2=0.8, fp3=0.1, sum=4.999999999999999
i1=42, i2=4, i3=4, fp1=4.2, fp2=0.4, fp3=0.4, sum=5.000000000000001
i1=43, i2=1, i3=6, fp1=4.3, fp2=0.1, fp3=0.6, sum=4.999999999999999
i1=43, i2=6, i3=1, fp1=4.3, fp2=0.6, fp3=0.1, sum=4.999999999999999
i1=44, i2=2, i3=4, fp1=4.4, fp2=0.2, fp3=0.4, sum=5.000000000000001
i1=44, i2=4, i3=2, fp1=4.4, fp2=0.4, fp3=0.2, sum=5.000000000000001
i1=46, i2=1, i3=3, fp1=4.6, fp2=0.1, fp3=0.3, sum=4.999999999999999
i1=46, i2=3, i3=1, fp1=4.6, fp2=0.3, fp3=0.1, sum=4.999999999999999
i1=48, i2=1, i3=1, fp1=4.8, fp2=0.1, fp3=0.1, sum=4.999999999999999
There were 56 errors in 1225 calculations!
 */

 // This is because double stores twice as many bites in memory
 // to fix: Math.round()