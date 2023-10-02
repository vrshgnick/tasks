package ru.vsu.cs.vereschagin;

public class Line {
    public double b;
    public double k;

    public Line(double b, double k) {
        this.b = b;
        this.k = k;
    }

    public boolean isPointAboveLine(double x, double y) {
        return y > k * x + b;
    }
}