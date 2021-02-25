package item1;

public class main {

    public static void main(String[] args) {
        Number a = Number.strToNum("999");
        System.out.println(a + "    " + a.getClass());

        Number b = Number.strToNum("99999999999999");
        System.out.println(b + "    " + b.getClass());
    }
}
