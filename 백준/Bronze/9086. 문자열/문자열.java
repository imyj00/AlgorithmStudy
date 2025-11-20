import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] S = new String[n];

        for (int i = 0; i < n; i++) {
            S[i] = br.readLine();
        }

        for(int j = 0; j < n; j++){
            System.out.print(S[j].charAt(0));
            System.out.print(S[j].charAt(S[j].length()-1));
            System.out.println();
        }



    }
}