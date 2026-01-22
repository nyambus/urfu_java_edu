package lab7;

class SuperClassTest5 {
    private String str1;
    SuperClassTest5(String strEx) {
        this.str1 = strEx;
    }
    public void show() {
        System.out.println("Class: " + this.getClass().getSimpleName() +
                ", str1: " + this.str1);
    }
}

class SubClassTest5_A extends SuperClassTest5 {
    protected int int1;
    SubClassTest5_A(String strEx, int intEx) {
        super(strEx);
        this.int1 = intEx;
    }
    @Override
    public void show() {
        System.out.println("Class: " + this.getClass().getSimpleName() +
                ", int1: " + this.int1);
    }
}

class SubClassTest5_B extends SuperClassTest5 {
    protected char char1;
    SubClassTest5_B(String strEx, char charEx) {
        super(strEx);
        this.char1 = charEx;
    }
    @Override
    public void show() {
        System.out.println("Class: " + this.getClass().getSimpleName() +
                ", char1: " + this.char1);
    }
}

public class Example5 {
    public static void main(String[] args) {
        SuperClassTest5 superObj = new SuperClassTest5("super text");
        SubClassTest5_A subObjA = new SubClassTest5_A("sub A text", 10);
        SubClassTest5_B subObjB = new SubClassTest5_B("sub B text", 'Q');
        superObj.show();
        subObjA.show();
        subObjB.show();
        System.out.println("----------------");
        SuperClassTest5 ref;
        ref = subObjA;
        ref.show();
        ref = subObjB;
        ref.show();
    }
}

