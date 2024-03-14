/*
 * Name: Keis Smit
 * Student Number: 33056897
 */
public class week4_testStudent {
    public static void main(String[] args){
        // default student information
        week4_student defStudent = new week4_student();
        System.out.println(defStudent.getEmail());
        System.out.println(defStudent.getId());
        System.out.println(defStudent.getName());
        System.out.println(defStudent.getStatus() + "\n \n");


        // custom student information
        week4_student customStudent = new week4_student("123568974", "Arnold Bigboy", "Arnold@muscles.co.za");
        
        System.out.println(customStudent.getEmail());
        System.out.println(customStudent.getId());
        System.out.println(customStudent.getName());
        System.out.println(customStudent.getStatus() + "\n \n");

        // Updating information

        customStudent.setStatus("Inactive");
        System.out.println(customStudent.getStatus());

        // checking toString method

        System.out.println(customStudent);

    }
}
