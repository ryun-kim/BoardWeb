package ch04;

public class ForTest4 {
    public static void main(String[] args){
        int dan = 9;
        int num = 9;
        for(int i=1 ; i<=num ; i++ ){
            for(int z=2 ; z<=dan ; z++){
                System.out.printf("%d x %d = %d \t", z, i, (z*i));
            }
            System.out.println();
        }
    }
}
