package 백준_문제.q06_문자열;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int t = scanner.nextInt();
            String a = scanner.next();
            for(int j = 0; j < a.length(); j ++){
                for(int k = 0; k < t; k++){
                    System.out.print(a.charAt(j));
                }
            }
            System.out.println();

        }
    }
}
