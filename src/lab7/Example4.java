package lab7;

class FirstClass4 {
    public char char1;
    FirstClass4(char charEx) {
        this.char1 = charEx;
    }
    FirstClass4(FirstClass4 obj) {
        this.char1 = obj.char1;
    }
}

class SecondClass4 extends FirstClass4 {
    public String str1;
    SecondClass4(char charEx, String strEx) {
        super(charEx);
        this.str1 = strEx;
    }
    SecondClass4(SecondClass4 obj) {
        super(obj);
        this.str1 = obj.str1;
    }
}

class ThirdClass4 extends SecondClass4 {
    public int int1;
    ThirdClass4(char charEx, String strEx, int intEx) {
        super(charEx, strEx);
        this.int1 = intEx;
    }
    ThirdClass4(ThirdClass4 obj) {
        super(obj);
        this.int1 = obj.int1;
    }
}

public class Example4 {
    public static void main(String[] args) {
        ThirdClass4 original = new ThirdClass4('A', "hello", 100);
        ThirdClass4 copy = new ThirdClass4(original);
        System.out.println("Original: " + original.char1 + " " + original.str1 + " " + original.int1);
        System.out.println("Copy:     " + copy.char1 + " " + copy.str1 + " " + copy.int1);
    }
}
