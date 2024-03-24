public class week5_circle extends week5_shape{
    
    public week5_circle(float dimension){
        super(dimension);
    }

    public float getArea(){
        return this.getDimention() * this.getDimention() * (float)Math.PI;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
