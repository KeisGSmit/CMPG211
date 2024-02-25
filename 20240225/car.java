/*
 * Class vs Object (instance)
 * Class;
 * 1. Blueprint
 * 2. instruction how this data is stored in memory
 * 3. has fields and methods each with declarations on how they behave (method logic, return type, access modifiers)
 * 
 * Object (class instance);
 * 1. Contructed using the new keyword and the name of the class
 * 2. Has all the fields and methods of the class but with values 
 */

public class car {
    // fields
    String brand;
    static String message = "hello";

    //methods
    void honk(){
        System.out.println("HONK!");
    }

    void tellMeTheBrand(){
        System.out.println(this.brand);
    }

    // constructor method
    car(String brand){
        this.brand = brand;
    }

    public static void main(String[] args){

        car car1 = new car("BMW");
        car car2 = new car("Toyota");

        car1.honk();
        car1.tellMeTheBrand();
        car2.tellMeTheBrand();

        // car2.message = "hi"; <-- static (changes for all)
        // car1.brand = "Mazda"; <-- Dynamic (changes for 1)
        System.out.println(car.message);
    }
}
