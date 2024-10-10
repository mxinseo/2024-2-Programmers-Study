class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split("");
        int index = 0;
                
        for(String str : strArr) {
                 
            if (str.equals(" ")) {
                answer += " ";
                index = 0;
            } else {
                if (index % 2 == 0) {
                    answer += str.toUpperCase();
                } else {
                    answer += str.toLowerCase();
                }    
                index++;
            }
            
        }
        
        return answer;
    }
}