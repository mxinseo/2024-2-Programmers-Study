import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        long total = 0;
        
        // 적은 금액부터 나열되도록 정렬
        Arrays.sort(d);
        
        // 부서 수를 넘지 않도록(모든 부서가 지원 받음)
        // total에 금액을 더했을 때 예산보다 작거나 같은 경우에만
        // total에 금액을 더하면서 인덱스를 높임
        while (answer < d.length && total + d[answer] <= budget) {
            total += d[answer];
            answer++;
        }
        
        return answer;  
    }
}