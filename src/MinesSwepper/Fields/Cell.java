package MinesSwepper.Fields;

public  class Cell {
    private boolean visibility = false;
    private boolean isFlagged = false;
    private int row;
    private int col;
    public String defaultCell = "[ ]";
    public String signFlag = " F ";
    public String symbol;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
    }

    public String getSymbol() {
        if(isVisibility()){
            return this.symbol;
        }else if(isFlagged()){
            return signFlag;
        }else{
            return defaultCell;
        }
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        if(this.visibility){
            System.out.println("Already open/cant close");
            return;
        }
        this.visibility = visibility;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        if(this.visibility){
            System.out.println("Already open/cant unflag");
            return;
        }
        isFlagged = flagged;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setMinesAround(int i) {
    }
}
