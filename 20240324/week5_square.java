public class week5_square extends week5_shape implements week5_derivatives{
    week5_square(float dimension){
        super(dimension);
    }

    public week5_square(){
        super();
    }

    // You need to implement a method for the abstract method IF class esxtends from abstract class
    //@Override // This is needed
    public float getArea(){
        return this.getDimention() * this.getDimention();
    }

    //@Override
    public float getPermimeter(){
        return (float)4* getDimention();
    }

    public static void main(String[] args){

        // week5_shape[] shapes = new week5_shape[20];

        // // populate with different objects that extend from super class
        // for(int i = 0; i < 10 ; i ++){
        //     shapes[i] = new week5_square();
        // }
        // for(int i = 10; i < 20 ; i ++){
        //     shapes[i] = new week5_circle();
        // }

        // // can call superclass methods
        // for(int i = 0 ; i < 20; i++){
        //     System.out.println(shapes[i].getPermimeter());

        // }
        
        week5_circle c2 = new week5_circle();
        // System.out.println(c2.getDoubleArea());
        System.out.println(c2.getArea());
    }
}
