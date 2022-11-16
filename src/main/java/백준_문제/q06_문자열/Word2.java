package 백준_문제.q06_문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Word2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str , " ");
        System.out.println(st.countTokens());
    }
}
