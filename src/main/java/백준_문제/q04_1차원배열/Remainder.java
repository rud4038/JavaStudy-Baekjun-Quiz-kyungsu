package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int n = 0;

        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt() % 42;
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i +1; j < a.length ; j++){
                if(i !=j && a[i] == a[j]){
                    n ++;
                    break;
                }
            }
        }
        System.out.println(10 - n);
    }
}
