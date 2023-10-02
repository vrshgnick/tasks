package ru.vsu.cs.vereschagin;

import java.util.Locale;
import java.util.Scanner;

import static ru.vsu.cs.vereschagin.Tests.printColorForPoint;
import static ru.vsu.cs.vereschagin.Tests.test1;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        test1();

        System.out.print("Input х:");
        double x = readNumber();

        System.out.print("Input y:");
        double y = readNumber();

        printColorForPoint(x, y);
    }

    public static double readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}