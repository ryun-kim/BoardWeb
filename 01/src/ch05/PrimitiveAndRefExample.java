package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 15;

        Box box = new Box();
        box.val = 15;

        Box box2 = box;
        box2.val = 100;

        box2 = new Box();

        System.out.println("(int)val: " + val);
        val = changeVal(val);
        System.out.println("(pVal)val: " + val);

        System.out.println("------");
        System.out.println("(box2)box.val: " + box.val);
        changeVal(box);
        System.out.println("(pBox)box.val: " + box.val);
        System.out.println("(new Box)box2.val: " + box2.val);
    }
    public static int changeVal(int pVal) {
        return pVal * 2;
    }
    public static void changeVal(Box pBox) {
        pBox.val = 30;
    }
}

class Box {
    int val;
    int val2;
    int val3;
    String str1;
}