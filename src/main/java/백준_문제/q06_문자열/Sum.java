package 백준_문제.q06_문자열;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];


        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        System.out.println(Test(a));
    }
    public static long Test(int[] a ){
        int sum = 0;
        for(int i = 0; i < a.length; i ++){
            sum = sum + a[i];
        }
        return sum;


    }
}
