// Use implements to extend interfaces
// many interfaces to one class unlike parent class

public class week5_circle extends week5_shape{
    
    public week5_circle(float dimension){
        super(dimension);
    }

    public week5_circle(){
        super();
    }


    // without extending interfaces this @Override would give an error


    // This will need to override methods of abstract interface/class
    @Override
    public float getArea(){
        return this.getDimention() * this.getDimention() * (float)Math.PI;
    }

    @Override
    public float getPermimeter(){
        return 2 * (float)Math.PI * getDimention();
    }


}
