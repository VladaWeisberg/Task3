package Project; //96

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Picture picture = new Picture(
                new Line(4, -2),
                new Parabola(6.0/49, -36.0/49, 152.0/49),
                new Parabola(-1.0/4, -2, -2),
                new Parabola(-1.0/8, 5.0/4, 7.0/8),
                new Circle(-2, 0, 4));

        test();

        double restart = 1;

        while (restart == 1)
        {
            double x = readDouble("point coordinate 'x'");
            double y = readDouble("point coordinate 'y'");

            Point point = new Point(x, y);

            print(point, picture);

            restart = readDouble("number 1 if you want to input new coordinates");
        }
    }

    public static void test()
    {
        Point [] coordinate = new Point[6];
            coordinate[0] = new Point(3, 0);
            coordinate[1] = new Point(3, 3);
            coordinate[2] = new Point(3, 4);
            coordinate[3] = new Point(0, -5);
            coordinate[4] = new Point(-3, 3);
            coordinate[5] = new Point(-8, -1);

        Picture picture = new Picture(
                new Line(4, -2),
                new Parabola(6.0/49, -36.0/49, 152.0/49),
                new Parabola(-1.0/4, -2, -2),
                new Parabola(-1.0/8, 5.0/4, 7.0/8),
                new Circle(-2, 0, 4));

        for (int i = 0; i < 6; i++)
        {
            print(coordinate[i], picture);

            SimpleColor color = SimpleColor.BLUE;

            switch (i)
            {
                case(0):
                    color = SimpleColor.BLUE;
                    break;
                case(1):
                    color = SimpleColor.YELLOW;
                    break;
                case(2):
                    color = SimpleColor.ORANGE;
                    break;
                case(3):
                    color = SimpleColor.GRAY;
                    break;
                case(4):
                    color = SimpleColor.GREEN;
                    break;
                case(5):
                    color = SimpleColor.WHITE;
                    break;
            }

            System.out.printf("%s\n", checkResult(picture.getColor(coordinate[i]), color));
        }
    }

    public static double readDouble(String name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s ", name);
        return scanner.nextDouble();
    }

    public static void print(Point point, Picture picture)
    {
        System.out.printf("FOR X = %1$.0f AND Y = %2$.0f IS POINT IN " + picture.getColor(point) + " AREA \n",
        point.x, point.y);
    }

    public static boolean checkResult(SimpleColor color, SimpleColor rightColor)
    {
        return color == rightColor;
    }
}
