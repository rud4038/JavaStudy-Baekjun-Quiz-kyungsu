package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
