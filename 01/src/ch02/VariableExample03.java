package ch02;

public class VariableExample03 {
    public static void main(String[] args){
        char c = 'B';//쌍따옴표 레퍼런스 타입,형변환도 안됨

        System.out.printf("%c : %d\n", c, (int)c);

        int i = 69;
        System.out.printf("%c : %d\n", (char)i, i);

        boolean bl = true; //boolean 타입은 값을 두가지밖에 저장 못함 (ture, false);
        System.out.println(bl);
    }
}

//boolean
//byte < char < short < int < long < float < double < String
//무엇이든 String을 만나면 String으로 변한다. 대신 +밖에 되지않는다.