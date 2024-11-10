import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {   
        int[] answer;
        
        int stud_1_count = 0;
        int stud_2_count = 0;
        int stud_3_count = 0;
        
        int[] stud_1_answers = {1,2,3,4,5};
        int[] stud_2_answers = {2,1,2,3,2,4,2,5};
        int[] stud_3_answers = {3,3,1,1,2,2,4,4,5,5};
        
        // 수포자 1
        for (int i=0; i< answers.length; i++) { // 모든 문제에 대하여
            int index = i % 5;
            if (answers[i] == stud_1_answers[index]) {
                stud_1_count++;
            }
        }
        
        // 수포자 2
        for (int i=0; i< answers.length; i++) { // 모든 문제에 대하여
            int index = i % 8;
            if (answers[i] == stud_2_answers[index]) {
                stud_2_count++;
            }
        }
        
        // 수포자 3
        for (int i=0; i< answers.length; i++) { // 모든 문제에 대하여
            int index = i % 10;
            if (answers[i] == stud_3_answers[index]) {
                stud_3_count++;
            }
        }
        
        // 가장 많은 문제를 맞힌 사람 구하기
        int max_count = (stud_1_count > stud_2_count && stud_1_count > stud_3_count) ? stud_1_count
                : (stud_2_count > stud_3_count) ? stud_2_count
                : stud_3_count ;
                    
        if (max_count == stud_1_count) {
            if (max_count == stud_2_count) {
                if (max_count == stud_3_count) {
                    return new int[]{1, 2, 3};
                } else {
                    return new int[]{1, 2};
                }
            } else if (max_count == stud_3_count) {
                return new int[]{1, 3};
            } else {
                return new int[]{1};
            }
        } else if (max_count == stud_2_count) {
            if (max_count == stud_3_count) {
                return new int[]{2, 3};
            } else {
                return new int[]{2};
            }
        } else {
            return new int[]{3};
        }
    }
}