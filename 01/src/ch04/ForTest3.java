package ch04;

public class ForTest3 {
    public static void main(String[] args){
        int name = 10;
        for(int i=2; i<name ; i++){
            if(i> 2){
                System.out.println("----------");//값사이에 --를 넣을때 포문 위에 있을 때
            }
            for(int z=1; z<10; z++){
                System.out.printf("%d x %d = %d\n",i, z, i*z);
            }

        }

    }
}
