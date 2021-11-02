package ch05;

public class ArrayCopyExample2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 100, 110};
        System.out.println(arr1.hashCode());

        int[] arr2 = new int[arr1.length];
        System.out.println(arr2.hashCode());
        System.out.println();

        // 깊은 복사 (deep copy) 시도
        // arr2 = arr1; // 이것은 얕은 복사
        for(int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println();

        System.out.println(arr1 == arr2);   // false
    }
}
