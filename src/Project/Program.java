package Project;

public class Program
{
    public static final Line LINE = new Line(4, -2);
    public static final Parabola P1 = new Parabola(6.0/49, -36.0/49, 152.0/49);
    public static final Parabola P2 = new Parabola(-1.0/4, -2, -2);
    public static final Parabola P3 = new Parabola(-1.0/8, 5.0/4, 7.0/8);
    public static final Circle CIRCLE = new Circle(-2, 0, 4);

    public static SimpleColor getColor(double x, double y)
    {
        if (LINE.isPointInside(x, y) && P1.isPointInside(x, y) && P2.isPointInside(x, y) && P3.isPointInside(x, y) && CIRCLE.isPointInside(x, y))
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