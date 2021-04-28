package item10;

import java.awt.*;

public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x,int y, Color color) {
        super(x,y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
//        if(!(o instanceof ColorPoint)) return false;

        // 추이성 무시 o 가 일반 Point면 색상을 무시하고 비교한다.
        if (!(o instanceof ColorPoint)) return o.equals(this);

        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}
