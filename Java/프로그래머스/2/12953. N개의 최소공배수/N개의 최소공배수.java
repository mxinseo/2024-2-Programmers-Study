import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] arr) {
        int answer = 1; // 초기값을 1로 변경

        // div로 나눠지는 수가 있으면 tmp에 저장됨
        List<Integer> tmp = new ArrayList<>();
        int div = 2;

        // arr의 모든 요소가 1이 아닐 때까지 반복
        while (!isAllOne(arr)) {
            boolean flag = false;

            for (int i = 0; i < arr.length; i++) {
                // div로 나누어 떨어지는 경우
                if (arr[i] % div == 0) {
                    flag = true;
                    arr[i] /= div; // 나눈 수로 저장
                }
            }

            // 나누어진 경우에만 tmp에 div 추가
            if (flag) {
                tmp.add(div);
            } else {
                div++;
            }
        }


        // tmp 리스트의 모든 값을 곱하여 answer로 반환
        for (int i = 0; i < tmp.size(); i++) {
            answer *= tmp.get(i);
        }

        return answer;
    }

    // 모든 요소가 1인지 확인
    private boolean isAllOne(int[] arr) {
        for (int value : arr) {
            if (value != 1) {
                return false; // 하나라도 1이 아니면 false 반환
            }
        }
        return true; // 모두 1이면 true 반환
    }
}
