package ch06;

public class PrivateClass {
    private int val;    // private는 같은 클래스 내에서는 접근이 가능하지만, 패키지에서는 접근이 불가능하다.
    int defaultVal;     // default는 같은 클래스, 같은 패키지는 접근 가능하지만, 다른 패키지에서는 접근 불가능하다.

    public PrivateClass() {}

    private void print() {
        System.out.println("프린트");
    }
}
