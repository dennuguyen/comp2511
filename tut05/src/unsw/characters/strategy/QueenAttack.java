/**
 *
 */
package unsw.characters.strategy;

/**
 * A queen has a 1 in 3 chance of inflicting 12 points of damage or a 2 out of 3
 * chance of inflicting 6 points of damage
 *
 * @author Robert Clifton-Everest
 *
 */
public class QueenAttack implements AttackBehaviour {

    @Override
    public void attack(Character victim) {
        if (Math.random() * 3 < 1)
            victim.damage(12);
        else
            victim.damage(6);
    }

}
