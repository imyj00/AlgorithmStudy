import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int []alphabet = new int[26];

        for(int i = 0; i < word.length(); i++){
            int a = word.charAt(i) - 97;
            alphabet[a] += 1;
        }

        for(int j = 0; j < alphabet.length; j++){
            System.out.print(alphabet[j] + " ");
        }
        sc.close();
    }

}