
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1){
            System.out.print("*");
        }else{
            for(int i = n - 1; i > 0; i--){
                System.out.print(" ");
            }
            System.out.println("*");

            for(int l = 0; l < n-1; l++){
               for(int k = l; k < n-2; k++){
                   System.out.print(" ");
               }
               System.out.print("*");
                for(int j = 0; j < 2*l+1; j++){
                    System.out.print(" ");
                }

                System.out.println("*");
            }

        }

    }

}