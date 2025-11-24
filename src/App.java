import java.util.*;
//Write a code that prints the sentence/word you put in to seperate letters and says how many letters there are.
//If there are more than 10 characters say its to big and if its less than 3 characters say its to small
// tell it to write another and say if its bigger or smaller than the other word and by how many charters

public class App {
    public static void main(String[] args) throws Exception {
        // Write setup code (if needed)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write somthing:");
        String letters = scanner.nextLine();
        if (letters.length() > 10) {
            System.out.println("To big");
        }else
        if (letters.length() < 3) {
            System.out.println("To small");
        } else {
            String[] parts = letters.split("");
            for (String i : parts) {
                System.out.println(i);
            }
            System.out.println("This has " + letters.length() + " character");
        }
        System.out.println("Give me somthing else");
        String word = scanner.nextLine();
        if (word.length()>letters.length()) {
            System.out.println(word + " is bigger than" + letters+ " by " + (word.length()-letters.length()) + " characters" );
        }
        else{System.out.println( word + " is smaller than " + letters + " by " + (letters.length()-word.length()) + " characters" );}
    }
}
