package 백준_문제.q01_입출력_사칙연산;

import java.util.Scanner;

public class Calculation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = a % c;
        int e = b % c;
        System.out.println((a + b) % c);
        System.out.println((d + e) % c);
        System.out.println((a * b) % c);
        System.out.println((d * e) % c);
    }
}
