import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int result = 0;
        String sen = "";


        if(word.charAt(0) == ' '){
            if(word.length() == 1){
                System.out.print(result);
            }else{
                for(int i = 1 ; i < word.length() ; i++){
                    sen += String.valueOf(word.charAt(i));
                }
                String [] sentence = sen.split(" ");
                result = sentence.length;
                System.out.print(result);
            }
        }else{
            String [] sentence = word.split(" ");
            result = sentence.length;
            System.out.print(result);

        }

    }
}