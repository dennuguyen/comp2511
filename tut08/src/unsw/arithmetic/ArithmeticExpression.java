/**
 *
 */
package unsw.arithmetic;

import unsw.arithmetic.CompositeOperand.Operator;

/**
 * A parsed arithmetic expression. The different methods allow for the
 * construction of various operators where this expression is the left operand
 * the given expression is the right operand.
 *
 * @author Robert Clifton-Everest
 *
 */
public interface ArithmeticExpression {

    public default ArithmeticExpression plus(ArithmeticExpression rightOperand) {
        return new CompositeOperand(Operator.PLUS, this, rightOperand);
    }

    public default ArithmeticExpression times(ArithmeticExpression rightOperand) {
        return new CompositeOperand(Operator.TIMES, this, rightOperand);
    }

    public default ArithmeticExpression minus(ArithmeticExpression rightOperand) {
        return new CompositeOperand(Operator.MINUS, this, rightOperand);
    }

    public default ArithmeticExpression divide(ArithmeticExpression rightOperand) {
        return new CompositeOperand(Operator.DIVIDE, this, rightOperand);
    }

    /**
     * Compute the result of this expression.
     * @return
     */
    public int evaluate();
}
