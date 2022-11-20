package 백준_문제.q07_기본수학_1단계;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count = 0;

        for(int i = 0; i < t; i++){
            int sum = 0;
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();
            for(int j = 0; j < w; j++){
                for(int k = 0; k < h; k++){
                    if(count + 1 == n){
                        sum =((j + 1) + ((k + 1) * 100));
                        break;
                    }else {
                        sum =((j + 2) + ((k + 1) * 100));
                        count ++;
                    }
                }
                if(count + 1 == n){
                    System.out.println(sum);
                    sum = 0;
                    count = 0;
                    break;
                }
            }
        }
    }
}
