package Project; //96

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        test();

        double restart = 1;

        while (restart == 1)
        {
            double x = readDouble("point coordinate 'x'");
            double y = readDouble("point coordinate 'y'");

            print(x, y);

            restart = readDouble("number 1 if you want to input coordinates");
        }
    }

    public static void test()
    {
        double [] coordinateX = {3, 3, 3, 0, -3, -8};
        double [] coordinateY = {0, 3, 4, -5, -3, 0};

        int i = 0;

        while (i < 6)
        {
            print(coordinateX[i], coordinateY[i]);

            i++;
        }
    }

    public static double readDouble(String name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s ", name);
        return scanner.nextDouble();
    }

    public static void print(double x, double y)
    {
        System.out.printf("FOR X = %1$.0f AND Y = %2$.0f IS POINT IN " + Program.getColor(x, y) + " AREA\n", x, y);
    }

}
