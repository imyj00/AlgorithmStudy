import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; i<8; i++){
            answer += number % 100;
            number /= 100;
        }
        //while(number > 0) : number가 0보다 클 때 동안 계속 반복

        System.out.println(answer);
    }
}
