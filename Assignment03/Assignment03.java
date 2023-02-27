import java.util.Scanner; 
import java.lang.Math;

public class Assignment03 {
    public static void main(String[] args){
        double randomNo = Math.floor((Math.random() * 10) + 1);

        Scanner inputObj = new Scanner(System.in);
        System.out.println("Guess the number between 1-10:");

        double userInput = inputObj.nextDouble();

        System.out.println("\nGame Result: ");
        System.out.println("System Generated Random No: "+randomNo);
        System.out.println("User Input No: "+userInput + "\n");

        if(randomNo == userInput) {
            System.out.println("Hurray! you guess the correct number.");
        } else {
            System.out.println("Sorry! your guess was wrong\n");
        }
    }
}