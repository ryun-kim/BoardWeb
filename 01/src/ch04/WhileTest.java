package ch04;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        /*
        숫자를 입력하세요 (정지:0) :
         */
        Scanner scan = new Scanner(System.in);

        /*

        System.out.print("숫자를 입력하세요 (정지 : 0) : ");
        int num =0;
        int i =scan.nextInt();


        while(i !=0) {
            System.out.print("숫자를 입력하세요 (정지 : 0) : ");
            int num= scan.nextInt();
            num += num;
            if(i ==0){
                System.out.println("더한 수 : "+ num+i);
            }

        }

         */

        int sum = 0, val = 0;
        System.out.print("숫자를 입력하세요(정지:0)");
        val =scan.nextInt();
        sum = sum +val;
        while(val !=0){
            System.out.print("숫자를 입력하세요(정지:0)");
            val =scan.nextInt();
            sum = sum+val;

        }
        System.out.println("합계: " + sum);

        /*
        int sum =0, num = 0;
        System.out.println("숫자를 입력하세요(종료:0)");
        num =scan.nextInt();
        while(num !=0){
            sum = sum + num;
            System.out.println("숫자를 입력하세요(종료:0)");
            num = scan.nextInt();

        }
        System.out.println("합계: "+ sum);

         */


    }
}
