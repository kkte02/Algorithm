class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0L;

        long totalPrice = price * ((long) count * (count+1) /  2);

        answer = totalPrice - money;

        return Math.max(answer, 0);
    }
}