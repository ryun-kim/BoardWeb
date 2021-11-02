package ch04;

public class ForStarTest3 {
    public static void main(String[] args){
        int star = (int)(Math.random() * 5) +2 ;
        System.out.println(star);
        /* 내가 연습했던 풀이
        for(int i=star; i>0; i--) {
            System.out.print("_");
            for(int z=0; z<i; z++){

            }
                for(int a=0; a<star; a++){
                    System.out.print("*");
                }
            System.out.println();
        }
        System.out.println();

         */

        for(int i =star; i>0; i--){
            for(int z=1; z<=star ; z++){
                if(z<i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }



    }
}

