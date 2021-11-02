package ch05;

public class MethodTest {
    public static void main(String[] args) {
        // printMySelf("황장군", 17, 180.82f, 'A');
        // 황장군의 키는 180.82cm, 나이는 17세, 혈액형은 A형이다.

        int mon = (int) (Math.random() * 12) + 1;  // 1~12
        System.out.println("mon: " + mon);
        printSeason(mon);
        // 12, 1, 2 -> "겨울"
        // 3, 4, 5 -> "봄"
        // 6, 7, 8 -> "여름"
        // 9, 10, 11 -> "가울"
        // 1~12 사이값이 아닌 값이 들어오면 "알 수 없음"
    }
    public static void printSeason(int mon) {
        if (mon < 1 || mon > 12) {
            System.out.println("알 수 없음");
        } else if(mon == 12 || mon < 3) {
            System.out.println("겨울");
        } else if(mon < 6) {
            System.out.println("봄");
        } else if(mon < 9) {
            System.out.println("여름");
        } else {
            System.out.println("가을");
        }
    }

    public static void printMySelf(String nm, int age, float height, char bloodType){
        System.out.printf("%s의 키는 %.2fcm, 나이는 %d세, 혈액형은 %c형이다.", nm, height, age, bloodType);
        }
    }