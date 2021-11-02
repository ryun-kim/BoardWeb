package ch06;

public class PrivateClassTest {
    public static void main(String[] args) {    // public은 같은 클래스, 같은 패키지, 다른 패키지에서도 제한 없이 사용 가능.
        PrivateClass pc = new PrivateClass();
        // pc.val = 10; // private 접근 불가능
        pc.defaultVal = 10;
    }
}
