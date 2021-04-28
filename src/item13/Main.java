package item13;

public class Main {

    public static void main(String[] args) throws Exception {
//        PhoneNum a = new PhoneNum(1);
//        System.out.println(a.clone() != a);

//        ----------------------------------

//        PhoneNum a = new PhoneNum(1);
//        PhoneNum b = new PhoneNum(2);
//        PhoneNum c = new PhoneNum(3);
//
//        Stack st = new Stack();
//        st.push(a);
//        st.push(b);

//        Stack st2 = st.clone();
//        st2.push(c);
//
//        System.out.println(st.toString());
//        System.out.println(st2.toString());
//
//
//        //System.out.println(st.getElements()[0] == st2.getElements()[0]);


//        ----------------------------------

        Sub a = new Sub();
        Sub b = a.clone();

    }

    public static class Sup implements Cloneable {
        String type;

        public Sup() {
            this.type = "super";
        }

        public void overrideMe() {
            System.out.println("super method");
        }

        @Override
        public Sup clone() {
            try {
                overrideMe();
                return (Sup) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException();
            }
        }
    }

    public static class Sub extends Sup {
        String temp;
        @Override
        public void overrideMe() {
            System.out.println("sub mehtod");
            System.out.println(temp);
            type = "sub";
        }

        @Override
        public Sub clone() {
            Sub clone = (Sub) super.clone();
            clone.temp = "temp";
            return clone;
        }

    }
}
