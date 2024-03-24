public class week5_square extends week5_shape{
    week5_square(float dimension){
        super(dimension);
    }

    // You need to implement a method for the abstract method IF class esxtends from abstract class
    @Override // This is needed
    public float getArea(){
        return this.getDimention() * this.getDimention();
    }

    public static void main(String[] args){

        // Use of inheritance
        week5_square S1 = new week5_square(20);
        System.out.println(S1.getArea());

        week5_circle circ1 = new week5_circle(20);
        System.out.println(circ1.getArea());
    }
}
