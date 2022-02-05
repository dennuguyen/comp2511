package unsw.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import unsw.automata.GameOfLife;

public class TickTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testTick() {
        GameOfLife gol = new GameOfLife();

        // Create a glider toward the bottom-right corner
        gol.ensureAlive(9, 8);
        gol.ensureAlive(8, 8);
        gol.ensureAlive(7, 8);
        gol.ensureAlive(9, 7);
        gol.ensureAlive(8, 6);

        gol.tick();
        assertEquals(true, gol.isAlive(9, 8));
        assertEquals(true, gol.isAlive(8, 8));
        assertEquals(true, gol.isAlive(8, 9));
        assertEquals(true, gol.isAlive(7, 7));
        assertEquals(true, gol.isAlive(9, 7));

        assertEquals(false, gol.isAlive(7, 8));
        assertEquals(false, gol.isAlive(8, 6));

        gol.tick();
        assertEquals(true, gol.isAlive(9, 8));
        assertEquals(true, gol.isAlive(8, 9));
        assertEquals(true, gol.isAlive(9, 9));
        assertEquals(true, gol.isAlive(7, 8));
        assertEquals(true, gol.isAlive(9, 7));

        // Check to see it wraps around horizontally
        gol.tick();
        assertEquals(true, gol.isAlive(0, 8));

        // Check to see it wraps around vertically
        gol.tick();
        gol.tick();
        assertEquals(true, gol.isAlive(9, 0));
    }

    @Test
    public void testObservation() {
        GameOfLife gol = new GameOfLife();

        gol.cellProperty(0, 0).addListener(new ChangeListener<Boolean>() {

            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                    Boolean newValue) {
                alive = newValue;
            }

        });

        // In the next generation after this seed the cell at (0,0) should be
        // alive
        gol.ensureAlive(1, 0);
        gol.ensureAlive(1, 1);
        gol.ensureAlive(0, 1);

        gol.tick();

        assertEquals(true, alive);
    }

    private boolean alive = false;
}
