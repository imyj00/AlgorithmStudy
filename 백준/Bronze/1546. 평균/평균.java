import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] score = br.readLine().split(" ");
        float [] scoreint = new float[n];

        for(int i = 0; i < score.length; i++){
            scoreint[i] = Integer.parseInt(score[i]);
        }

        float m = 0;
        for(int j = 0; j < n; j++){
            if(m < scoreint[j]){
                m = scoreint[j];
            }
        }



        float sum = 0;
        for(int k = 0; k < n; k++){
            scoreint[k] = scoreint[k]*100/m;
            sum += scoreint[k];
        }
        

        float result = sum/n;

        System.out.print(result);


    }
}
