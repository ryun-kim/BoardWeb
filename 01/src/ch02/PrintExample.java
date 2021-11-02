package ch02;

public class PrintExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.println();


        String nm = "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodType = 'A';

        //홍길동의 키는 180.8cm, 나이는 17세, 혈액형은 B형이다. 를 출력하고 싶을 때

        System.out.println(nm+"의 키는 " + height + "cm, 키는 "+ age + "세, 혈액형은 "+bloodType+"형이다.");
        System.out.printf("%s의 키는 %.2f cm, 나이는 %09d 세, 혈액형은 %c 형이다.", nm, height, age, bloodType);
    }
}
