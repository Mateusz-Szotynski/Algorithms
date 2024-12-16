public class Recursion {
    public static void main(String ... args) {
        countDown(10);
        System.out.println(factorial(5));
    }

    public static void countDown(int number) {
        if (number >= 0) {
            System.out.println(number);
            countDown(number - 1);
        }
    }

    public static int factorial(int number) {
        if (number == 1) return 1;
        return number * factorial(number - 1);
    }
}