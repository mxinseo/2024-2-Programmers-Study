import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        // s안의 알파벳을 이전 알파벳과 바로 다음 알파벳을 비교하므로 
        // 선입후출의 스택이 적합
        Stack<Character> tmp = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            // tmp의 맨 위와 같으면 제거
            // 단, tmp가 비어있으면 다음 알파벳을 넣어야 하므로 isEmpty조건 추가
            if(!tmp.isEmpty() && tmp.peek() == c) {
                tmp.pop();
            } else {
                // 다르면 tmp에 넣어두고 다음 검사 실행
                tmp.push(c);
            }   
        }

        if(tmp.isEmpty()) {
            // tmp 모두 비어있으면 1 리턴
            answer = 1;    
        } else {
            // tmp가 비어있지 않으면 0 리턴
            answer = 0;
        }

        return answer;
    }
}