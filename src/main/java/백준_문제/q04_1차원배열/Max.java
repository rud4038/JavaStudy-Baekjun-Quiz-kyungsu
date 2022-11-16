package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[9];
        for(int i = 0; i < a.length; i ++){
            a[i] = scanner.nextInt();
        }

        int max = a[0];
        int index = 1;
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
