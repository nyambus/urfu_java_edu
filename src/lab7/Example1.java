package lab7;

class SuperClassTest {
    private String str1;
    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }
    SuperClassTest() {
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.str1;
        return superClassNameAndFieldValue;
    }
    public String getStr1() {
        return str1;
    }
}

class SubClassTest extends SuperClassTest {
    private String str2;
    SubClassTest(String strEx) {
        super(strEx);
    }
    SubClassTest(String strEx, String strEx2) {
        super(strEx);
        this.str2 = strEx2;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.str2;
        return ClassNameAndFieldValue;
    }
}

public class Example1 {
    public static void main(String[] args) {
        SuperClassTest sup = new SuperClassTest("test super");
        System.out.println(sup.toString());
        System.out.println("----------------");
        SubClassTest sub1 = new SubClassTest("test sub 1");
        System.out.println(sub1.toString());
        System.out.println("----------------");
        SubClassTest sub2 = new SubClassTest("test sub 2", "field 2");
        System.out.println(sub2.toString());
    }
}
