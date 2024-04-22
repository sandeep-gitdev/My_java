import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate simple interest: \n");
        System.out.println("Enter the principal amount: ");
        double p = input.nextDouble();
        System.out.println("Enter the time period: ");
        double t = input.nextDouble();
        System.out.println("Enter Rate of interest: ");
        double r = input.nextDouble();

        double sm = (p*t*r) / 100;

        System.out.println("Simple Interest is: " + sm);
    }
}
