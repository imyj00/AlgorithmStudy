import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int [] numbers = new int[10];

        for(int i = 0; i < input.length(); i++){
            int a = Character.getNumericValue(input.charAt(i));
            if((a == 6) || (a == 9)){
                if(numbers[6] < numbers[9]){
                    numbers[6] += 1;
                }else{
                    numbers[9] += 1;
                }
            }else{
                numbers[a] += 1;
            }
        }

        int max = 0;

        for(int j = 0; j < 10; j++){
            if(max < numbers[j]){
                max = numbers[j];
            }
        }

        System.out.print(max);



    }
}