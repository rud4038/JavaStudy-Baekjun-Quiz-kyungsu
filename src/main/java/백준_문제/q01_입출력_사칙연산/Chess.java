package 백준_문제.q01_입출력_사칙연산;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int king = 1 - scanner.nextInt();
        int queen = 1 -  scanner.nextInt();
        int look = 2 - scanner.nextInt();
        int bishop = 2 - scanner.nextInt();
        int knight = 2 - scanner.nextInt();
        int pawn = 8 - scanner.nextInt();
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(look + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.println(pawn);
    }
}
