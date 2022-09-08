import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellShould {


    @Test
    public void be_alive() {
        assertTrue(new Cell(true, 0, 0).status);
    }

    @Test
    public void be_dead() {
        assertFalse(new Cell(false, 0, 0).status);
    }

    @Test
    public void change_status_alive_to_dead() {
        Cell cell = new Cell(true, 0, 0);
        cell.changeStatus();
        assertFalse(cell.status);
    }

    @Test
    public void change_status_dead_to_alive() {
        Cell cell = new Cell(false, 0, 0);
        cell.changeStatus();
        assertTrue(cell.status);
    }
}