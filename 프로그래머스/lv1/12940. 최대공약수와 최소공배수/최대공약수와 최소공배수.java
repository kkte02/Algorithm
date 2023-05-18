class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        answer[0] = gbc(max, min);
        answer[1] = lcm(max, min);
        
        return answer;
    }
    
    public int gbc(int max, int min){
        while(min != 0){
            int r = max % min;
            max = min;
            min = r;
        }
        return max;
    }

    public int lcm(int max, int min){
        return max * min / gbc(max, min);
    }
}