import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLifeShould {

    @Test
    public void cell_dies_by_underpopulation(){
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.board.grid[0][0].status=true;
        gameOfLife.board.grid[0][1].status=false;
        gameOfLife.board.grid[1][0].status=false;
        gameOfLife.board.grid[1][1].status=false;
        gameOfLife.nextGen();
        Assertions.assertEquals(false,gameOfLife.board.grid[0][0].status);
    }

}
