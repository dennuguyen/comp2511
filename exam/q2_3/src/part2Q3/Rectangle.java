package part2Q3;

import java.awt.Color;

public class Rectangle extends Shape implements ShapeVisitable {

    private int length, width;

    public Rectangle(int length, int width, Color colour) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void accept(ShapeVisitor v) {
        v.visit(this);
    }
}
