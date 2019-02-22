package hwKPI;

import java.util.Scanner;

/**
 * C2 = "-"
 * C3 = 1
 * C5 = "-"
 * C7 = 1 double
 */

public class Lab1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  a, b, n, m;
        double result = 0;
        final int C = 1;
        try {
            System.out.println("Enter A");
            a = input.nextInt();
            System.out.println("Enter N");
            n = input.nextInt();
            System.out.println("Enter B");
            b = input.nextInt();
            System.out.println("Enter M");
            m = input.nextInt();
            for (double i = a; i <= n; ++i) {
                for (double j = b; j <= m; ++j) {
                    if ((i - C) != 0) {
                        result += (i - j) / (i - C);
                    }
                }
            }
            System.out.printf("Final result : %.2f", result);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}