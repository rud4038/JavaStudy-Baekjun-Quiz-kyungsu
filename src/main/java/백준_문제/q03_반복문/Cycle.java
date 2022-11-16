package 백준_문제.q03_반복문;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r1 = 0;
        int r2 = 0;
        int i = 0;
        r2 = n;
        if(n == 0){
            i++;
        }else {
            while (r1 != n) {
                r1 = (r2 % 10 * 10) + (((r2 / 10) + (r2 % 10)) % 10);
                r2 = r1;
                i++;
            }

        }
        System.out.println(i);
    }
}
