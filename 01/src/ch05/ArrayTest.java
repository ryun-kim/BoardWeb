package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 28, 98, 30, 32, 17, 22};

        // 점수가 짝수인 숫자들만 점수 프린트
        // 점수가 홀수인 숫자들의 합계 점수(1) 프린트

        int oddSum = 0;
         for(int i=0; i<scores.length; i++) {
            if(scores[i] % 2 == 0) {// 짝수
                System.out.printf("scores[%d] : %d\n", i, scores[i]);
            } else {
                oddSum += scores[i];
            }
        }
        System.out.println("홀수 합계 : " + oddSum);
    }
}
