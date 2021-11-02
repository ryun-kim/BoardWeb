package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
//        int n1, n2, n3;
        int rVal = getRandom(40, 42);
        System.out.println(rVal);

        int absVal = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println("absVal : " + absVal);
        System.out.println("absVal2 : " + absVal2);
    }
    public static int getABS(int val) {
        return val < 0 ? -val : val;
//        if(val < 0) {
//            return -val;
//        }
//        return val;
    }

    public static int getRandom(int n1, int n2) {   //변수마다 타입을 적어주어야 한다.
        return (int)(Math.random() * (n2 - n1 + 1)) + n1;
//        int result = (int)(Math.random() * (n2 - n1 + 1)) + n1;
//        return result;
    }
}
