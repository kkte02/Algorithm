class Solution {
    public String solution(String s) {
        
        String[] sArray = s.split("");
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < sArray.length; i++){
            if(sArray[i].equals(" ")){
                idx = 0;
            } else if(idx % 2 == 0){
                sArray[i] = sArray[i].toUpperCase();
                idx++;
            }else{
                sArray[i] = sArray[i].toLowerCase();
                idx++;
            }
            sb.append(sArray[i]);
        }

        return sb.toString();
    }
}