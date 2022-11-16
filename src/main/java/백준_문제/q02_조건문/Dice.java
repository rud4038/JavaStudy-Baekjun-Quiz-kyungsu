package 백준_문제.q02_조건문;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int total = 0;

        if(a == b && a == c){
            total = 10000 + (a * 1000);
        }else if (a == b){
            total = 1000 + (a * 100);
        }else if (a == c){
            total = 1000 + (a * 100);
        }else if (b == c){
            total = 1000 + (b * 100);
        }else{
            if(a > b && a > c){
                total = a * 100;
            }else if(b > a && b > c){
                total = b * 100;
            }else{
                total = c * 100;
            }
        }
        System.out.println(total);
    }
}
