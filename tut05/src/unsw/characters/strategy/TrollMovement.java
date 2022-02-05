/**
 *
 */
package unsw.characters.strategy;

/**
 * A Troll can only move up, down, left or right.
 *
 * @author Robert Clifton-Everest
 *
 */
public class TrollMovement implements MoveBehaviour {

    @Override
    public boolean canMove(int dx, int dy) {
        dx = Math.abs(dx);
        dy = Math.abs(dy);

        return (dx == 1 && dy == 0 || dx == 0 && dy == 1);
    }

}
