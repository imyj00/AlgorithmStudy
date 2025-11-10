import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        String num = sc.next();

        int total = 0;

        for(int i = 0; i < val; i++){
            total += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.print(total);

        sc.close();
    }

}