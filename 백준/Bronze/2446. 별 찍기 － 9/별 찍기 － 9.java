import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        for(int i = 0; i < s; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = 2*s - 2*i - 1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i = 0; i < s-1; i++){
            for(int k = s-i; k > 2; k--){
                System.out.print(" ");
            }
            for(int j = 0; j <2*i + 3; j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}