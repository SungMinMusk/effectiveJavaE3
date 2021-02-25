package item1;

import java.math.BigInteger;

public class JumboNumber extends Number {

    BigInteger num;

    JumboNumber(String s) {
        this.num = new BigInteger(s);
    }

    public String toString() {
        return num.toString();
    }
}
