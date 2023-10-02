package ru.vsu.cs.vereschagin;

public class Tests {
    public static void printColorForPoint (double x, double y) {
        System.out.printf("(%.3f, %.3f) - %s%n", x, y, Solution.getColor(x, y));
    }
    public static void test1() {

        printColorForPoint(-0.5, -2.5); // orange
        printColorForPoint(-3.5, 1); // green
        printColorForPoint(-2, -3); // green
        printColorForPoint(-8, -2); //green
        printColorForPoint(-1, 4); // blue
        printColorForPoint(4, 9); // blue
        printColorForPoint(-3.5, -0.5); // blue
        printColorForPoint(-1.8, -1.1); // white
    }
}


