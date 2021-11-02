package ch04;

public class IfTest4 {
    public static void main(String[] args){
        String position = "과장";

        //부장이면 "700만원"
        //과장이면 "500만원"
        //부장, 과장이 아니면 "300만원"

        if("부장".equals(position)){
            System.out.printf("700만원");
        }
        else if("과장".equals(position)){
            System.out.println("500만원");
        }
        else {
            System.out.println("300만원");
        }
    }
}
