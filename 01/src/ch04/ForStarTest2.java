package ch04;

public class ForStarTest2 {
    public static void main(String[] agrs){
        int star = (int)(Math.random() * 5) +2 ; //2~6

        System.out.println("별의 갯수 :" + star);
        for(int i=0; i<star; i++ ){

            for(int z=0; z<=i ;z++ ){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();

        for(int i=1; i<=star; i++){
            for(int z=1; z<=i ; z++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
