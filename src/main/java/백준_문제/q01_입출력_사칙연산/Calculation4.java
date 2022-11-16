package 백준_문제.q01_입출력_사칙연산;

import java.util.Scanner;

public class Calculation4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (b % 10) * a;
        int d = ((b % 100) - (b % 10)) / 10 * a;
        int e = (b - (b % 100)) / 100 * a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c + (d * 10) + (e * 100));
    }
}
