package Project;

public class Picture {

    public final Line LINE;
    public final Parabola P1;
    public final Parabola P2;
    public final Parabola P3;
    public final Circle CIRCLE;

    public Picture(Line LINE, Parabola P1, Parabola P2, Parabola P3, Circle CIRCLE)
    {
        this.LINE = LINE;
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        this.CIRCLE = CIRCLE;
    }

    public SimpleColor getColor(Point point)
    {
        double x = point.x;
        double y = point.y;

        if (LINE.isPointInside(x, y) && P1.isPointInside(x, y) && P2.isPointInside(x, y) && P3.isPointInside(x, y) &&
                CIRCLE.isPointInside(x, y))
        {
            return SimpleColor.GRAY;
        }

        if (LINE.isPointInside(x, y) && P2.isPointInside(x, y) && P3.isPointInside(x, y) && CIRCLE.isPointInside(x, y))
        {
            return SimpleColor.GREEN;
        }

        if (LINE.isPointInside(x, y) && P2.isPointInside(x, y) && CIRCLE.isPointInside(x, y))
        {
            return SimpleColor.ORANGE;
        }

        if (LINE.isPointInside(x, y) && P3.isPointInside(x, y) && CIRCLE.isPointInside(x, y))
        {
            return SimpleColor.GRAY;
        }

        if (LINE.isPointInside(x, y) && CIRCLE.isPointInside(x, y))
        {
            return SimpleColor.BLUE;
        }

        if (P2.isPointInside(x, y) && P3.isPointInside(x, y) && CIRCLE.isPointInside(x, y))
        {
            return SimpleColor.YELLOW;
        }

        if (P2.isPointInside(x, y) && CIRCLE.isPointInside(x, y))
        {
            return SimpleColor.GRAY;
        }

        if (CIRCLE.isPointInside(x, y))
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

        if (LINE.isPointInside(x, y) && P3.isPointInside(x, y))
        {
            return SimpleColor.BLUE;
        }

        if (LINE.isPointInside(x, y))
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
