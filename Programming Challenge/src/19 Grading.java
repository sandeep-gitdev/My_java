import java.util.Scanner;

class Grading {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Grade calculator\n");
         System.out.print("Please enter your percentage: ");
         float percentage = input.nextFloat();

         if (percentage >= 90) {
             System.out.println("Great, You have got A");
         } else if (percentage >= 75) {
             System.out.println("Good, You have got B");
         } else if (percentage >= 60) {
             System.out.println("You have got C");
         } else if (percentage >= 30) {
             System.out.println("You have got D");
         } else {
             System.out.println("Sorry, Yor are failed");
         }
     }
}
