import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        long x = Integer.parseInt(input1[1]);

        String [] snum = br.readLine().split(" ");
        String [] num = new String[n];


        for(int j = 0; j < n; j++){
            if(Integer.parseInt(snum[j]) < x){
                System.out.print(snum[j] + " ");
            }
        }


    }
}