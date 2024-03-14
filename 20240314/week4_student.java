public class week4_student extends week4_person{

    // Replica of student class with corrections

    private String id;
    private String name;
    private String status;
    private String email;
   
    public week4_student(){
        this("33056897", "Keis Smit", "33056897@mynwu.ac.za"); //Uses this to call other constructor with params
    }

    public week4_student(String id, String name, String email){
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setStatus("Temporary lecturer");
    }

    // mutators
    public void setStatus(String status){
        this.status = status;
    }


    // accessors
    public String getStatus(){
        return this.status;
    }

    // toString method
    public String toString(){
        return "Name: " + getName() + "\nid: " + getId() + "\nemail: " + getEmail(); // Use toString to test getMethods
    }

}