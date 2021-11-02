package ch06;
/*
    클래스 > 붕어빵틀
    객체 > 붕어빵
    2가지로 구성
    - 멤버필드 (변수, 상수)
    - 메소드 (생성자)
 */

public class Car {
    String nm;
    String brand;
    String color;

    // 생성자
    // 1. 이름이(생성자명이) 클래스명과 같다. (대문자로 시작)
    // 2. 리턴 타입이 없어야 한다.
    // * 생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자를 넣어준다.

    // 오버로딩: 똑같은 이름의 메소드를 여러 개 만들 수 있는 기술
    //          파라미터만 다르면 다르게 만들 수 있다.(구분해서 호출 할 수 있다면)
    //          타입만 중요. 타입의 종류, 갯수, 순서, 리턴 타입은 상관없다.
    Car() {}
    Car(int aaa, String bb) {

    }
    Car(String aaa, int bb) {

    }
    Car(String brand, String nm) {  // 지역 변수, 전역 변수
        this.brand = brand;
        this.nm = nm;
    }

//    int drive() {
//        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
//        return 0;
//    }

    void drive() {
        System.out.printf("%s의 %s가 달린다.\n", brand, nm);
    }

    void stop() {
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }
}
