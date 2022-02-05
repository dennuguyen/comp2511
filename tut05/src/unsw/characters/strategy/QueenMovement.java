/**
 *
 */
package unsw.characters.strategy;

/**
 * The Queen can move to any square in the same column, row or diagonal as she
 * is currently on.
 *
 * @author Robert Clifton-Everest
 *
 */
public class QueenMovement implements MoveBehaviour {

    @Override
    public boolean canMove(int dx, int dy) {
        return (dx == 0 || dy == 0 || Math.abs(dx) == Math.abs(dy));
    }

}
