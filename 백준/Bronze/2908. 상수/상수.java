import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        String []num = new String[input.length];
        int []cnum = new int[input.length];


        for(int j = 0; j < input.length; j++){
            num[j] = "";
            for(int k = 2; k >= 0; k--){
                num[j] += input[j].charAt(k);
            }
        }

        for(int i = 0; i < num.length; i++){
            cnum[i] = Integer.parseInt(num[i]);
        }


        if(cnum[0] < cnum[1]){
            System.out.print(cnum[1]);
        }else{
            System.out.print(cnum[0]);
        }


    }
}