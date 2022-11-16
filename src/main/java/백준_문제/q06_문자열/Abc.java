package 백준_문제.q06_문자열;

import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int[] a = new int[26];
        for(int i = 0; i < a.length; i++){
            a[i] = -1;
        }
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < 26; j++) {
                if ((int) str.charAt(i) == 97 + j){
                    if(a[j] == -1) {
                        a[j] = i;
                    }
                }
            }
        }
        for (int i = 0; i < 26; i ++){
            System.out.print(a[i]+" ");
        }
    }
}
