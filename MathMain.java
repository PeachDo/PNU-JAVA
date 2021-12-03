import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int begin, end;
        begin = sc.nextInt();
        end = sc.nextInt();

        System.out.println("Enter a begin number:");
        System.out.println("Enter an end number:");

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);

    }

    private static long getSumBetween(int b, int e){
       long sum = 0;
       for(int i=b; i<=e; i++){
           sum = sum + i;
       }
       return sum;
    }

    private static long getProductBetween(int b, int e){
        long product = 1;
        for (int i = b; i<=e; i++){
            product = product * i;
        }
        return product;
    }
}
