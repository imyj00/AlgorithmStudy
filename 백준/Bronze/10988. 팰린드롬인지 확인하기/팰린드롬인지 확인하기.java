import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String change= "";

        for(int i = input.length()-1; i >= 0; i--){
            change += input.charAt(i);
        }


        if(input.equals(change)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }




        sc.close();

    }
}