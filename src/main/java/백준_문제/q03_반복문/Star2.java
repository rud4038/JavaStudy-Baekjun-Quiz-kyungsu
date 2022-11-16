package 백준_문제.q03_반복문;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            ++i;
            for (int j = 0; j < n; j++) {
                if (n - i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            --i;
            System.out.println();

        }
    }
}
