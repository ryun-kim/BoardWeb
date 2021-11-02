package ch02;

public class VariableExample02 {
    public static void main(String[] args){
        float f;
        double d;

        int n1;

        //n1 =10.1; 안됨!
        f = (float)10.1; //literal = 값 그 자체인 것
        d = 10.1; //literal에도 타입이 있다. 실수만 적었을 경우 더블 타입이다.

        double d2 = f * f;  //자동형변환
        double d3 =(double)f * f; //계산을 위해 뒤의 f가 더블타입으로 변한다.
        //double d2 = (double)(f * f );//이렇게해준다.

        //float f2 = d * d ; //자동형변환 안 해준다.
        float f2 = (float)(d * d); //수동형변환 해줘야 한다.
        float f3 = (float)d * (float)d;

    }
}
