/*
 * Name: Keis Smit
 * Student Number: 33056897
 */

 public class week4_faculty extends week4_person{
    private String rank;
    private String office;

    //constructors
    public week4_faculty(){
        this(
            "020508", 
            "Head of NatSci", 
            "NATSCI@mynwu.ac.za", 
            "Head"
            ); //Uses this to call other constructor with params
    }

    public week4_faculty(
        String id, String name, String email, String rank
        ){
        super(id, name, email);
        setRank(rank);
    }

    // Mutators
    public void setRank(String rank){
        this.rank = rank;
    }
    
    public void setOffice(String office){
        this.office = office;
    }

    // Accessors
    public String getRank(){
        return this.rank;
    }

    public String getOffice(){
        return this.office;
    }

    // toString Methods
    public String toString(){
        return "Faculty: \n" +
        "\tid: " + getId() +
        "\n\tname: " + getName() + 
        "\n\temail" + getEmail() + 
        "\n\trank: " + getRank() +
        "\n\toffice: " + getOffice(); // Use toString to test getMethods
    }

}