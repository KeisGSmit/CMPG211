/*
 * Name: Keis Smit
 * Student Number: 33056897
 */

public class week4_testFaculty {
    public static void main(String[] args){
        // Creating a default faculty

        week4_faculty defaultFaculty = new week4_faculty();

        System.out.println(defaultFaculty.getId());
        System.out.println(defaultFaculty.getName());
        System.out.println(defaultFaculty.getRank());
        System.out.println(defaultFaculty.getEmail());
        System.out.println(defaultFaculty.getOffice() + "\n");

        // Creating a custom faculty

        week4_faculty customFaculty = new week4_faculty("225896663", "Engineering", "Depression@myMentalHealth.co.za", "Last");

        System.out.println(customFaculty.getId());
        System.out.println(customFaculty.getName());
        System.out.println(customFaculty.getRank());
        System.out.println(customFaculty.getEmail());
        System.out.println(customFaculty.getOffice() + "\n");

        // editing information

        customFaculty.setOffice("Away from me");
        System.out.println(customFaculty.getOffice());

        // default string output
        System.out.println(customFaculty);
    }
}
