import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] result = new int[n];
        String [] val = new String[2];



        for(int i = 0; i < n; i++){
            int a = 0;
            int b = 0;

            val = br.readLine().split(" ");
            a = Integer.parseInt(val[0]);
            b = Integer.parseInt(val[1]);

            result[i] = a+b;
        }

        for(int j = 0; j < n; j++){
            System.out.println(result[j]);
        }

    }
}
