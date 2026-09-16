import java.util.Scanner;

public class GalToL{

    public static double galToL(double gallons){
        return gallons * 3.7856;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in gallons: ");
        double gallons = scanner.nextDouble();

        double litres = galToL(gallons);

        System.out.printf("%.2f gallons translates to %.2f litres%n", gallons, litres);

        scanner.close();

    }
}
