package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextDouble();
        }
        double max = a[0];
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        for(int i = 0; i < a.length; i++){
            sum = sum + (a[i] / max * 100);
        }
        System.out.println(sum/n);

    }
}
