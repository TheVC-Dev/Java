
import java.util.Scanner;

public class LToGal{

    public static double lToGal(double gallons){
        return gallons / 3.7856;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in litres: ");
        double litres = scanner.nextDouble();

        double gallons =  lToGal(litres);
        System.out.printf("%.2f litres translates to %.2f gallons%n", litres, gallons);

        scanner.close();

    }
}
