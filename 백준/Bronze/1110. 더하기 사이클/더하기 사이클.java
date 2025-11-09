import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ab = Integer.parseInt(br.readLine());

        int a = ab / 10;
        int b = ab % 10;

        int sum = a + b;
        a = b;
        b = sum;
        int count = 1;

        while(10*a + b != ab){
            sum = a + b;
            a = b;
            b = sum % 10;
            count ++;
        }

        System.out.print(count);



    }

}