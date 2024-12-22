import java.util.ArrayDeque;
import java.util.Queue;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        // 앞쪽의 알파벳 2개부터 비교해가는 선입선출의 구조
        // s 의 알파벳 각각을 덱으로 변환
        ArrayDeque<String> queue = new ArrayDeque<>();
        
        // 제거 후 앞부분 알파벳들을 저장할 임시 큐
        ArrayDeque<String> tmp = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            queue.addLast(String.valueOf(c));
        }
        
        
        while(!queue.isEmpty()) {
            
            // tmp의 맨뒤랑 queue의 맨 앞이 같으면 소거 = peek한 알파벳도 poll 
            // 단, tmp가 비어있으면 다음 queue의 알파벳을 넣어야 하므로 isEmpty조건 추가
            if(!tmp.isEmpty() && tmp.peekLast().equals(queue.peekFirst())) {
                tmp.pollLast();
                queue.pollFirst();
            } else {
                // 다르면 queue의 맨 앞 앞파벳을 tmp에 넣어두고 다음 검사 실행
                tmp.addLast(queue.pollFirst());
            }
        }
        
        if(tmp.isEmpty()) {
            // queue가, tmp 모두 비어있으면 1 리턴
            answer = 1;    
        } else {
            // queue가 비어있는데, tmp가 비어있지 않으면 0 리턴
            answer = 0;
        }
        
           

        return answer;
    }
}