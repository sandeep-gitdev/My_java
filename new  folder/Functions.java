public class Functions {
    public static void main(String[] args) {
//        System.out.println("In main method");
//            greetUser();
//        System.out.println("Method calling complete");
        printFirstPattern();
    }


    public static void greetUser() {
        System.out.println("Good Morning from Sandeep");
    }

    public static void printFirstPattern() {
//        System.out.println("* * * * *");
//        System.out.println("* * * *");
//        System.out.println("* * *");
//        System.out.println("* *");
//        System.out.println("*");

        int rows = 4;
         while (rows >= 0) {
             System.out.print("*");
             int i = 1;
             while (i <= rows) {
                 System.out.print(" *");
                 i++;
             }
             System.out.println();

            rows--;
         }



//        int rows1 = 0;
//        while (rows1 < 5) {
//            System.out.print("*");
//            int i = 0;
//            while (i < rows1) {
//                System.out.print(" *");
//                i++;
//            }
//            System.out.println();
//
//            rows1++;
//        }
    }
}
