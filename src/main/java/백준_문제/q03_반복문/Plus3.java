package 백준_문제.q03_반복문;

import java.util.Scanner;

public class Plus3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i =0; i < t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #" + (i+1) + ": " + a +" + "+ b + " = " + (a + b));
        }
    }
}
