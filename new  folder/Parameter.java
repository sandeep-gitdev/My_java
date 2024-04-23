public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(5, 8));

    }

    public static int sumTwoNumbers(int first, int second) {
        System.out.println("First number received: " + first);
        System.out.println("Second number received: " + second);
       // int sum = first + second;
        return first + second;
    }
}
