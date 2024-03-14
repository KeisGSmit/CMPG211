public class week4 {

    private String id;
    private String name;
    private String status;
    private String email;
   
    public week4(){
        setId("33056897");
        setEmail("33056897@mynwu.ac.za");
        setName("Keis Smit");
        setStatus("Active");
    }

    public week4(String id, String name, String email){
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
        return "Too much data to output. please call getter methods individually";
    }

}