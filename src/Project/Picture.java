package Project;

public class Picture {

    private final Line L1;
    private final Parabola P1;
    private final Parabola P2;
    private final Parabola P3;
    private final Circle C1;

    public Picture(Line LINE, Parabola P1, Parabola P2, Parabola P3, Circle C1)
    {
        this.L1 = LINE;
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        this.C1 = C1;
    }

    public SimpleColor getColor(Point point)
    {
        double x = point.getX();
        double y = point.getY();

        if (L1.isPointInside(x, y) && P1.isPointInside(x, y) && P2.isPointInside(x, y) && P3.isPointInside(x, y) &&
                C1.isPointInside(x, y))
        {
            return SimpleColor.GRAY;
        }

        if (L1.isPointInside(x, y) && P2.isPointInside(x, y) && P3.isPointInside(x, y) && C1.isPointInside(x, y))
        {
            return SimpleColor.GREEN;
        }

        if (L1.isPointInside(x, y) && P2.isPointInside(x, y) && C1.isPointInside(x, y))
        {
            return SimpleColor.ORANGE;
        }

        if (L1.isPointInside(x, y) && P3.isPointInside(x, y) && C1.isPointInside(x, y))
        {
            return SimpleColor.GRAY;
        }

        if (L1.isPointInside(x, y) && C1.isPointInside(x, y))
        {
            return SimpleColor.BLUE;
        }

        if (P2.isPointInside(x, y) && P3.isPointInside(x, y) && C1.isPointInside(x, y))
        {
            return SimpleColor.YELLOW;
        }

        if (P2.isPointInside(x, y) && C1.isPointInside(x, y))
        {
            return SimpleColor.GRAY;
        }

        if (C1.isPointInside(x, y))
        {
            return SimpleColor.GREEN;
        }

        if (P1.isPointInside(x, y) && P3.isPointInside(x, y))
        {
            return SimpleColor.ORANGE;
        }

        if (P3.isPointInside(x, y) && x > 3)
        {
            return SimpleColor.ORANGE;
        }

        if (P1.isPointInside(x, y))
        {
            return SimpleColor.YELLOW;
        }

        if (P2.isPointInside(x, y) && x < 0)
        {
            return SimpleColor.WHITE;
        }

        if (L1.isPointInside(x, y) && P3.isPointInside(x, y))
        {
            return SimpleColor.BLUE;
        }

        if (L1.isPointInside(x, y))
        {
            return SimpleColor.ORANGE;
        }

        if (P3.isPointInside(x, y))
        {
            return SimpleColor.WHITE;
        }

        if (P2.isPointInside(x, y))
        {
            return SimpleColor.BLUE;
        }

        return SimpleColor.GRAY;
    }
}
