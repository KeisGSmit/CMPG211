public class week4_person {
    // common variables/attributes
    private String id;
    private String name;
    private String email;

    // Constructors
    public week4_person(){
        this(
            "33056897", 
            "Keis Smit", 
            "33056897@mynwu.ac.za"
            );
    }

    public week4_person(String id, String name, String email){
        setId(id);
        setName(name);
        setEmail(email);
    }

    // Mutators
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // Accessors
    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String toString(){
        return 
        "id: " + getId() + "\n" +
        "name: " + getName() + "\n" +
        "email: " + getEmail();
    }

}
