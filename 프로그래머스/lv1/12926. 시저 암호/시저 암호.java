class Solution {
    public String solution(String s, int n) {
        
        StringBuilder sb = new StringBuilder();

        // 먼저 아스키코드를 이용하기위헤 s를 charArray 로 변경
        char[] chars = s.toCharArray();
        // 루프를 돌면서 해당 아스키코드 n을 더해서 변경해준다.
        for(char ch : chars){

            // 공백일 경우
            if(ch == 32){
                sb.append(ch);
            }else{
                // 대문자일 경우
                if(ch >= 65 && ch <= 90){

                    ch += n;
                    if(ch > 90) ch -= 26;
                }else{
                    // 소문자일 경우
                    ch += n;
                    if(ch > 122) ch -= 26;
                }
                
                sb.append(ch);
            }
            
        }
        
        return sb.toString();
    }
}