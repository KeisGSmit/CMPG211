/*
 * Name: Keis Smit
 * Student Number: 33056897
 */

 public class week4_faculty{
    private String id;
    private String name;
    private String rank;
    private String office;
    private String email;

    public week4_faculty(){
        this("020508", "Head of NatSci", "NATSCI@mynwu.ac.za", "Head"); //Uses this to call other constructor with params
    }

    public week4_faculty(String id, String name, String email, String rank){
        setId(id);
        setName(name);
        setEmail(email);
        setRank(rank);
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRank(String rank){
        this.rank = rank;
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

    public String getRank(){
        return this.rank;
    }

    public String getEmail(){
        return this.email;
    }

    public String getOffice(){
        return this.office;
    }

    public String toString(){
        return "id: " + getId() + "\nname: " + getName() + "\nemail" + getEmail() + "\nrank: " + getRank(); // Use toString to test getMethods
    }

}