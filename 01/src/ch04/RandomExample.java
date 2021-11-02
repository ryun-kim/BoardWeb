package ch04;

        public class RandomExample {
            public static void main(String[] args){
                int num = (int)(Math.random() *6); //변수와 메서드의 차이를 쉽게 알아보는 것은 뒤에 ()괄호가 있는지 없는지 확인

                //0.0 ~ 0.999999...
                //0.0 ~ 5.495498746.. *6 (int)로 형변환
                //0~5

                System.out.println("num : " + num);

                // 2~7
                int num2 = (int)(Math.random()*6) + 2; //0~5 >2~7
                System.out.println(num2);

                //55~108
                int num3 =(int)(Math.random()* 54) + 55; //0~53 > 55~108
                System.out.println(num3);


            }
}
