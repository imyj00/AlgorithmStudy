class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxh = 0;
        int maxw = 0;
        
        int temp = 0;
        int[] wallet = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        for(int j = 0; j < sizes.length; j++){
            if(sizes[j][0] > maxw){
                maxw = sizes[j][0];
            }
            if(sizes[j][1] >maxh){
                maxh = sizes[j][1];
            }
        }
        
        answer = maxh*maxw;
        
        return answer;
    }
}