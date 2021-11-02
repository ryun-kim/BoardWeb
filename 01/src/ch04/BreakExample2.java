package ch04;

public class BreakExample2 {
    public static void main(String[] args){

        for(int i=0; i<10; i++){
            for(int z=100; z<110; z++){
                if(z==103) { break;}
                System.out.printf("%d - %d\n", i, z);
            }
        }//안쪽 For문 박살


        OUT_FOR:
        for(int i=0; i<10; i++){
            for(int z=100; z<110; z++){
                if(z==103) { break OUT_FOR;}
                System.out.printf("%d - %d\n", i, z);
            }
        }//바깥 For문 박살
    }
}
