public class Board {


    public static Cell topLeftNeighbour;

    private enum Positions {
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

    public Board() {
        grid = new Cell[10][10];
    }

    public int aliveNeighbours(Cell cell) {
        int alive = 0;
        Cell[] neighbours = getNeighbours(cell);

        for (Cell neighbour : neighbours) {
            if (neighbour.status) {
                alive++;
            }
        }
        return alive;
    }

    private Cell[] getNeighbours(Cell cell) {

        Cell[] neighbours = new Cell[8];

        neighbours[0] = grid[cell.x - 1][cell.y - 1];
        neighbours[1] = grid[cell.x][cell.y - 1];
        neighbours[2] = grid[cell.x + 1][cell.y - 1];
        neighbours[3] = grid[cell.x - 1][cell.y];
        neighbours[4] = grid[cell.x + 1][cell.y];
        neighbours[5] = grid[cell.x - 1][cell.y + 1];
        neighbours[6] = grid[cell.x][cell.y + 1];
        neighbours[7] = grid[cell.x + 1][cell.y + 1];
        return neighbours;
    }

}
