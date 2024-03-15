public class week4_employees extends week4_person {

    private String office;

    public week4_employees(){
        this("12344556", "Default", "default@email.com", "TBD");
    }
    public week4_employees(String id, String name, String email, String office){
        super(id, name, email);
        this.setOffice(office);
    }

    // Mutator
    public void setOffice(String office){
        this.office = office;
    }

    // Accessor
    public String getOffice(){
        return this.office;
    }

    public String toString(){
        return "Employee: \n" +
        "\tid: " + getId() +
        "\n\tname: " + getName() + 
        "\n\temail" + getEmail() + 
        "\n\toffice: " + getOffice(); // Use toString to test getMethods
    }




}
