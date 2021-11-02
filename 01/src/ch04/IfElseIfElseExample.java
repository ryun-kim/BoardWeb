package ch04;

public class IfElseIfElseExample {
    public static void main(String[] args){
        int score = 75;

        if(score >=90) {
            System.out.println("A 등급");
        } else if (score >= 80) {
            System.out.println("B 등급");
        } else if (score >= 70) {
            System.out.println("C 등급");
        } else {
            System.out.println("D 등급");
        }//가장 먼저 만나는 true 구문만 출력하고 나머지는 생략된다
    }
}
