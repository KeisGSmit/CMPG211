public class week5_shape {
    private float dimension;

    week5_shape(){
        this((float) Math.random() * 10);
    }

    week5_shape(float dimension){
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
        return super.toString();
    }

}
