package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[30];
        for(int i = 0 ; i < n.length; i ++){
            n[i] = i + 1;
        }
        for(int i = 0; i < 28; i++){
            int num = scanner.nextInt();
            n[num - 1] = 0;
        }
        for(int i = 0; i < n.length; i++){
            if(n[i] != 0){
                System.out.println(n[i]);
            }
        }
    }
}
