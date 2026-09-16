import java.util.Scanner;

public class Mars{

    public static double marsWeightCalc(double weight){
        return weight * 0.37;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        double marsWeight =  marsWeightCalc(weight);
        System.out.printf("%.1f kg on Earth translates to %.1f kg on Mars!%n", weight, marsWeight);

        scanner.close();

    }
}
