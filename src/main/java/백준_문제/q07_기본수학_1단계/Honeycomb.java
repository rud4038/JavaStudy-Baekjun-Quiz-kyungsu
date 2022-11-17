package 백준_문제.q07_기본수학_1단계;

import java.util.Scanner;

public class Honeycomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 0;
        int sum = 1;
        while (true) {
            if (sum < a) {
                if (a == 1) {
                    System.out.println(a);
                    break;
                } else {
                    sum += (6 * (i + 1));
                }
            } else {
                System.out.println(i + 1);
                break;
            }
            i++;
        }
    }
}
