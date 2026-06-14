import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++){
        
            ArrayList<Integer> set = new ArrayList<>();

            for(int k = (commands[i][0])-1; k < commands[i][1]; k++){
                set.add(array[k]);
            }
            set.sort(Comparator.naturalOrder());
            list.add(set.get((commands[i][2])-1));            
        }
        
        int[] answer = new int[list.size()];

        for(int n = 0; n < list.size(); n++){
            answer[n] = list.get(n);
        }
        
        return answer;
    }
}