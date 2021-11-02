package ch07;

public class DmbCellPhone extends CellPhone{
    int channel;

    public DmbCellPhone(String model,String color, int channel) {
        //super(); //이 경우가 아닌 경우 > 부모가 기본 생성자가 없을 때 !



        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    @Override
    void  printInfo(){
        super.printInfo();
        System.out.printf(", channel: %d\n", channel);
    }
}
