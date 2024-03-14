public class week4_student {

    // Replica of student class with corrections

    private String id;
    private String name;
    private String status;
    private String email;
   
    public week4_student(){
        this("33056897", "Keis Smit", "33056897@mynwu.ac.za"); //Uses this to call other constructor with params
    }

    public week4_student(String id, String name, String email){
        setId(id);
        setName(name);
        setEmail(email);
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getStatus(){
        return this.status;
    }

    public String getEmail(){
        return this.email;
    }

    public String toString(){
        return "Name: " + getName() + "\nid: " + getId() + "\nemail: " + getEmail(); // Use toString to test getMethods
    }

}