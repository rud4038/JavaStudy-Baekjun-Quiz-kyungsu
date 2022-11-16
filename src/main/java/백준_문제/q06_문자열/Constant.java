package 백준_문제.q06_문자열;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        String n2 = scanner.next();

        String s1= "";
        String s2= "";

        for(int i = n1.length() - 1; i >= 0; i--){

            s1 = s1 + n1.charAt(i);

        }
        for(int i = n2.length() - 1; i >= 0; i--){

            s2= s2 + n2.charAt(i);

        }
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}
