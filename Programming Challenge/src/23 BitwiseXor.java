import java.util.Scanner;

class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Xor operator\n");
        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Result is: " + result);
    }
}
