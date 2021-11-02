package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {

        // byte, short, long, int, float, double, char, boolean

//        int arr3[] = {1, 2, 3};
        int[] arr1 = {10, 20, 30, 100, 110};

        //int[] arr1 = {10, 20, 30};

        int[] arr2 = arr1;  // 얕은 복사(shallow copy)

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        arr1[0] = 5;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);


        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr1 == arr2);   // 주소값이 같다.

        System.out.println(arr1 == arr2);

    }
}
