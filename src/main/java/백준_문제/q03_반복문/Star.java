package 백준_문제.q03_반복문;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            ++i;
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            --i;
            System.out.println();
        }
    }
}
