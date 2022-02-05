package part2Q3;

import java.awt.Color;

public class ShapeColourAreaVisitor implements ShapeVisitor {

    private double totalArea;
    private Color colour;

    public ShapeColourAreaVisitor(Color colour) {
        this.totalArea = 0;
        this.colour = colour;
    }

    public double getTotalArea() {
        return this.totalArea;
    }

    public Color getColour() {
        return this.colour;
    }

    @Override
    public void visit(ShapeVisitable v) {
        ((Shape) v).setColour(this.colour);
        if (v instanceof Circle && ((Circle) v).getColour().equals(Color.RED))
            this.totalArea = ((Circle) v).area();
        else if (v instanceof Rectangle && ((Rectangle) v).getColour().equals(Color.GREEN))
            this.totalArea = ((Rectangle) v).area();
        else if (v instanceof Triangle && ((Triangle) v).getColour().equals(Color.BLUE))
            this.totalArea = ((Triangle) v).area();
    }
}
