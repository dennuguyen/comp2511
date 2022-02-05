/**
 *
 */
package unsw.characters.strategy;

/**
 * A troll has a 1 in 6 chance of inflicting 20 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class TrollAttack implements AttackBehaviour {

    @Override
    public void attack(Character victim) {
        if (Math.random() * 6 < 1)
            victim.damage(20);
    }

}
