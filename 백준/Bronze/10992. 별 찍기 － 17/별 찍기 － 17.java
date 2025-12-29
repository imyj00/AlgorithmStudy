import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(n == 1) System.out.print("*");
            else{
                for(int j = n-1; j > i; j--){
                    System.out.print(" ");
                }
                if(i == n-1){
                    for(int k = 0; k < 2 * n - 1; k++){
                        System.out.print("*");
                    }
                } else if (i == 0) {
                    System.out.println("*");
                } else{
                    System.out.print("*");
                    for(int k = 0; k < 2 * i - 1; k++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }

            }
        }

        sc.close();

    }

}