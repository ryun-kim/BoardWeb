package ch05;

public class MethodExample {
    public static void main(String[] args) {
        // void: 리턴 타입
        // main: 메소드명
        // (String[] args): 매개변수(파라미터)
        // void main(String[] args): 메소드 선언부
        //  { ``` } 메소드 구현부

        sum(10, 20);
        sum(50, 120);
        sum(-10, -20);
        minus(100, 50, 30);
    }

    public static void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }

    public static void minus(int n1, int n2, int n3) {
        System.out.println("minus : " + (n1 - n2));
    }
}
