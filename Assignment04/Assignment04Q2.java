import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment04Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nEnter Nepali Currency: ");
        double rupees = myObj.nextDouble();
        double USDCurrency = converter(rupees);
        System.out.println("\nConverted Currency: ");
        System.out.println("Rs "+ rupees + " = " + "USD " + Double.parseDouble(new DecimalFormat("##.###").format(USDCurrency)));
    }
    public static double converter(double rupee){
        double USD = 135.03;
        return rupee * USD;
    }
}
