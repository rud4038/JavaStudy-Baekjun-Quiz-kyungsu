package 백준_문제.q02_조건문;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        m = m - 45;
        if(m < 0){
            m = m+60;
            h--;
        }
        if(h > 23){
            h = h - 24;
        }else if(h < 0){
            h = h + 24;
        }
        System.out.print(h + " ");
        System.out.println(m);
    }
}
