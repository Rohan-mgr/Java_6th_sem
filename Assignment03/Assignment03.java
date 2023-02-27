import java.util.Scanner; 
import java.lang.Math;

public class Assignment03 {
    public static void main(String[] args){

        Scanner inputObj = new Scanner(System.in);
        int turn = 5;
        for(int i=5; i>0; i--){
            double randomNo = Math.floor((Math.random() * 10) + 1);
            System.out.println("Guess the number between 1-10:");
            double userInput = inputObj.nextDouble();

            System.out.println("\nGame Result: ");
            System.out.println("System Generated Random No: "+randomNo);
            System.out.println("User Input No: "+userInput + "\n");

            if(randomNo == userInput) {
                System.out.println("Hurray! you guess the correct number.\n");
                break;
            } else {
                System.out.println("Sorry! your guess was wrong. Try Again(Turn left: " + (--turn) + ")\n");
            }
        }
    }
}