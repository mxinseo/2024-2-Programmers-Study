import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];   // 사진의 개수만큼 배열 크기 설정
        
        // 각 사진을 하나씩 꺼냄
        for (int i =0; i < photo.length; i++) {
            int tmp = 0;
            
            List<String> list = Arrays.asList(name);
            
            for (String n : photo[i]) {
                if (list.contains(n)) {  // 사진의 이름이 name에 있는지 확인 
                    int index = list.indexOf(n); // 있으면 index를 찾아서
                    tmp += yearning[index]; // 해당 점수를 tmp에 더해감
                }   
            }
            
            answer[i] = tmp;
        }

        return answer;
    }
}