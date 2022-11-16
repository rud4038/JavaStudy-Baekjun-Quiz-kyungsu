package 백준_문제.q04_1차원배열;

import java.util.Scanner;

public class OX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.next();
            }

        for(int i = 0; i < a.length; i++){
            int count = 0;
            int sum = 0;
            for(int j = 0; j < a[i].length(); j++){

                if(a[i].charAt(j) == 'O'){
                    count ++;
                }else{
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }

    }
}
