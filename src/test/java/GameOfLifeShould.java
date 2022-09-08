import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLifeShould {

    @Test
    public void cell_dies_by_underpopulation(){
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.board.grid[0][0]=new Cell(true);
        gameOfLife.board.grid[0][1]=new Cell(false);
        gameOfLife.board.grid[1][0]=new Cell(false);
        gameOfLife.board.grid[1][1]=new Cell(false);
        gameOfLife.nextGen();
        Assertions.assertEquals(false,gameOfLife.board.grid[0][0].status);
    }



}
