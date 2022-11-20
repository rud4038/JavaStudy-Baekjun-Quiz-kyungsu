package 백준_문제.q07_기본수학_1단계;

import java.util.Scanner;

public class Fountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int line = 0;
        int cnt = 0;
        int top = 0;
        int bottom = 0;
        while(cnt < n){
            line++;
            cnt = line * (line + 1) / 2;
        }

        if(line % 2 != 0){
            top = 1 + cnt - n;
            bottom = line + 1 - top;
        }else{
            bottom = 1 + cnt - n;
            top = line + 1 - bottom;
        }

        System.out.println(top + "/" + bottom);


    }
}
