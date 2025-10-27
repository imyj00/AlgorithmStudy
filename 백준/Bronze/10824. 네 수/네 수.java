import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        String num1 = input[0] + input[1];
        String num2 = input[2] + input[3];

        long sum = Long.parseLong(num1) + Long.parseLong(num2);

        System.out.print(sum);

    }
}
