package interviewprograms.basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number:  ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            if (n == 0)
                System.out.println("Factorial of " + n + "=0");
            else
                fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
