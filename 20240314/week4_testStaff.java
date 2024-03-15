/*
 * Name: Keis Smit
 * Student Number: 33056897
 */
public class week4_testStaff {
    public static void main(String[] args){
        // Creating a default staff member
        week4_staff defaultStaff = new week4_staff();

        // validating default values have been set
        System.out.println("Default staff member details");
        System.out.println(defaultStaff.getEmail());
        System.out.println(defaultStaff.getId());
        System.out.println(defaultStaff.getName());
        System.out.println(defaultStaff.getOffice());
        System.out.println(defaultStaff.getTitle() + "\n \n");
        
        // Creating a custom Staff member

        week4_staff customStaff = new week4_staff("4128579", "Pieter Slabbert", "Email@email.co.za", "Your flatness");
        
        System.out.println("custom staff member details");
        System.out.println(customStaff.getEmail());
        System.out.println(customStaff.getId());
        System.out.println(customStaff.getName());
        System.out.println(customStaff.getOffice()); // this returns null as expected as it was not set in constructor
        System.out.println(customStaff.getTitle() + "\n \n" );

        // Changing a variable's value

        customStaff.setOffice("HB56-6");

        System.out.println(customStaff.getOffice());

        // Test to see if toString has changed

        System.out.println(customStaff);
    }
}
