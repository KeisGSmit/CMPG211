import java.util.Arrays;

public class week5_person implements Comparable<week5_person>{
    private String name;
    private int age;

    public week5_person(String name, int age){
        this.setAge(age);
        this.setName(name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAgeString(){
        return "Age: " + age;
    }

    @Override
    public String toString(){
        return "Person{" +
                "Name='" + name + '\'' +
                " age=" + age +
                '}';
    }

    @Override
    public int compareTo(week5_person person){
        return this.name.compareTo(person.name);
    }

    public static void main(String[] args){

        week5_person[] persons = new week5_person[5];

        persons[0] = new week5_person("Doe", 35);
        persons[1] = new week5_person("John", 25);
        persons[2] = new week5_person("Doe", 45);
        persons[3] = new week5_person("Jane", 30);
        persons[4] = new week5_person("Smith", 40);
        
        for(week5_person person: persons){
            System.err.println(person.getName());
        }

        Arrays.sort(persons);

        for(week5_person person: persons){
            System.err.println(person);
        }
    }
}