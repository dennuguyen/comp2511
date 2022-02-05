package unsw.characters.strategy;

public interface AttackBehaviour {
    /**
     * Attacks the given victim, causing them damage according to rules given by
     * this behaviour.
     *
     * @param victim
     */
    public void attack(Character victim);
}
