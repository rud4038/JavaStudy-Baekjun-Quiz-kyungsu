package 백준_문제.q03_반복문;

public class Star3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 6 +( i * 2 ) - n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
