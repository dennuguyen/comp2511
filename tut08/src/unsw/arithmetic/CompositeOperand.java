/**
 *
 */
package unsw.arithmetic;

/**
 * @author Robert Clifton-Everest
 *
 */
public class CompositeOperand implements ArithmeticExpression {

    public enum Operator{
        PLUS,
        TIMES,
        MINUS,
        DIVIDE,
    }

    private Operator operator;
    private ArithmeticExpression left, right;

    public CompositeOperand(Operator operator, ArithmeticExpression left, ArithmeticExpression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        int l = left.evaluate();
        int r = right.evaluate();
        switch (operator) {
        case PLUS:
            return l + r;
        case TIMES:
            return l * r;
        case MINUS:
            return l - r;
        case DIVIDE:
            return l / r;
        default:
            return 0; //Unreachable unless operator is null
        }
    }

}
