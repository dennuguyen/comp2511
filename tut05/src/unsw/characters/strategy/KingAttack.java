/**
 *
 */
package unsw.characters.strategy;

/**
 * A king always causes 8 points of damage when attacking
 *
 * @author Robert Clifton-Everest
 *
 */
public class KingAttack implements AttackBehaviour {

    @Override
    public void attack(Character victim) {
        victim.damage(8);
    }

}
