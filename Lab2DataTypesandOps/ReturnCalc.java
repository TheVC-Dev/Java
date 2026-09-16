import java.util.Scanner;

class ReturnCalc{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How much to count? ");
        double val = in.nextDouble();


        int cents = (int) Math.round(val * 100);

        int quarters = cents / 25;
        cents = cents % 25;

        int dimes = cents / 10;
        cents = cents % 10;

        int nickels = cents / 5;
        cents = cents % 5;

        System.out.print("Q: " + quarters);
        System.out.print("D: " + dimes);
        System.out.print("N: " + nickels);
        System.out.print("C: " + cents);

    } 
}
