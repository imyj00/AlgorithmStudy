import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());

        long a = N/4;

        for(int i = 0; i <= a; i++){
            if(i == a){
                System.out.print("int");
            }else{
                System.out.print("long ");
            }
        }



    }
}