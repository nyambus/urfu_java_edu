package lab7;

class SuperClassTest2 {
    private String str1;
    SuperClassTest2(String strEx) {
        this.str1 = strEx;
    }
    public void setStr1() {
        this.str1 = "default";
    }
    public void setStr1(String strEx) {
        this.str1 = strEx;
    }
    public int getLen() {
        return str1.length();
    }
    public String getStr1() {
        return str1;
    }
}

class SubClassTest2 extends SuperClassTest2 {
    public int int1;
    SubClassTest2(String strEx, int intEx) {
        super(strEx);
        this.int1 = intEx;
    }
    @Override
    public void setStr1() {
        super.setStr1("sub_default");
    }
    @Override
    public void setStr1(String strEx) {
        super.setStr1(strEx);
    }
    public void setStr1(int intEx) {
        this.int1 = intEx;
    }
    public void setStr1(String strEx, int intEx) {
        super.setStr1(strEx);
        this.int1 = intEx;
    }
}

public class Example2 {
    public static void main(String[] args) {
        SubClassTest2 sub = new SubClassTest2("hello", 10);
        System.out.println("str: " + sub.getStr1() + ", len: " + sub.getLen());
        System.out.println("int: " + sub.int1);
        System.out.println("--- change str ---");
        sub.setStr1("new text");
        System.out.println("str: " + sub.getStr1());
        System.out.println("--- change int ---");
        sub.setStr1(123);
        System.out.println("int: " + sub.int1);
        System.out.println("--- change both ---");
        sub.setStr1("combined", 555);
        System.out.println("str: " + sub.getStr1() + ", int: " + sub.int1);
    }
}
