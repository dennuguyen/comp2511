/**
 *
 */
package unsw.characters.strategy;

/**
 * A knight has a 1 in 2 chance of inflicting 10 points of damage when
 * attacking.
 *
 * @author Robert Clifton-Everest
 *
 */
public class KnightAttack implements AttackBehaviour {

    @Override
    public void attack(Character victim) {
        if (Math.random() > 0.5)
            victim.damage(10);
    }

}
