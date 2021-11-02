package ch03;

public class OperatorExample3 {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2; //true
        boolean result2 = n3 > n4; //false

        System.out.println(result1 && result2); //false
        System.out.println(result1 || result2); //true

        System.out.println(true && true && false && true && true); //false
        System.out.println(n1 >= n2 || n3 < n4 || n1 > n4); //ture

    }
}
