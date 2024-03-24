public class week5_square extends week5_shape{
    week5_square(float dimension){
        super(dimension);
    }

    // You need to implement a method for the abstract method IF class esxtends from abstract class
    @Override // This is needed
    public float getArea(){
        return this.getDimention() * this.getDimention();
    }

    @Override
    public float getPermimeter(){
        return (float)4* getDimention();
    }

    public static void main(String[] args){

        // // Use of inheritance
        // week5_square S1 = new week5_square(20);
        // System.out.println(S1.getPermimeter());

        // week5_circle circ1 = new week5_circle(20);
        // System.out.println(circ1.getPermimeter());

        // Wild idea -> polymorphism -> reads square as a shape not as a square
        week5_shape shape1 = new week5_square(10);
        System.out.println(shape1);

        // ^ This is useful when it comes to arrays

        week5_shape[] arrShapes = {new week5_square(10), new week5_circle(20)};

        for(int i= 0; i < arrShapes.length ; i ++ ){
            System.err.println(arrShapes[i]);
        }
    }
}
