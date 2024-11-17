class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        String[] binary_map = new String[n];
        
        // 이진수 맵 얻기
        for (int i = 0; i < n; i++) {
            binary_map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        
        // # 맵으로 변환
        for (int i = 0; i < n; i++) {
            String tmp = "";
            for (int k = 0; k < binary_map[i].length(); k++) {
                if (binary_map[i].charAt(k) == '1') {
                    tmp += "#";
                } else {
                    tmp += " ";
                }
            }
            
            // 이진수의 길이가 n보다 작을 때 차이를 계산해 그만큼의 공백을 앞에 넣어줌
            if (tmp.length() < n) {
                String blank = "";
                for (int k = 0; k < n - tmp.length(); k++) {
                    blank += " ";
                }
                tmp = blank + tmp;
            }
            
            answer[i] = tmp;
        }
        
        return answer;
    }
}