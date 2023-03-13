import java.util.Scanner;
public class Assignment04Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number:");

        int userNum = myObj.nextInt();
        System.out.println("\n The Multiplication Table is: \n");
        for(int i = 1; i<=10; i++){
            System.out.println(userNum + " * " + i + " = " + userNum*i);
        }
    }
}
