package item13;

public class Main {

    public static void main(String[] args) throws Exception {

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
