public class week4_student extends week4_person{

    // Replica of student class with corrections

    private String status;
   
    public week4_student(){
        this("33056897", "Keis Smit", "33056897@mynwu.ac.za"); //Uses this to call other constructor with params
    }

    public week4_student(String id, String name, String email){
        /* 
        same as *this* key work
            call as function
            invoke contructor of the super class
            super.setId(id) == this.setId(id) but "points" to super class
        */
        super(id, name, email); 
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