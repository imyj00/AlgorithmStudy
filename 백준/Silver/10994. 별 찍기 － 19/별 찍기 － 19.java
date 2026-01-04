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
        //초기값
        int n = 4*N -3;

        //초기화
        drawStar = new char [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                drawStar[i][j] = ' ';
            }
        }

        //별 찍기
        draw(0, n);

        //출력
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(drawStar[i][j]);
            }
            System.out.println();
        }


    }

    public static void draw(int s, int len){
        if(len <= s) return;

        for(int i = s; i < len; i++){
            drawStar[s][i] = '*'; //첫번째 줄
            drawStar[len-1][i] = '*';// 마지막 줄
            drawStar[i][s] = '*'; //왼쪽 줄
            drawStar[i][len-1] = '*';// 오른쪽 줄
        }

        draw(s+2, len -2); //재귀

    }


}