package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int s = scanner.nextInt();
            double[] a = new double[s];
            double sum = 0;
            double ave = 0;
            double count = 0;
            for(int j = 0; j < a.length; j++){
                a[j] = scanner.nextDouble();
                sum = sum + a[j];
            }
            ave = sum / s;
            for(int j = 0; j < a.length; j++){
                if (a[j] > ave){
                    count ++;
                }
            }

            System.out.printf("%.3f",(count / s ) * 100);
            System.out.println("%");


        }
    }
}
