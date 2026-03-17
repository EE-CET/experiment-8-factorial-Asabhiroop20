 import java.util.Scanner;
public class Factorial {
     public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            long result = factorial(n);  // calling function
            System.out.println( result);
        }

        sc.close();
    }
}

