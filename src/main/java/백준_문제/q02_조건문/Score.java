package 백준_문제.q02_조건문;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score > 89) {
            System.out.println("A");
        } else if (score > 79) {
            System.out.println("B");
        } else if (score > 69) {
            System.out.println("C");
        } else if (score > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
