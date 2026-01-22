package lab7;

class SuperClassTest3 {
    public int int1;
    public void setValue(int intEx) {
        this.int1 = intEx;
    }
    SuperClassTest3(int intEx) {
        this.setValue(intEx);
    }
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() +
                "; int1: " + this.int1;
    }
}

class SubClassTest3 extends SuperClassTest3 {
    public char char1;
    public void setValue(int intEx, char charEx) {
        this.int1 = intEx;
        this.char1 = charEx;
    }
    SubClassTest3(int intEx, char charEx) {
        super(intEx);
        this.setValue(intEx, charEx);
    }
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() +
                "; int1: " + this.int1 +
                "; char1: " + this.char1;
    }
}

class SubSubClassTest3 extends SubClassTest3 {
    public String str1;
    public void setValue(int intEx, char charEx, String strEx) {
        this.int1 = intEx;
        this.char1 = charEx;
        this.str1 = strEx;
    }
    SubSubClassTest3(int intEx, char charEx, String strEx) {
        super(intEx, charEx);
        this.setValue(intEx, charEx, strEx);
    }
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() +
                "; int1: " + this.int1 +
                "; char1: " + this.char1 +
                "; str1: " + this.str1;
    }
}

public class Example3 {
    public static void main(String[] args) {
        SuperClassTest3 superClassObject =
                new SuperClassTest3(10);
        String className = superClassObject.toString();
        System.out.println(className);
        SubClassTest3 subClassObject1 =
                new SubClassTest3(20, 'A');
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        SubSubClassTest3 subClassObject2 =
                new SubSubClassTest3(30, 'B', "Hello");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
