class Solution {
    public int[] solution(int brown, int yellow) {
       
        // 조건 1 : row * col = yellow + brown
        // 조건 2 : (row - 2) * (col - 2) = yellow
        // 조건 3 : col > 2, row > 2
        
        int row = 3;                // 세로
        int col = 3;                // 가로
        int size = yellow + brown;  // 전체 면적
        
        for(; row <= col ; row++) {
            col = size / row;
            if((row - 2) * (col - 2) == yellow) {
                 break;
             }
        }

        int[] answer = {col, row};
        
        return answer;
    }
}