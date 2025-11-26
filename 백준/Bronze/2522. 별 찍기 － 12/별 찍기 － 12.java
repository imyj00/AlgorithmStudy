import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        for(int i = 0; i < s; i++){
            for(int j = s-1; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < s-1; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(" ");
            }
            for(int k = s-1; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}