/*
 * Name: Keis Smit
 * Student Number: 33056897
 */

 public class week4_staff{
    private String id;
    private String name;
    private String title;
    private String office;
    private String email;

    public week4_staff(){
        this("33056897", "Keis Smit", "33056897@mynwu.ac.za", "Sir"); //Uses this to call other constructor with params
    }

    public week4_staff(String id, String name, String email, String title){
        setId(id);
        setName(name);
        setEmail(email);
        setTitle(title);
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getTitle(){
        return this.title;
    }

    public String getEmail(){
        return this.email;
    }

    public String getOffice(){
        return this.office;
    }

    public String toString(){
        return "id: " + getId() + "\nname: " + getName() + "\nemail: " + getEmail() + "\n Title: " + getTitle(); // Use toString to test getMethods
    }

}