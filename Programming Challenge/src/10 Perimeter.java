import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("find the Perimeter of Rectangle:\n");
        System.out.println("Enter A side of Rectangle: ");
        int A = input.nextInt();
        System.out.println("Enter B side of Rectangle: ");
        int B = input.nextInt();
        System.out.println("Enter C side of Rectangle: ");
        int C = input.nextInt();
        System.out.println("Enter D side of Rectangle: ");
        int D = input.nextInt();
        int per = A+B+C+D ;

        System.out.println("Perimeter of Rectangle: " + per);


    }
}
