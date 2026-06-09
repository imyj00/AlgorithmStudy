import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> marathon = new HashMap<>();
        
        for(String p : participant){
            marathon.put(p, marathon.getOrDefault(p, 0)+1);
        }
        
        for(String c : completion){
            marathon.put(c, marathon.get(c) -1);
        }
        
        for(String key : marathon.keySet()){
            if(marathon.get(key) != 0){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}