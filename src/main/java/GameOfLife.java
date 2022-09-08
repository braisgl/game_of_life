public class GameOfLife {

    Board board;
    public GameOfLife(){
        this.board = new Board();
    }

    public void nextGen(){
        board.grid[0][0].changeStatus();
    }



}
