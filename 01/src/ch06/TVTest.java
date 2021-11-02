package ch06;

public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.setBrand("삼성");
        tv.setInch(50);
        System.out.println("tv brand: " + tv.getBrand());
        System.out.println("tv brand: " + tv.getInch());
        // tv.brand = "삼성";     이런 식으로 direct로 변수를 사용하면 안 된다.

        TV tv2 = new TV();
        tv2.setBrand("LG");
        tv2.setInch(50);
        System.out.println("tv2 brand: " + tv2.getBrand());
        System.out.println("tv2 brand: " + tv2.getInch());
        // tv2.brand = "LG";
    }
}
