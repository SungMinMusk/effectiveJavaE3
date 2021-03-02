package item1;

public class main {

    public static void main(String[] args) {
        Number a = Number.fromStr("999");
        System.out.println(a + "    " + a.getClass());

        Number b = Number.fromStr("999999");
        System.out.println(b + "    " + b.getClass());
    }
}
