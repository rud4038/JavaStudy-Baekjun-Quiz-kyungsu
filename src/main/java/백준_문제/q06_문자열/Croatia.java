package 백준_문제.q06_문자열;

import java.util.Scanner;

public class Croatia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replace("c=",".");
        str = str.replace("c-",".");
        str = str.replace("dz=",".");
        str = str.replace("d-",".");
        str = str.replace("lj",".");
        str = str.replace("nj",".");
        str = str.replace("s=",".");
        str = str.replace("z=",".");
        System.out.println(str.length());

    }
}
