package MinesSwepper.Fields;

public class Pointer extends Cell{

    public Pointer(int row, int col) {
        super(row, col);

    }
    @Override
    public void setMinesAround(int minesAround) {
        if(minesAround==0){
            super.symbol = " _ ";
        }else{
            super.symbol = " "+minesAround+" ";
        }
    }
}
