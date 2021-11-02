package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        // input 0, output 0 (비void형)

        sum(200, 200);
        int result = sum(100, 200); // =이 있으면 void형은 아니다.
        System.out.println("sum: " + result);

        result = sum(10, 20);
        System.out.println("sum: " + result);
    }

//                  output     input
    public static int sum(int n1, int n2) {
        return n1 + n2; // void 외에는 무조건 return을 넣어야 한다.
    }
}
