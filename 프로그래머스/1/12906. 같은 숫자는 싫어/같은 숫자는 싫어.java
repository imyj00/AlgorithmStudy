import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int num = 1;
        
        //숫자가 변경되는 횟수 +1이 총 나와야하는 수의 개수
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                num++;
            }
        }

        //answer의 length를 num으로 지정
        int[] answer = new int[num];


        //answer의 첫번째 수와 arr의 첫번째 수는 항상 같기 떄문에 미리 넣어준다.
        answer[0] = arr[0];
        
        //초기화를 진행해줬으니 그 이후 answer와 arr이 반복문을 돌 때 1부터 돌도록 해준다.
        int n = 1;
        
        //이전 수와 지금 수가 다를 떄 answer에 지금 값을 넣어주고 n에 1을 더해준다
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[j-1]){
                answer[n] =arr[j];
                n++;
            }
        }
        
        
        System.out.println(answer);

        return answer;
    }
}
