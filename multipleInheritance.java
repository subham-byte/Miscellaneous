package Miscellaneous;
interface gpi {
    default void show() {
        System.out.println("Default gpi");
    }
}

interface pi1 extends gpi {
}

interface pi2 extends gpi {
}

public class multipleInheritance implements pi1, pi2 {

    public static void main(String[] args) {
        multipleInheritance d = new multipleInheritance();
        d.show();
    }
}