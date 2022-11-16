package 백준_문제.q03_반복문;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 0; i < 9; i++){
            System.out.println(n + " * " + (i +1) + " = " + (n * (i + 1)));
        }
    }
}
