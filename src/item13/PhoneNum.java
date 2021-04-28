package item13;

public class PhoneNum implements Cloneable {
    int num;

    public PhoneNum() {
        System.out.println("---------------------");
        System.out.println("PhoneNum constructor");
        System.out.println("---------------------");
    }

    public PhoneNum(int num) {
        System.out.println("---------------------");
        System.out.println("PhoneNum constructor");
        System.out.println("---------------------");
        this.num = num;
    }

    @Override
    public PhoneNum clone() {
        try {
            System.out.println("---------------------");
            System.out.println("PhoneNum Clone");
            System.out.println("---------------------");
            return (PhoneNum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
}