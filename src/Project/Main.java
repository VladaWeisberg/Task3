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

        test(picture);

        startProgram(picture);
    }

    private static void startProgram(Picture picture)
    {
        double restart = 1;

        while (restart == 1)
        {
            double x = readDouble("point coordinate 'x'");
            double y = readDouble("point coordinate 'y'");

            Point point = new Point(x, y);

            SimpleColor color = picture.getColor(point);

            printColor(color, point);

            restart = readDouble("number 1 if you want to input new coordinates");
        }
    }

    private static void test(Picture picture)
    {
        Point [] coordinate = new Point[6];
            coordinate[0] = new Point(3, 0);
            coordinate[1] = new Point(3, 3);
            coordinate[2] = new Point(3, 4);
            coordinate[3] = new Point(0, -5);
            coordinate[4] = new Point(-3, 3);
            coordinate[5] = new Point(-8, -1);

        for (int i = 0; i < 6; i++)
        {
            SimpleColor color = picture.getColor(coordinate[i]);

            printColor(color, coordinate[i]);

            SimpleColor rightColor = null;

            switch (i)
            {
                case(0):
                    rightColor = SimpleColor.BLUE;
                    break;
                case(1):
                    rightColor = SimpleColor.YELLOW;
                    break;
                case(2):
                    rightColor = SimpleColor.ORANGE;
                    break;
                case(3):
                    rightColor = SimpleColor.GRAY;
                    break;
                case(4):
                    rightColor = SimpleColor.GREEN;
                    break;
                case(5):
                    rightColor = SimpleColor.WHITE;
                    break;
            }

            System.out.printf("%s\n", checkResult(color, rightColor));
        }
    }

    private static double readDouble(String name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s ", name);
        return scanner.nextDouble();
    }

    private static void printColor(SimpleColor color, Point point)
    {
        System.out.printf("FOR X = %1$.0f AND Y = %2$.0f IS POINT IN " + color + " AREA \n",
                            point.getX(), point.getY());
    }

    private static boolean checkResult(SimpleColor color, SimpleColor rightColor)
    {
        return color == rightColor;
    }
}
