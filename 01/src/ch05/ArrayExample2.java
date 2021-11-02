package ch05;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
//        int[] arr2 = [0, 0, 0, 0, 0];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (i+1) * 100;
        }

        // 0: 100
        // 1: 200
        // 2: 300
        // 3: 400
        // 4: 500
        // 5: 600

        for(int i=0; i<arr.length; i++) {
           System.out.println( arr[i] );

//        char[]= chars;
        }
    }
}
