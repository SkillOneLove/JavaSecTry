package wrapperclasses.Assignment2;

public class Main {
    public static void main(String[] args) {
        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.FALSE;
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(false);
        Boolean b5 = Boolean.valueOf("true");
        Boolean b6 = Boolean.valueOf("false");
        Boolean b7 = Boolean.parseBoolean("true");

        System.out.println("Boolean.TRUE = " + b1);
        System.out.println("Boolean.FALSE = " + b2);
        System.out.println("Boolean.valueOf(true) = " + b3);
        System.out.println("Boolean.valueOf(false) = " + b4);
        System.out.println("Boolean.valueOf(\"true\") = " + b5);
        System.out.println("Boolean.valueOf(\"false\") = " + b6);
        System.out.println("Boolean.parseBoolean(\"true\") = " + b7);
        System.out.println();
    }
}
