/**
 * Conway's Game of Life on a 10x10 grid.
 */
package unsw.automata;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class GameOfLife {

    public static final boolean ALIVE = true;
    public static final boolean DEAD = false;
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;
    private boolean[][] cells;
    private BooleanProperty[][] beans;

    public GameOfLife() {
        this.cells = new boolean[WIDTH][HEIGHT]; // all values false by default
        this.beans = new BooleanProperty[WIDTH][HEIGHT];
        for (int i = 0; i < WIDTH; i++)
            for (int j = 0; j < HEIGHT; j++)
                this.beans[i][j] = new SimpleBooleanProperty();
    }

    public GameOfLife(GameOfLife obj) {
        this();
        for (int i = 0; i < WIDTH; i++)
            for (int j = 0; j < HEIGHT; j++) {
                this.cells[i][j] = obj.cells[i][j];
                this.beans[i][j].set(obj.isAlive(i, j));
            }
    }

    public void ensureAlive(int x, int y) {
        this.cells[x % WIDTH][y % HEIGHT] = ALIVE;
        this.beans[x % WIDTH][y % HEIGHT].set(ALIVE);
    }

    public void ensureDead(int x, int y) {
        this.cells[x % WIDTH][y % HEIGHT] = DEAD;
        this.beans[x % WIDTH][y % HEIGHT].set(DEAD);
    }

    public boolean isAlive(int x, int y) {
        return this.cells[x % WIDTH][y % WIDTH] == ALIVE;
        // return this.beans[x % WIDTH][y % WIDTH].get();
    }

    public void tick() {
        GameOfLife old = new GameOfLife(this);
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                int n = old.getAliveNeighbours(i, j);
                if (isAlive(i, j) == true) {
                    if (n == 2 || n == 3)
                        ensureAlive(i, j);
                    else
                        ensureDead(i, j);
                } else {
                    if (n == 3)
                        ensureAlive(i, j);
                    else
                        ensureDead(i, j);
                }
            }
        }
    }

    private int getAliveNeighbours(int x, int y) {
        int numAlive = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (isAlive(x + i + WIDTH, y + j + HEIGHT) == true)
                    numAlive++;
            }
        }
        return numAlive;
    }

    public void print() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                System.out.print(isAlive(i, j) ? "#" : ".");
            }
            System.out.println();
        }
        System.out.println();
    }

    public BooleanProperty cellProperty(int x, int y) {
        return this.beans[x][y];
    }

}
