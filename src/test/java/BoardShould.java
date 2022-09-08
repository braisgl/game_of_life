import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardShould {

    @Test
    public void check_number_of_alive_neighbours(){
        Board board = new Board();
        board.grid[0][0] = new Cell(true);
        board.grid[0][1]=new Cell(true);
        board.grid[1][0]=new Cell(false);
        board.grid[1][1]=new Cell(false);
        Cell cell = board.grid[0][0];
        assertEquals(1, board.aliveNeighbours(cell));
    }
}