import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> base3 = new ArrayList<>();
        
        // 3진법으로 바꾸기 : 차례로 더하면 앞뒤 반전된 3진법을 얻음
        for (int i = n; i > 0; i /= 3) {
            base3.add(i % 3);
        }

        // 10진법으로 변환
        for (int i = 0; i < base3.size(); i++) {
            int pow = base3.size() - 1 - i; // 거듭제곱 수 구하기 : index와 자릿수는 반대이므로 이렇게 설정
            answer += base3.get(i) * (int) Math.pow(3, pow);
        }
        
        return answer;
    }
}
