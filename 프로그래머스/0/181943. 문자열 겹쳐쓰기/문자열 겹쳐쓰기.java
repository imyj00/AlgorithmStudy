class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String [] set_answer = new String [my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            set_answer[i] = String.valueOf(my_string.charAt(i));
        }
        
        for(int j = s; j < s + overwrite_string.length(); j++){
            set_answer[j] = String.valueOf(overwrite_string.charAt(j-s));
        }
        
        
        for(int k = 0; k < set_answer.length; k++){
            answer += set_answer[k];
        }
        
        return answer;
    }
}