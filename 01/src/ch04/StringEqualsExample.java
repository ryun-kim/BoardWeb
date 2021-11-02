package ch04;

public class StringEqualsExample {
    public static void main(String[] args){
        //문자열값 비교!, 절대 == 비교하면 안된다.!!!!!!!!!!!

        String str1 = new String("안녕하세요"); //new ==새로운 객체를 만들때 사용
        String str2 = new String("안녕하세요");

        System.out.println(str1 == str2); //false가 뜸, 레퍼런스 변수값의 비교는 각가 새로운 주소를 받았기에 절대 같을수없다.
        String str3 = str2;
        System.out.println(str3 == str2); //같은 레퍼런스에서 가져오기 때문에 true가 뜬다.
        /*str1을 담는 통이라고 생각했을 때 str2도 똑같이 생겼지만 다른 걸 담는다면 같지 않다
        * 하지만 str3과 str2는 담아오는 것 자체가 같기 때문에 같다*/
        System.out.println("str1.equals(str2):" + str1.equals(str2));
        System.out.println("str2.equals(str1):" + str2.equals(str1));//서로 바껴도 결과값은 같다.
        System.out.println("str3.equals(str1):" + str3.equals(str1));
    }
}
