import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter a number: ");
        for( int i = 1; i<= 10; i++) {
            //implement

            getFactorial(i);
        }
    }

    private static long getFactorial(final int n) {
        //implement
        int result = 1;
        for (int num = 1; num<=n; num++){
            result *= num;
        }
        System.out.println("Factorial of " + n + " = " + result);
        return 0;
    }
}
