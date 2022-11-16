package 백준_문제.q06_문자열;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            switch ((int)str.charAt(i) - 65){
                case 25:
                case 24:
                case 23:
                case 22:
                    sum += 10;
                    break;
                case 21:
                case 20:
                case 19:
                    sum += 9;
                    break;
                case 18:
                case 17:
                case 16:
                case 15:
                    sum += 8;
                    break;
                case 14:
                case 13:
                case 12:
                    sum += 7;
                    break;
                case 11:
                case 10:
                case 9:
                    sum += 6;
                    break;
                case 8:
                case 7:
                case 6:
                    sum += 5;
                    break;
                case 5:
                case 4:
                case 3:
                    sum += 4;
                    break;
                default:
                    sum += 3;
            }
        }
        System.out.println(sum);
    }
}
