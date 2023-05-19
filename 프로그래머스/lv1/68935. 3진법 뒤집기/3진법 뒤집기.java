class Solution {
    public int solution(int n) {
        int answer = 0;
        // 3진수로 변경
        String ternary = Integer.toString(n, 3);

        // 앞뒤로 뒤집기
        StringBuilder sb = new StringBuilder(ternary).reverse();

        // 다시 10진법으로 표현
        answer = Integer.parseInt(sb.toString(), 3);

        return answer;
    }
}