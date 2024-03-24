// Must make class abstract
// Can not create instance but can inherit functionality
public abstract class week5_shape {
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

    // abstract = "I will not be providing a body for this method"
    // You will not be able to create an instance of this class
    public abstract float getArea();

    public String toString(){
        // Why does this work?  -> 
        // 1) super class object
        // 1.1) evething inherits from object
        return "The dimmension of the shape is: " + getDimention();
    }

}
