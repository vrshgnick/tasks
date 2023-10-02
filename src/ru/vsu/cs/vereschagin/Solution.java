package ru.vsu.cs.vereschagin;

public class Solution {
    public static final Parabola RIGHT_PARABOLA = new Parabola(-4, 0, 1);
    public static final Line LINE = new Line(-4, -2);
    public static final Rectangle RECTANGLE = new Rectangle(-3, -4, 0, 0);

    public static SimpleColor getColor(double x, double y) {
    if (!RIGHT_PARABOLA.isPointRightOfParabola(x,y) && !LINE.isPointAboveLine(x,y)) {
        return SimpleColor.GREEN;
        }if (!LINE.isPointAboveLine(x, y) && RECTANGLE.isPointInsideRectangle(x, y) &&
                RIGHT_PARABOLA.isPointRightOfParabola(x, y)) {
            return SimpleColor.WHITE;
        }if (LINE.isPointAboveLine(x, y) && RECTANGLE.isPointInsideRectangle(x, y) &&
                RIGHT_PARABOLA.isPointRightOfParabola(x, y) && y > -2) {
            return SimpleColor.GREEN;
        }if (LINE.isPointAboveLine(x, y) && RECTANGLE.isPointInsideRectangle(x, y) &&
                !RIGHT_PARABOLA.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }if (RIGHT_PARABOLA.isPointRightOfParabola(x,y)) {
            return SimpleColor.BLUE;
        }if (LINE.isPointAboveLine(x,y) && y > 0) {
            return SimpleColor.BLUE;
        }return SimpleColor.GREEN;
    }
}