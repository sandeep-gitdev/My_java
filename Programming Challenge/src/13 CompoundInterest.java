import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Compound interest \n");
        System.out.println("Enter principle amount: ");
        int p = input.nextInt();
        System.out.println("Enter rate of interest: ");
        float r = input.nextFloat();
        System.out.println("Enter time period: ");
        float t = input.nextFloat();

        double ci = p * Math.pow((1 + r / 100), t);
        System.out.println("Your compound interest is Rs: " + ci);

    }
}
