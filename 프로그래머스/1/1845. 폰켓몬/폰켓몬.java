import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
            
        }
        
        int val = 0;
        
        for(int n : nums){
            if(map.get(n)  > 1){
                val += 1;
                map.put(n, map.get(n)-1);
            }
        }
        
        
        for(int n : nums){
            if(map.get(n) == 1){
               answer += 1;
            }    
        }
        
        answer = answer - val;
                
        if(answer > nums.length/2){
            answer = nums.length/2;
        }

        return answer;
    }
}