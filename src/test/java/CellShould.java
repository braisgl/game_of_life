import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellShould {


    @Test
    public void be_alive(){
        assertTrue(new Cell(true).status);
    }

    @Test
    public void be_dead(){
        assertFalse(new Cell(false).status);
    }

    @Test
    public void change_status_alive_to_dead(){
        Cell cell = new Cell(true);
        cell.changeStatus();
        assertFalse(cell.status);
    }

    @Test
    public void change_status_dead_to_alive(){
        Cell cell = new Cell(false);
        cell.changeStatus();
        assertTrue(cell.status);
    }
}