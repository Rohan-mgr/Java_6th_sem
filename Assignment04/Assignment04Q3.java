import java.util.Scanner;

public class Assignment04Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter length for Fibonacci Series: ");
        int num = myObj.nextInt();
        int sum = 0;
        System.out.println("Your Fibonacci Series is: ");
        for(int i = 0; i<num; i++){
            sum = Fibonacci(i);
            System.out.print(sum + " ");
        }

    }

    public static int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}

