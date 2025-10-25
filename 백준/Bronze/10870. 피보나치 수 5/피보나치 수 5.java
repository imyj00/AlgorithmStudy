import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []sum = new int[n+1];

        if(n != 0){
            sum[0] = 0;
            sum[1] = 1;

            for(int i = 0; i <= n-2; i++){
                sum[i+2] = sum[i] + sum[i+1];
            }
            int result = sum[n];
            System.out.print(result);
        }else{
            System.out.print(0);
        }



    }
}
