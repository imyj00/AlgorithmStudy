import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] alphabet = new int[26];
        String word = sc.next();

        for(int i = 0; i < word.length(); i++ ){
            if( word.charAt(i) >=65 && word.charAt(i) <=90){
                alphabet[word.charAt(i) - 65] += 1;
            }else{
                alphabet[word.charAt(i) -97] += 1;
            }
        }

        int max = 0;
        char ch = '?';

        for(int j = 0; j < 26; j++){
            if(alphabet[j] > max){
                max = alphabet[j];
                ch = (char) (j + 65);
            }else if(alphabet[j] == max){
                ch = '?';
            }

        }

        System.out.println(ch);
    }
}
