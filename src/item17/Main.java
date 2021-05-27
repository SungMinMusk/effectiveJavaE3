package item17;

public class Main {

    public static void complexEx() {
        Complex a = Complex.valueOf(1, 4);
        Complex b = Complex.valueOf(3, 3);

        Complex c = a.plus(b);
        System.out.println(c);

//        Complex zero = Complex.ZERO;
//        Complex one = Complex.ONE;
//        Complex i = Complex.I;
//
//        System.out.println(zero);
//        System.out.println(one);
//        System.out.println(i);
    }


    public static void stringEx() {
        String s = "@";
        System.out.println("String before: " + s + "   " + s.hashCode());
        s += "@";
        System.out.println("String after: " + s + "   " + s.hashCode());


        StringBuilder st = new StringBuilder();
        st.append("@");
        System.out.println("StringBuilder before: " + st + "   " + st.hashCode());
        st.append("@");
        System.out.println("StringBuilder after: " + st + "   " + st.hashCode());
    }



    public static void main(String[] args) throws Exception {
        complexEx();
        //stringEx();
    }
}
