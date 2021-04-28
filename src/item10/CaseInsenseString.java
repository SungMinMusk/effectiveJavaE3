package item10;

import java.util.Objects;

public class CaseInsenseString {

    private final String s;
    public CaseInsenseString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof  CaseInsenseString)
            return s.equalsIgnoreCase(((CaseInsenseString) o).s);
        if (o instanceof String)
            return s.equalsIgnoreCase((String) o);

        return false;
    }
}
