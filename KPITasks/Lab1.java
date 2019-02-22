package hwKPI;

import java.util.Scanner;

 /**
 C2 = "-"
 C3 = 1
 C5 = "-"
 C7 = 1 double
 **/

public class Lab1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  a, b, n, m;
        double result = 0;
        final int C = 1;
        if (scan.hasNextDouble()) {
            System.out.print("Enter A : ");
            a = input.nextInt();
            System.out.print("Enter N : ");
            n = input.nextInt();
            System.out.print("Enter B : ");
            b = input.nextInt();
            System.out.print("Enter M : ");
            m = input.nextInt();
            for (double i = a; i <= n; ++i) {
                for (double j = b; j <= m; ++j) {
                    if ((i - C) != 0) {
                        result += (double) (i - j) / (i - C);
                    }
                }
            }
            System.out.printf("Final result : %.2f", result);
        }
        else {
            System.out.println("Not a valid number!");
        }
    }
}