import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Add two numbers: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 :");
        int num1 = input.nextInt();
        System.out.print("Enter num2 :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("sum of two numbers :" + sum);
    }
}
