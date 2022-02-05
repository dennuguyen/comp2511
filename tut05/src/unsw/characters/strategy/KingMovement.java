/**
 *
 */
package unsw.characters.strategy;

/**
 * A king can move one square in any direction.
 *
 * @author Robert Clifton-Everest
 *
 */
public class KingMovement implements MoveBehaviour {

    @Override
    public boolean canMove(int dx, int dy) {
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        return (dx == 1 && dy <= 1 || dx <= 1 && dy == 1);
    }

}
