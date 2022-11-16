package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int x =0;
        for(int i = 0; i < num.length; i++){
            if(num[i] == v){
                x++;
            }
        }
        System.out.println(x);
    }
}
