public class TrySomething { 
    public static void main(String[] args) { 
        double d1 = 0; 
        double d2 = 123; 
        double d3; 
        double d4; 
        d3 = d1 / d1; 
        // 0.0 / 0.0 = NaN
        System.out.println(d1 + " / "+ d1 + " = "+d3); 
        d4 = d2 / d1;
        // 123.0 / 0.0 = Infinity 
        System.out.println(d2 + " / "+ d1 + " = "+d4); 
    } 
}
