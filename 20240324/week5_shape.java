public class week5_shape {
    private float dimension;

    public week5_shape(){
        this((float) Math.random() * 10);
    }

    public week5_shape(float dimension){
        this.setDimension(dimension);
    }

    public float getDimention(){
        return this.dimension;
    }

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    public String toString(){
        // Why does this work?  -> 
        // 1) super class object
        // 1.1) evething inherits from object
        return super.toString();
    }

}
