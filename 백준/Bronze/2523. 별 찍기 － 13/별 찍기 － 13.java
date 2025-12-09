
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i ++){
           for(int j = 0; j <= i; j++){
               System.out.print("*");
           }
           System.out.println();
        }

        for(int k = 0; k < N-1 ; k++){
            for(int l = N - 1; l > k; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}