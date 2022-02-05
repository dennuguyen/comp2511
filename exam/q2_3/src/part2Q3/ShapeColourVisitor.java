package part2Q3;

import java.awt.Color;

public class ShapeColourVisitor implements ShapeVisitor {

    public ShapeColourVisitor() {
    }

    @Override
    public void visit(ShapeVisitable v) {
        if (v instanceof Circle)
            ((Circle) v).setColour(Color.RED);
        else if (v instanceof Rectangle)
            ((Rectangle) v).setColour(Color.GREEN);
        else if (v instanceof Triangle)
            ((Triangle) v).setColour(Color.BLUE);
    }
}
