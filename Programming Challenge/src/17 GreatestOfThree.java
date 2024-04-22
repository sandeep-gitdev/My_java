import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest of Three\n");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();
        System.out.print("Enter your Third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " is the greatest number");
        } else if (second >= third) {
            System.out.println(second + " is the greatest number");
        } else {
            System.out.println(third + " is the greatest number");
        }


    }
}
