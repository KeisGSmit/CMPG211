/*
 * Name: Keis Smit
 * Student Number: 33056897
 */

 public class week4_faculty extends week4_employees{
    private String rank;
    //constructors
    public week4_faculty(){
        this(
            "020508", 
            "Head of NatSci", 
            "NATSCI@mynwu.ac.za", 
            "Head",
            "office"
            ); //Uses this to call other constructor with params
    }

    public week4_faculty(
        String id, String name, String email, String rank, String Office
        ){
        super(id, name, email, Office);
        setRank(rank);
    }

    // Mutators
    public void setRank(String rank){
        this.rank = rank;
    }


    // Accessors
    public String getRank(){
        return this.rank;
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