package ch03;

public class OperatorExample {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 9;

        int result = n1 + n2;
        System.out.println("n1 + n2 = " + result);

        //10 + 3 = 13
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.printf("%d + %d = %d\n", n1, n2, result);

        result = n1 + (-n2);
        System.out.printf("%d + -%d = %d \n", n1, n2, result);

        boolean result2 = n1 > n2; //n1은 n2보다 초과이다 (초과, 미만으로 본다)

        System.out.printf("%d > -%d = %b \n", n1, n2, result2);
        System.out.printf("%d < %d = %b \n", n1, n2, n1<n2);
        System.out.println();
        System.out.printf("%d <= %d = %b \n", n1, n2, n1>=n2);
        System.out.printf("%d <= %d = %b \n", n1, n2, n1<=n2);//(>=,<=은 이상, 이하로 본다)
        System.out.println();
        System.out.printf("%d == %d = %b\n", n1, n2, n1 == n2);
        System.out.printf("%d != %d = %b\n", n1, n2, n1 != n2);
    }
}
