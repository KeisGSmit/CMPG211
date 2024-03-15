public class week4_testPerson {
    public static void main(String[] args){
    // Need to account for new super class
    // Test person constructor and methods
        week4_person p1 = new week4_person("25648997", "Person", "person@email.com");
        System.out.println(p1);

    
    // Test student constructor and all Student methods
        week4_student s1 = new week4_student(
        "99584762", 
        "linda", 
        "linda@student.com");

        System.out.println(s1);

    // Test Faculty constructor and all Faculty methods

        week4_faculty f1 = new week4_faculty(
        "35684745", 
        "Siema", 
        "siema@faculty.com",
         "Admin");

        System.out.println(f1);

    // Test Staff constructor and all Staff methods

        week4_staff st1 = new week4_staff(
            "345844725", 
            "john", 
            "john@staff.com", 
            "Prof");
        
        System.out.println(st1);
    } 
    
}
