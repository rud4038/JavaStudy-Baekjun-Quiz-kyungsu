package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            if(a[i] < x){
                System.out.print(a[i] + " ");
            }
        }
    }
}
