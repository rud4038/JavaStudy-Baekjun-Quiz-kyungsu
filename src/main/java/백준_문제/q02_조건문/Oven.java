package 백준_문제.q02_조건문;

import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        a = a + (c / 60);
        b = b + (c % 60);

        if(b > 59){
            b = b - 60;
            a++;
        }
        if(a > 23){
            a = a - 24;
        }
        System.out.print(a + " ");
        System.out.println(b);
    }
}
