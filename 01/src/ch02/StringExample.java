package ch02;

public class StringExample {
    public static void main(String[] args){
        String str1 = "안녕하세요";

        System.out.println(str1);
        System.out.println(str1 + "그래요 ~"+ str1);

        str1 = str1 + 13;
        System.out.println(str1);

        String str2 = 10 + 10 + "10";
        System.out.println(str2);

        String str3 = 10 +"10" + 10;
        System.out.println(str3);
        //printf 설명
    }
}
