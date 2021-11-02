package ch04;

public class ForStarTest {
    public static void main(String[] args){
        int star = (int)(Math.random() * 5) +2 ; //2~6
        /*if star= 2
        **
        **

        if star = 3
        ***
        ***
        ***
         */
        System.out.println("별의 갯수 :" + star);

        for(int i=0; i<star; i++){
            for(int z=0; z<star; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}