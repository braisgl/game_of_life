public class Cell {

    public boolean status;

    public Cell(boolean status) {
        this.status = status;
    }

    public void changeStatus() {
        status = !status;
    }



}
