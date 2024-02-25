public class House {
    int height;

    House(int height){
        this.height = height;
    }

    @Override
    public String toString(){
        return "This house is " + String.valueOf(height) + " meters tall.";          // height vs this.height?
    }

    public static void main(String[] args){
        House h1 = new House(10);
        House h2 = new House(20);
        House h3 = new House(30);

        System.out.println(h1.toString());
        System.out.println(h2);
        System.out.println(h3);

    }
}
