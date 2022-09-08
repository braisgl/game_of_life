import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardShould {

    @Test
    public void check_number_of_alive_neighbours(){
        Board board = new Board();
        board.grid[0][0] = new Cell(true,0,0);
        board.grid[0][1]=new Cell(true,0,1);
        board.grid[0][2]=new Cell(false,0,2);
        board.grid[1][0]=new Cell(false,1,0);

        Cell cell = new Cell(false,1,1);
        board.grid[1][1]=cell;

        board.grid[1][2]=new Cell(false,1,2);
        board.grid[2][0]=new Cell(false,2,0);
        board.grid[2][1]=new Cell(false,2,1);
        board.grid[2][2]=new Cell(false,2,2);
        assertEquals(1, board.aliveNeighbours(cell));
    }
}