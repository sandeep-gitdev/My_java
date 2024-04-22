import java.util.Scanner;

class Airthmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic calculator\n");
        System.out.println("Please enter first number: ");
        int first = input.nextInt();
        System.out.println("Please enter second number: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int multi = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: " + add);
        System.out.println("subtraction is: " + sub);
        System.out.println("Multiplication is: " + multi);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);




    }
}
