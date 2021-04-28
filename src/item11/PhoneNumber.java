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
//    @Override
//    public int hashCode() {
//
//        int result = Short.hashCode(area);
//        result = 31 * result * Integer.hashCode(prefix);
//        result = 31 * result * Integer.hashCode(lineNum);
//
//        return result;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(area,prefix,lineNum);
//    }

}
