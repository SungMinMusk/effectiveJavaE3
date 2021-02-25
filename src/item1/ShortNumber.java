package item1;

public class ShortNumber extends Number {

    int num;
    ShortNumber(String s) {
        this.num = Integer.parseInt(s);
    }
    public String toString() {
        return this.num+"";
    }
}
