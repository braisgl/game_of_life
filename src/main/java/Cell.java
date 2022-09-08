public class Cell {

    public boolean status;

    public int x;
    public int y;

    public Cell(boolean status,int x, int y) {
        this.status = status;
        this.x=x;
        this.y=y;
    }

    public void changeStatus() {
        status = !status;
    }



}
