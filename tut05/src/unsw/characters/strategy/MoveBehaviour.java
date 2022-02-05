package unsw.characters.strategy;

public interface MoveBehaviour {

    /**
     * Is movement by the given amount along the x and y axes allowed.
     *
     * @param x
     * @param y
     * @return True if movement is allowed, false otherwise
     */
    public boolean canMove(int dx, int dy);

}
