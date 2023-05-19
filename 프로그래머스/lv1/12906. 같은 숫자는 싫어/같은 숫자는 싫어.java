import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 초기 값 설정
        arrayList.add(arr[0]);
        // 비교 값 설정
        int compareNum = arr[0];
        // 1번부터 그전에 값과 비교하여 같은지 확인해본다.
        for(int i = 1; i < arr.length ; i++){
            if(compareNum != arr[i]){
                arrayList.add(arr[i]);
                compareNum = arr[i];
            }
        }

        int[] answer = new int[arrayList.size()];
        
        for(int i =0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}