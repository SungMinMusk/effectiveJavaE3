package item11;

import java.util.Objects;

public class PhoneNumber {
    short area;
    int prefix;
    int lineNum;

    public PhoneNumber(short a,int b,int c) {
        area = a;
        prefix = b;
        lineNum = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return area == that.area && prefix == that.prefix && lineNum == that.lineNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, prefix, lineNum);
    }
}
