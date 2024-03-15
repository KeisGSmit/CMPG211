/*
 * Name: Keis Smit
 * Student Number: 33056897
 */

 public class week4_staff extends week4_person{
    private String title;
    private String office;


    public week4_staff(){
        this(
            "33056897", 
            "Keis Smit", 
            "33056897@mynwu.ac.za", 
            "Sir"
            ); //Uses this to call other constructor with params
    }

    public week4_staff(String id, String name, String email, String title){
        super(id, name, email);
        setTitle(title);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public String getTitle(){
        return this.title;
    }

    public String getOffice(){
        return this.office;
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