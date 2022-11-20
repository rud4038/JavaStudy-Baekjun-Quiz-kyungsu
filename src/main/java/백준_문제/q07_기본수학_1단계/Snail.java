package 백준_문제.q07_기본수학_1단계;


import java.io.BufferedReader;;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int sum = 0;

        sum = (v - b) / (a - b);

        if((v - b) % (a - b) !=0){
            sum++;
        }
        System.out.println(sum);
    }
}
