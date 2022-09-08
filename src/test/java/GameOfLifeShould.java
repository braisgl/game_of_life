import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLifeShould {

    public GameOfLife gameOfLife;
    @Test
    public void is_cell_alive(){
        Assertions.assertEquals(true,gameOfLife.nextGen());
    }
}
