import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
       
        if(n < 10){
            if(n < 5){
                if(n % 3 == 0){
                    cnt = n/3;
                }else{
                    cnt = -1;
                }
            }else{
                if(n % 5 == 0){
                    cnt = n / 5;
                }else if(n % 5 == 3){
                    cnt = n/5 + 1;
                }else if(n % 3 == 0){
                    cnt = n / 3;
                }else{
                    cnt = -1;
                }
            }
        }else{
            int fn = n / 5;
            if(n % 5 != 0){
                if(fn % 2 == 0){
                    if(n % 2 == 1){
                        cnt = fn + 1;
                    }else{
                        cnt = fn + 2;
                    }
                }else{
                    if(n % 2 == 1){
                        cnt = fn + 2;
                    }else{
                        cnt = fn + 1;
                    }
                }

            }else{
                cnt = n / 5;
            }

        }

        System.out.println(cnt);
        





    }

}