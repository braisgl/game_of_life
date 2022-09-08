import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellShould {


    @Test
    public void be_alive(){
        Assertions.assertEquals(true, new Cell().status() );
    }

    @Test
    public void be_dead(){


        Assertions.assertEquals(false, new Cell().status() );
    }

}