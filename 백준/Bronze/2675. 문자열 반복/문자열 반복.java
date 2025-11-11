import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String [] result = new String[n];
        for(int i = 0; i < n; i++){
            String [] word = br.readLine().split(" ");
            result[i] = "";
            for(int j = 0; j < word[1].length(); j++){
                for(int k = 0; k < Integer.parseInt(word[0]); k++){
                    result[i] += word[1].charAt(j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
    }
}