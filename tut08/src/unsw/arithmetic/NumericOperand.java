/**
 *
 */
package unsw.arithmetic;

/**
 * @author Robert Clifton-Everest
 *
 */
public class NumericOperand implements ArithmeticExpression {

    private int n;

    public NumericOperand(int n) {
        this.n = n;
    }

    @Override
    public int evaluate() {
        return n;
    }

}
