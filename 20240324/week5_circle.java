public class week5_circle extends week5_shape{
    
    public week5_circle(float dimension){
        super(dimension);
    }

    public week5_circle(){
        super();
    }

    public String getMessage(){
        return "Hello";
    }

    @Override
    public float getArea(){
        return this.getDimention() * this.getDimention() * (float)Math.PI;
    }

    @Override
    public float getPermimeter(){
        return 2 * (float)Math.PI * getDimention();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
