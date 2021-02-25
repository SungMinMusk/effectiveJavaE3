package item1;

public class LongNumber extends Number {

    long num;

    LongNumber(String s) {
        this.num = Long.parseLong(s);
    }

    public String toString() {
        return Long.toString(this.num);
    }
}
