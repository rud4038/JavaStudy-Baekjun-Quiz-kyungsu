package 백준_문제.q07_기본수학_1단계;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(c <= b){
            System.out.println("-1");
        }else{
            int x =  a/(c - b) + 1;
            System.out.println(x);
        }
    }
}
