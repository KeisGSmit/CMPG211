/*
 * Name: Keis Smit
 * Student Number: 33056897
 */

 public class week4_staff extends week4_employees{
    private String title;


    public week4_staff(){
        this(
            "33056897", 
            "Keis Smit", 
            "33056897@mynwu.ac.za", 
            "Sir",
            "office"
            ); //Uses this to call other constructor with params
    }

    public week4_staff(String id, String name, String email, String title, String Office){
        super(id, name, email, Office);
        setTitle(title);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return "Staff: \n" +
        "\tid: " + getId() + 
        "\n\tname: " + getName() + 
        "\n\temail: " + getEmail() + 
        "\n\tTitle: " + getTitle() +
        "\n\tOffice: " + getOffice(); // Use toString to test getMethods
    }

}