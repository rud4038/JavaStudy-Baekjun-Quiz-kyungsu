package 백준_문제.q06_문자열;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] b = new int[26];
        int max = 0;

        String a = scanner.nextLine();
        char answer = '?';

        for(int i = 0; i < a.length(); i++){

            for(int j = 0; j < 26; j++){
                if((int)a.charAt(i)  == 65 + j ){
                    b[j] ++;
                }
            }
            for(int j = 0; j < 26; j++){
                if((int)a.charAt(i)  == 97 + j){
                    b[j] ++;
                }
            }

        }

        for(int i = 0; i < 26; i++){
            if(max < b[i]){
                max = b[i];
                answer = (char)(65 + i);
            }else if(max !=0 && max == b[i]){
                answer = '?';
            }

        }
        System.out.println(answer);
    }
}
