package Project;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Picture picture = new Picture(
                new Line(4, -2),
                new Parabola(6.0 / 49, -36.0 / 49, 152.0 / 49),
                new Parabola(-1.0 / 4, -2, -2),
                new Parabola(-1.0 / 8, 5.0 / 4, 7.0 / 8),
                new Circle(-2, 0, 4));

        test(picture);

        if (test(picture)) {
            System.out.println("Test was successful\n");
            startProgram(picture);
        } else {
            System.out.println("Test failed");
        }
    }

    private static void startProgram(Picture picture)
    {
        String restart = "yes";
        String restartGet = "yes";

        while (restart == restartGet.intern())
        {
            double x = readDouble("point coordinate 'x'");
            double y = readDouble("point coordinate 'y'");

            Point point = new Point(x, y);

            SimpleColor color = picture.getColor(point);

            printColor(color, point);

            restartGet = readString();
        }
    }

    private static boolean test(Picture picture)
    {
        boolean check = true;

        TestCase[] testCases = new TestCase[]{new TestCase(3, 0, SimpleColor.BLUE),
                new TestCase(3, 3, SimpleColor.YELLOW), new TestCase(3, 4, SimpleColor.ORANGE),
                new TestCase(0, -5, SimpleColor.GRAY), new TestCase(-3, 3, SimpleColor.GREEN),
                new TestCase(-8, -1, SimpleColor.WHITE)};

        for (int i = 0; i < testCases.length; i++)
        {
            TestCase testing = testCases[i];

            Point point = new Point(testing.getX(), testing.getY());

            SimpleColor color = picture.getColor(point);
            SimpleColor expectedColor = testing.getRightColor();

            printColor(color, point);

            System.out.printf("EXPECTED AREA IS %s\n", expectedColor);

            if (color != expectedColor) {
                check = false;
            }
        }

        return check;
    }

    private static double readDouble(String name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s ", name);
        return scanner.nextDouble();
    }

    private static String readString()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Restart? [yes/no] ");
        return  scanner.next();
    }

    private static void printColor(SimpleColor color, Point point)
    {
        System.out.printf("FOR X = %1$.0f AND Y = %2$.0f IS POINT IN " + color + " AREA \n",
                point.getX(), point.getY());
    }
}
