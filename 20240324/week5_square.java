public class week5_square extends week5_shape{
    week5_square(float dimension){
        super(dimension);
    }

    public float getArea(){
        return this.getDimention() * this.getDimention();
    }

    public static void main(String[] args){

        // Use of inheritance
        week5_square S1 = new week5_square(20);
        System.out.println(S1);

        // Create instance of superclass
        week5_shape shape1 = new week5_shape();
        System.out.println(shape1);


    }
}
