import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Area of Triangle:\n ");
        System.out.println("Base of Triangle: ");
        double B = input.nextDouble();
        System.out.println("Height of Triangle: ");
        double H = input.nextDouble();
        double area = (0.5 * B * H) ;

        System.out.println("Area of Triangle is: " + area + "cms") ;


    }
}
