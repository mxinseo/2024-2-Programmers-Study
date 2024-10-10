class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        int repetition =  t.length() - p.length() + 1;
        
        for (int start = 0 ; start < repetition; start++) {
            
            if (Long.parseLong(t.substring(start, start + len)) <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}