package ch05;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        System.out.println(s1);
        changeVal(s1);
//        String s2 = s1.toLowerCase();

//        char[] charArr = s1.toCharArray();
//        charArr[2] = '안';
//        System.out.println(s1);
//        System.out.println(charArr);
        System.out.println(s1);
    }

    public static void changeVal(String str) {
        str = new String("안녕");
        System.out.println(str);

    }
}