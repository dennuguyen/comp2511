/**
 *
 */
package unsw.characters.strategy;

/**
 * A knight can move like a knight in chess (in an L shape).
 *
 * @author Robert Clifton-Everest
 *
 */
public class KnightMovement implements MoveBehaviour {

    @Override
    public boolean canMove(int dx, int dy) {
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        return (dx == 1 && dy == 2 || dx == 2 && dy == 1);
    }

}
