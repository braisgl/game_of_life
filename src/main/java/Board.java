public class Board {


    public static Cell topLeftNeighbour;

    private enum Positions{
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public Cell[][] grid;
    public Board(){
        grid = new Cell[10][10];
    }

    public int aliveNeighbours(Cell cell) {
    /*int alive = 0;
        Cell[] neighbours = getNeighbours(cell);
        for (Cell neighbour:neighbours) {
            if(neighbour.status){
                alive++;
            }
        }
        return alive;*/
        int count = 0;
        if (topLeftNeighbour.status) {
            count += 1;
        }
        return count;
    }

    private Cell[] getNeighbours(Cell cell) {
    /*Cell[] neighbours = new Cell[9];
    int position=0;
        for (int i = cell.x-1; i <=cell.x+1 ; i++) {
            neighbours[position]=grid[i][cell.y-1];
            if(i!=cell.x){
                neighbours[position+1]=grid[i][cell.y];
            }
            neighbours[position+2]=grid[i][cell.y+1];
            position+=3;
        }
        return neighbours;
     */
        int topLeftX = cell.x - 1;
        int topLeftY = cell.y - 1;
        topLeftNeighbour = grid[topLeftX][topLeftY];

        return null;
    }

}
