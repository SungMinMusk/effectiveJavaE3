package item11;

public class Main {

    public static void main(String[] args) throws Exception {
        PhoneNumber a = new PhoneNumber((short) 1, 2,1);
        PhoneNumber b = new PhoneNumber((short) 1, 2,1);
        PhoneNumber c = new PhoneNumber((short) 2, 2,1);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

    }
}
