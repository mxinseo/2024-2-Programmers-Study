import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        // cards1, cards2, goal을 모두 큐(선입선출)로 만들기
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        Queue<String> queue_goal = new LinkedList<>();
        for (String card : cards1) queue1.offer(card);
        for (String card : cards2) queue2.offer(card);
        for (String card : goal) queue_goal.offer(card);
        
        // 만약 card1이나 card2의 맨 앞 card가 goal과 같으면 같이 poll
        // queue_goal가 Empty일 때까지 반복
        while(!queue_goal.isEmpty()) {
            if(!queue1.isEmpty() && queue1.peek().equals(queue_goal.peek())) {
                queue1.poll();
                queue_goal.poll();
            }
            
            else if(!queue2.isEmpty() && queue2.peek().equals(queue_goal.peek())) {
                queue2.poll();
                queue_goal.poll();
            }
            
            else {
                break;
            }
        }
        
        if(queue_goal.isEmpty()) {
            answer = "Yes";
        } else {
            answer = "No";
        }

        return answer;
    }
}