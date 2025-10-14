import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long sum = 0;

        for(long i = 1; i <= a; i++ ){
            sum += i;
        }

        System.out.print(sum);

        sc.close();
    }
}