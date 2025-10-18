import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main{

    public static int[] recursion(String s, int l, int r, int n){
        int[] result = new int[2];

        if(l >= r)return new int[]{1, n};

        else if(s.charAt(l) != s.charAt(r)) return new int[]{0, n};

        else return recursion(s, l+1, r-1, n+1);
    }

    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 1);
    }


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] S = new String[T];

        for(int i = 0; i < T; i++){
            S[i] = br.readLine();
        }

        for(int j = 0; j < T; j++){
            int[] result = isPalindrome(S[j]);


            System.out.println(result[0] + " "+ result[1]);
        }

    }
}