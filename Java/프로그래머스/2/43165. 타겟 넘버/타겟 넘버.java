// 모든 요소를 탐색하는 것이 목적이므로 깊이 우선 탐색을 사용
// DFS(재귀)를 사용하되, 정수들의 순서는 변경할 수 없으므로 visit는 고려하지 않고 단순히 index를 늘리면 된다. 

class Solution {
    
    private int answer = 0;
    
    private void dfs(int[] numbers, int target, int index, int sum) {
        
        // 재귀 종료 조건 : 끝까지 탐색한 경우, target을 충족하는지 count
        if(index >= numbers.length) {
            if(sum == target) {
                answer++;
            }
        } else {
            dfs(numbers, target, index+1, sum + numbers[index]);
            dfs(numbers, target, index+1, sum - numbers[index]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
}