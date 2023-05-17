class Solution {
    public boolean solution(String s) {
        
        String regex = "(\\d{4}|\\d{6})";

        
        return s.matches(regex);
    }
}