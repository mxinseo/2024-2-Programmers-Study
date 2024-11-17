class Solution {
    public String solution(String s, String skip, int index) {
        
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // skip에 있는 알파벳 제거
        for (int i = 0; i < skip.length(); i++) {
            alphabet = alphabet.replace(String.valueOf(skip.charAt(i)), "");
        }
        
        // s 에서 index 뒤의 알파벳으로 바꾸기
        for (int i = 0; i < s.length(); i++) {
            
            // 바꿀 알파벳의 index를 계산
            String alphabet_to_change = String.valueOf(s.charAt(i)); // 바꿀 문자
            int alphabet_to_change_index = alphabet.indexOf(alphabet_to_change); // 바꿀 문자의 알파벳 상 인덱스
            int target_index = (alphabet_to_change_index + index) % alphabet.length(); // index만큼 뒤의 알파벳의 인덱스
            
            answer += alphabet.charAt(target_index);
        }
        
        return answer;
    }
}