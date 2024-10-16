import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 점수가 작은 것끼리 모아두고, 점수가 큰 것끼리 모아두어야 최대 이득.
        // 그리고 점수가 큰 것끼리 먼저 포장하도록 하는 것이 이득. 
        
        // 1) 정렬 수행
        Arrays.sort(score);
                
        // 2) 맨 뒤에서부터 m번째 사과(그 상자에서 가장 저렴한 사과)의 점수가 상자의 가격을 결정
        int cheapest_apple_index = score.length - m;
        
        while(cheapest_apple_index >= 0) {
            answer += score[cheapest_apple_index] * m;
            cheapest_apple_index -= m;
        }

        return answer;
    }
}