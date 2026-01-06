import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    //2차원 배열 생성
    static char [][]drawStar;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                for(int j = 0; j < N; j++){
                    System.out.print("* ");
                }
            }else{
                for(int j = 0; j < N; j++){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }


    }
}