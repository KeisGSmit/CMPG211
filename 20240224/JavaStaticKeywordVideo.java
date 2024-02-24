public class JavaStaticKeywordVideo {
    
    String name;
    static int numberOfFriends;

    // There is no main() method
    // Instead there is a method with the same name at the class? 
    // Why is this allowed? 

    JavaStaticKeywordVideo(String name){
        this.name = name;
    }

    static void createFriend(String name){
        JavaStaticKeywordVideo friend = new JavaStaticKeywordVideo("Keis");

        friend.name = "Pieter";
    }

}

// Conslusion:
// 1) you must have a main method OR the name of the class as a function.